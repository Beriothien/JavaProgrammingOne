package Chapter3;

import java.util.Scanner;

/**
 * compares numbers
 *
 * @author William Hibbert
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1:");
        double one = input.nextDouble();
        System.out.println("Number 2:");
        double two = input.nextDouble();
        if (one < two) {
            System.out.println("The first number is less than the second.");
        }
        if (one > two) {
            System.out.println("The first number is greater than the second");
        }
        if (one == two) {
            System.out.println("The first number is equal to the second");
        }
        if (one <= two) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (one != two) {
            System.out.println("The first number is not equal to the second");
        }
        if (two == 0) {
            System.out.println("Cannot divide by zero");
        } else if (one / two < 1) {
            System.out.println("proper fraction");
        } else {
            System.out.println("improper fraction");
        }
        if (one >= 90) {
            System.out.println("A");
        }
        if (one >= 80) {
            if (one < 90) {
                System.out.println("B");
            }
        }
        if (one >= 70) {
            if (one < 80) {
                System.out.println("C");
            }
        }
        if (one >= 60) {
            if (one < 70) {
                System.out.println("D");
            }
        }
        if (one <= 59) {
            System.out.println("F");
        }
        if (two >= 1) {
            if (two <= 100) {
                System.out.println("In Range");
            }

        } else {
            System.out.println("Out of range");
        }

    }
}
