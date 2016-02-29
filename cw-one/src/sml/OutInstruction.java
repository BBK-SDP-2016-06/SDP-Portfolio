package sml;

/**
 * This class ....
 *
 * @author someone
 */

public class OutInstruction extends Instruction {

    private int register;

    public OutInstruction(String label, String op) {
        super(label, op);
    }

    public OutInstruction(String label, int register) {
        this(label, "out");
        this.register = register;
    }

    @Override
    public void execute(Machine m) {
        int value = m.getRegisters().getRegister(register);
        System.out.println(value);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " printed to console";
    }
}
