package sml;

/**
 * This class represents the "out" instruction as interpreted by the Simple
 * Machine Language (SML). The instruction is of the format:
 * ID out R
 * where the ID is the line identifier within the program and R is the register
 * that the instruction will perform the println command on.
 *
 * This class extends the abstract class Instruction.
 *
 * @author George Shiangoli
 */
public class OutInstruction extends Instruction {

    /**
     * The primary constructor of this class calls the constructor of the extended
     * abstract class Instruction to initially set the label and opcode parameters.
     * The constructor also sets the target register to be printed.
     *
     * @param label the label of the instruction. This is an identifier that can take the
     *              form of any sequence of non-whitespace characters.
     * @param register the target register that the instruction will perform the println command on.
     */
    public OutInstruction(String label, int register) {
        super(label, "out");
        setTargetRegister(register);
    }

    /**
     * Executes this Instruction on machine m. The instruction simply prints the value stored
     * in this register to the console.
     *
     * @param m the machine that this instruction gets executed upon.
     */
    @Override
    public void execute(Machine m) {
        int value = m.getRegisters().getRegister(targetRegister);
        System.out.println(value);
    }

    /**
     * Determines the format of the println representation of this instruction. In addition
     * to the string created by this method's call to the superclass, it also appends information
     * about the register whose value is being printed to the console.
     *
     * @return a string of the format "label: opcode register printed to console".
     */
    @Override
    public String toString() {
        return super.toString() + " register " + targetRegister + " printed to console";
    }
}
