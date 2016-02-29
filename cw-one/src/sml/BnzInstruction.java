package sml;
/**
 * This class ....
 *
 * @author George Shiangoli
 */

public class BnzInstruction extends Instruction {
    private int register;
    private int value = 0;
    private String nextLabel;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String nextLabel) {
        super(label, "bnz");
        this.register = register;
        this.nextLabel = nextLabel;
    }

    @Override
    public void execute(Machine m) {
        value = m.getRegisters().getRegister(register);
        if(value != 0) {
            m.setPc(m.getLabels().indexOf(nextLabel));
        }
    }

    @Override
    public String toString() {
        String output = super.toString() + " register " + register + " value is " + value;
        if(value != 0) {
            output += " loop to " + nextLabel;
        } else {
            output += " exit loop";
        }
        return output;
    }
}
