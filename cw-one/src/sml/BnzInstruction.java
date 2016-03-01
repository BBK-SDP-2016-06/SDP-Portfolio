package sml;

/**
 * This class represents the "bnz" instruction as interpreted by the Simple
 * Machine Language (SML). The instruction is of the format:
 * ID bnz R ID2
 * where the ID is the line identifier within the program, R is the register
 * whose stored value will be tested against, and ID2 represents the next labeled
 * statement to be executed if the test aforementioned passes.
 *
 * This class extends the abstract class Instruction.
 *
 * @author George Shiangoli
 */
public class BnzInstruction extends Instruction {

    private String nextLabel;

    /**
     * The primary constructor of this class calls the constructor of the extended
     * abstract class Instruction to initially set the label and opcode parameters.
     * The constructor also sets the target register to be compared and the label of
     * the next program instruction.
     *
     * @param label the label of the instruction. This is an identifier that can take the
     *              form of any sequence of non-whitespace characters.
     * @param register the register whose stored value will be compared.
     * @param nextLabel the next labelled statement to be executed if the value stored in
     *                  this register is not equal to 0.
     */
    public BnzInstruction(String label, int register, String nextLabel) {
        super(label, "bnz");
        setTargetRegister(register);
        this.nextLabel = nextLabel;
    }

    /**
     * Executes this Instruction on machine m. The instruction switches the program flow
     * to the statement labelled by this nextLabel if the value stored in this register is
     * not equal to zero, otherwise this method performs no function.
     *
     * @param m the machine that this instruction gets executed upon.
     */
    @Override
    public void execute(Machine m) {
        int value = m.getRegisters().getRegister(targetRegister);
        if(value != 0) {
            m.setPc(m.getLabels().indexOf(nextLabel));
        }
    }

    /**
     * Determines the format of the println representation of this instruction. In addition
     * to the string created by this method's call to the superclass, it also appends information
     * on the statement this method loops back to if the register's stored value is not equal to zero.
     *
     * @return a string of the format "label: opcode loops back to nextLabel while register R value is not 0".
     */
    @Override
    public String toString() {
        return super.toString() + " jumps to " + nextLabel + " while register "
                                + targetRegister + " value is not 0";
    }
}