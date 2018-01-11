package Chapter3;

import java.util.Scanner;

/**
 * determines if integer is divisable by 5 or 6
 *
 * @author William Hibbert
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer");
        double one = input.nextDouble();
        double two = one % 5;
        double three = one % 6;
        if (two == 0 || three == 0) {
            System.out.println("Is " + one + " divisible by 5 or 6? true");
        } else {
            System.out.println("Is " + one + " divisible by 5 or 6? false");
        }
        if (two == 0 && three == 0) {
            System.out.println("Is " + one + " divisible by 5 and 6? true");
        } else {
            System.out.println("Is " + one + " divisible by 5 and 6? false");
        }
        if (two == 0 ^ three == 0) {
            System.out.println("Is " + one + " divisible by 5 or 6, but not both? true");
        } else {
            System.out.println("Is " + one + " divisible by 5 or 6, but not both? false");
        }
    }
}
