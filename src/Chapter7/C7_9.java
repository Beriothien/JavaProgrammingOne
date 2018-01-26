package Chapter7;

import java.util.Scanner;

/**
 * Program to determine minimum number out of ten numbers
 *
 * @author Gavin Wilkens
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The minimum number is: " + min(numbers));
    }

    /**
     * Min Method
     *
     * @param array
     * @return
     */
    public static double min(double[] array) {
        double min = array[0];
        for (double i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
