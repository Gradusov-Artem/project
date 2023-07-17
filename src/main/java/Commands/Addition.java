package Commands;

import Command.Command;

/** Addition class */
public class Addition extends Command {
    /** Constructor */
    public Addition(double value1, double value2) {
        /** @see Command#Command(double, double) */
        super(value1, value2);
    }

    /** Execute from {@link Command#execute()} */
    @Override
    public void execute() {
        System.out.println(value1 + value2);
    }
}
