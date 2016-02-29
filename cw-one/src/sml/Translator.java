package sml;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This class represents a translator of an SML program.
 */
public class Translator {

    private static final String PATH = "C:\\Users\\George\\Documents\\Computer Science" +
                                       "\\05 - Software Design and Programming\\SDP-Portfolio\\cw-one\\src\\testing\\";
    private String line = "";               //Represents the current line being scanned
    private Labels labels;                  // The labels of the program being translated
    private ArrayList<Instruction> program; // The program to be created
    private String fileName;                // source file of SML code

    /**
     * Initialises this fileName to the absolute root of the file to be translated.
     *
     * @param fileName the name of the SML file to be translated. This should be provided
     *                 in the form name.sml
     */
    public Translator(String fileName) {
        this.fileName = PATH + fileName;
    }

    /**
     * Translates the small program in the file into a series of labels and instructions.
     * The code in this method has also been amended in that an error is thrown and dealt
     * with if the program contains duplicate labels (line identifiers).
     *
     * @param lab labels of the program
     * @param prog a list of instructions
     * @return true if the entire program is read and translated correctly, false if any errors
     * were detected in terms of IO or syntax of the written program.
     */
    public boolean readAndTranslate(Labels lab, ArrayList<Instruction> prog) {

        try (Scanner sc = new Scanner(new File(fileName))) {
            // Scanner attached to the file chosen by the user
            labels = lab;
            labels.reset();
            program = prog;
            program.clear();

            try {
                line = sc.nextLine();
            } catch (NoSuchElementException ioE) {
                return false;
            }

            // Each iteration processes line and reads the next line into line
            while (line != null) {
                // Store the label in label
                String label = scan();

                if (label.length() > 0) {
                    if(labels.indexOf(label) != -1) {
                        throw new IllegalArgumentException("Duplicate labels found in " + fileName);
                    }
                    Instruction ins = getInstruction(label);
                    if (ins != null) {
                        labels.addLabel(label);
                        program.add(ins);
                    }
                }

                try {
                    line = sc.nextLine();
                } catch (NoSuchElementException ioE) {
                    return false;
                }
            }
        } catch (IOException ioE) {
            System.out.println("File: IO error " + ioE.getMessage());
            System.exit(-1);
            return false;
        } catch (IllegalArgumentException iaE) {
            iaE.printStackTrace();
            System.exit(-1);
            return false;
        }
        return true;
    }

    /**
     * From the string currently stored in this line, this method translates the remaining
     * SML statement into an instruction and returns this in the form of an Instruction object.
     * This method uses java reflection to infer the type of instruction object that should be created
     * based upon the next word in the statement scanned. This enables our SML language to be extended
     * with further subclasses of instruction without changing this code.
     *
     * @param label the identifier that corresponds to the instruction to be translated and retrieved.
     * @return the instruction that this label corresponds to. The instruction is returned in a state
     * ready to be executed by the machine.
     */
    public Instruction getInstruction(String label) {
        if (line.equals("")) {
            return null;
        }

        String ins = scan();
        String packageName = this.getClass().getPackage().getName();
        String className = packageName + "." + ins.substring(0, 1).toUpperCase() + ins.substring(1) + "Instruction";

        try {
            Class c = Class.forName(className);
            Constructor ctor = c.getConstructors()[0];
            Class[] parameterTypes = ctor.getParameterTypes();
            int numberOfParams = ctor.getParameterCount();
            Object[] args = new Object[numberOfParams];
            args[0] = label;

            for(int i = 1; i < args.length; i++) {
                if(parameterTypes[i] == int.class) {
                    args[i] = scanInt();
                } else {
                    args[i] = scan();
                }
            }

            return (Instruction) ctor.newInstance(args);

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            System.exit(-1);
            return null;
        }
    }

    /**
     * This method returns the first word of the current line and removes it from the
     * program line.
     *
     * @return the first word of the current line. If there is no word, an empty string
     * is returned "".
     */
    private String scan() {
        line = line.trim();
        if (line.length() == 0)
            return "";

        int i = 0;
        while (i < line.length() && line.charAt(i) != ' ' && line.charAt(i) != '\t') {
            i = i + 1;
        }
        String word = line.substring(0, i);
        line = line.substring(i);
        return word;
    }

    /**
     * Returns the first word of the current line as an integer and removes it from
     * the program line.
     *
     * @return the first word of the current line as an integer. If there is no word
     * or an error, the maximum integer is returned.
     */
    private int scanInt() {
        String word = scan();
        if (word.length() == 0) {
            return Integer.MAX_VALUE;
        }

        try {
            return Integer.parseInt(word);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }
}