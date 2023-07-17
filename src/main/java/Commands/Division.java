package Commands;

import Command.Command;

/** Division class */
public class Division extends Command {
    /** Constructor */
    public Division(double value1, double value2) {
        /** @see Command#Command(double, double) */
        super(value1, value2);
    }

    /** Execute from {@link Command#execute()} */
    @Override
    public void execute() {
        if (value2 == 0)
            System.out.println("Division is impossible");
        else
            System.out.println(value1 / value2);
    }
}
