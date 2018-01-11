package Chapter4;

import java.util.Scanner;

/**
 * makes a payroll statement
 *
 * @author William Hibbert
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name, hours worked a week, hourly pay, federal"
                + "+ tax withholding rate, state tax witholding rate");
        String s1 = input.nextLine();
        final double x = input.nextDouble();
        final double y = input.nextDouble();
        final double z = input.nextDouble();
        final double v = input.nextDouble();
        System.out.println("Emlpoyee name:" + s1);
        System.out.println("Hours worked:" + x);
        System.out.println("Pay rate:" + y);
        System.out.println("Gross Pay:" + (x * y));
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (20.0%):" + (x * y * .20));
        System.out.println("  State Withholding (9.0%):" + (x * y * .09));
        System.out.println("  Total Deduction:" + (x * y * .29));
        System.out.println("Net Pay:" + (x * y * .71));
    }
}
