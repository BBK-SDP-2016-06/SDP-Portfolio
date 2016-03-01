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
    protected ArrayList<Integer> operands; //stores a list of registers from machine m whose values will be involved with operation
    protected int targetRegister; //reference to the register that the computation will be stored in

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

    /**
     * Sets this targetRegister field. The target register holds a reference to a register of a
     * particular machine whose value will be updated / printed / checked as a result of this
     * instruction.
     *
     * @param register the register identification integer that the targetRegister field will point to.
     *                 This integer must be between 0 and 31
     */
    public void setTargetRegister(int register) {
        try {
            if(isRegisterValid(register)) {
                targetRegister = register;
            }
        } catch (IllegalArgumentException iaE) {
            System.out.println("Target register is invalid. Register number must be between 0 and 31");
            iaE.printStackTrace();
            System.exit(-1);
        }
    }

    /**
     * Initialises the operands field by converting the arguments to an ArrayList of type Integer.
     *
     * @param registers the registers whose integer identifier will be stored in operands. All integers
     *                  passed to this method must be between 0 and 31.
     */
    public void populateOperandRegisters(int...registers) {
        try {
            operands = new ArrayList<>();
            for(int i : registers) {
                if(isRegisterValid(i)) {
                    operands.add(i);
                }
            }
        } catch (IllegalArgumentException iaE) {
            System.out.println("Operand register is invalid. Register number must be between 0 and 31");
            iaE.printStackTrace();
            System.exit(-1);
        }
    }

    /**
     * Retrieves the values held within the registers that are stored in this operands field.
     *
     * @param m the machine that contains the registers that this instruction will act upon.
     * @return the values stored within the operand registers.
     */
    public int[] getValues(Machine m) {
        int[] values = new int[operands.size()];
        for(int i = 0; i < values.length; i++) {
            values[i] = m.getRegisters().getRegister(operands.get(i));
        }
        return values;
    }

    /**
     * Determines the format of the string printed to the console describing an arithmetic expression involving
     * two operands and a target register to store the resulting computation.
     *
     * @param operator the operator of the computation: + - / *
     * @return the formatted string that will be passed to subsequent overridden toString methods in the subclasses
     */
    public String mathString(String operator) {
        return " " + " " + operands.get(0) + " " + operator + " " + operands.get(1) + " to " + targetRegister;
    }

    /**
     * Tests whether the registers specified in the SML program are correct. Their integer identification value
     * must be between 0 and 31 since an SML machine only holds a maximum of 32 registers.
     *
     * @throws IllegalArgumentException if the register is invalid
     * @param register the register whose identification value is to be tested
     * @return true if the register number is valid
     */
    private boolean isRegisterValid(int register) {
        if(register < 0 || register > 31) {
            throw new IllegalArgumentException("Invalid register number.");
        } else {
            return true;
        }
    }
}
