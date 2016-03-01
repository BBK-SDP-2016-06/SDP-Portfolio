package sml;

import java.util.ArrayList;

/**
 * This class is the superclass of the classes for machine instructions. It holds the
 * fields that are common across all instructions that are implemented by the Simple
 * Machine Language (SML): a label and an opcode.
 *
 * @author George Shiangoli
 */

public abstract class Instruction {

    protected String label;
    protected String opcode;
    protected ArrayList<Integer> operands;
    protected int targetRegister;

    /**
     * The primary constructor that gets called by all instruction subclasses. It
     * instantiates both the label and opcode of each Instruction.
     *
     * @param l the label of the instruction. This is an identifier that can take the
     *          form of any sequence of non-whitespace characters.
     * @param op the opcode of the instruction, currently limited to "add", "sub", "mul",
     *           "div", "out", "lin" and "bnz" i.e. the abbreviated terms of all instructions
     *           accepted the SML.
     */
    public Instruction(String l, String op) {
        this.label = l;
        this.opcode = op;
    }

    /**
     * Determines the format of the println representation of this and all implemented subclasses.
     *
     * @return a string of the format "label: opcode" of this instruction. This string subsequently
     * gets built upon by subclasses extending this superclass.
     */
    @Override
    public String toString() {
        return label + ": " + opcode;
    }

    /**
     * Executes this Instruction on machine m.
     * @param m the machine that this instruction gets executed upon.
     */
    public abstract void execute(Machine m);

    public void setTargetRegister(int register) {
        targetRegister = register;
    }

    public void populateOperandRegisters(int...registers) {
        operands = new ArrayList<>();
        for(int i : registers) {
            operands.add(i);
        }
    }

    public int[] getValues(Machine m) {
        int[] values = new int[operands.size()];
        for(int i = 0; i < values.length; i++) {
            values[i] = m.getRegisters().getRegister(operands.get(i));
        }
        return values;
    }

    public String mathString(String operator) {
        return " " + " " + operands.get(0) + " " + operator + " " + operands.get(1) + " to " + targetRegister;
    }
}
