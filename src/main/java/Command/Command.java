package Command;

/** Abstract class */
public abstract class Command {
    /** Value fields */
    protected double value1;
    protected double value2;

    /** @param value1 - first variable
     * @param value2 - second variable */

    /** Constructor */
    public Command(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /** Abstract function */
    public abstract void execute();
}
