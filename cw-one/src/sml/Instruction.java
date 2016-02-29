package sml;

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
}
