package Calculator;

import Commands.Addition;
import Command.Command;
import Commands.Division;
import Commands.Multiplication;
import Commands.Subtraction;

/** Server class */
public class Calculator {
    /** Value fields */
    private double value1;
    private double value2;
    private char operation;

    /** @param value1 - first variable
     * @param value2 - second variable
     * @param operation - operation
     */

    /** Constructor */
    public Calculator(double value1, double value2, char operation){
        this.value1 = value1;
        this.value2 = value2;
        this.operation = operation;
        initial();
    }

    /** Function defines which operation to use */
    private void initial(){
        if (operation == '+'){
            System.out.println("Answer: ");
            /** @see Calculator#executeCommand() */
            executeCommand(new Addition(value1, value2));
        }

        if (operation == '-'){
            System.out.println("Answer: ");
            /** @see Calculator#executeCommand() */
            executeCommand(new Subtraction(value1, value2));
        }

        if (operation == '*'){
            System.out.println("Answer: ");
            /** @see Calculator#executeCommand() */
            executeCommand(new Multiplication(value1, value2));
        }

        if (operation == '/'){
            System.out.println("Answer: ");
            /** @see Calculator#executeCommand() */
            executeCommand(new Division(value1, value2));
        }
    }

    /** Function gets the type of the command */
    private void executeCommand(Command command){
        /** Execute from {@link Command#execute()} */
        command.execute();
    }
}
