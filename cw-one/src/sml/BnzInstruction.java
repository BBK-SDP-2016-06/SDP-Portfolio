package sml;
/**
 * This class ....
 *
 * @author George Shiangoli
 */

public class BnzInstruction extends Instruction {
    private int register;
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
        int value = m.getRegisters().getRegister(register);
        if(value != 0) {
            m.setPc(m.getLabels().indexOf(nextLabel));
        }
    }

    @Override
    public String toString() {
        return super.toString() + " loops to " + nextLabel + " while register " + register + " value is not 0" ;
    }
}