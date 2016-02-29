package sml;

/**
 * This class represents the "div" instruction as interpreted by the Simple
 * Machine Language (SML). The instruction is of the format:
 * ID div R O1 O2
 * where the ID is the line identifier within the program, R is the register
 * that the result will be stored in, and O1 and O2 hold the operands that will
 * be involved in the operation.
 *
 * This class extends the abstract class Instruction.
 *
 * @author George Shiangoli
 */
public class DivInstruction extends Instruction {

    private int result;
    private int op1;
    private int op2;

    /**
     * The primary constructor of this class calls the constructor of the extended
     * abstract class Instruction to initially set the label and opcode parameters.
     * The constructor also initialises the local fields result, op1 and op2.
     *
     * @param label the label of the instruction. This is an identifier that can take the
     *              form of any sequence of non-whitespace characters.
     * @param result the target register that the resulting computation of this instruction
     *               will be stored.
     * @param op1 the first register whose value will be involved in the computation of this
     *            instruction.
     * @param op2 the second register whose value will be involved in the computation of this
     *            instruction.
     */
    public DivInstruction(String label, int result, int op1, int op2) {
        super(label, "div");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    /**
     * Executes this Instruction on machine m. The instruction divides the value found in
     * register op1 by the value from register op2.
     *
     * @param m the machine that this instruction gets executed upon.
     */
    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 / value2);
    }

    /**
     * Determines the format of the println representation of this instruction. In addition
     * to the string created by this method's call to the superclass, it also appends information
     * on the division taking place, the registers involved and the register that the result gets stored
     * in.
     *
     * @return a string of the format "label: opcode op1 / op2 to result".
     */
    @Override
    public String toString() {
        return super.toString() + " " + op1 + " / " + op2 + " to " + result;
    }
}
