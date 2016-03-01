package sml;

/**
 * This class represents the "lin" instruction as interpreted by the Simple
 * Machine Language (SML). The instruction is of the format:
 * ID lin R x
 * where the ID is the line identifier within the program, R is the register
 * that the result will be stored in, and x is the value to be stored.
 *
 * This class extends the abstract class Instruction.
 *
 * @author George Shiangoli
 */
public class LinInstruction extends Instruction {

    private int value;

    /**
     * The primary constructor of this class calls the constructor of the extended
     * abstract class Instruction to initially set the label and opcode parameters.
     * The constructor also sets the target register and value to be stored in the register.
     *
     * @param label the label of the instruction. This is an identifier that can take the
     *              form of any sequence of non-whitespace characters.
     * @param register the target register that the value will be stored in.
     * @param value the integer that is to be stored in the register.
     */
    public LinInstruction(String label, int register, int value) {
        super(label, "lin");
        setTargetRegister(register);
        this.value = value;
    }

    /**
     * Executes this Instruction on machine m. The instruction simply stores the value in
     * the register.
     *
     * @param m the machine that this instruction gets executed upon.
     */
    @Override
    public void execute(Machine m) {
        m.getRegisters().setRegister(targetRegister, value);
    }

    /**
     * Determines the format of the println representation of this instruction. In addition
     * to the string created by this method's call to the superclass, it also appends information
     * about the register and the register and the value now stored within it.
     *
     * @return a string of the format "label: opcode register value is x".
     */
    @Override
    public String toString() {
        return super.toString() + " register " + targetRegister + " value is " + value;
    }
}
