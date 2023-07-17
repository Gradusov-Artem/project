/** Калькулятор
 * @author Артем Градусов
 * @version 1.0
 * @since 1.8
 */

package Client;

import Calculator.Calculator;

import java.util.Scanner;

/** User interface class */
public class Client {
    /** UI feature */
    public static void main(String[] args) throws Exception{
        /** Value fields */
        double value1, value2;
        char operation;
        int flag = 1;

        /** Scanner initialization */
        Scanner reader = new Scanner(System.in);

        /** try block, executed if there are no errors */
        try{
            while(flag != 0){
                /** The first value input */
                System.out.println("Enter first number: ");
                value1 = reader.nextDouble();
                /** The second value input */
                System.out.println("Enter second number: ");
                value2 = reader.nextDouble();
                /** The operation input */
                System.out.println("Enter operation(+, -, *, /): ");
                operation = reader.next().charAt(0);
                /** Constructor - creating new object
                 * @see Calculator#Calculator(double, double, char) */
                Calculator calculator = new Calculator(value1, value2, operation);
                /** Checking for the end of input */
                System.out.println("Press 0 to exit or any other number to continue...");
                flag = reader.nextInt();
            }
          /** Exception handling */
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
