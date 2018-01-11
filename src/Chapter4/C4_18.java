package Chapter4;

import java.util.Scanner;

/**
 * Determines Students Major or Status
 *
 * @author William Hibbert
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Major and Year:");
        String s1 = input.next().toUpperCase();
        char Major = s1.charAt(0);
        char year = s1.charAt(1);
        if ((Major == 'M' || Major == 'C' || Major == 'I')
                && ((year == '1') || (year == '2') || (year == '3') || (year == '4'))) {
            if (Major == 'M') {
                System.out.println("Major is Mathematics ");
            } else if (Major == 'C') {
                System.out.println("Major is Computer Science ");
            } else if (Major == 'I') {
                System.out.println("Major is Information Technology ");
            }
            if (year == '1') {
                System.out.print("year one");
            } else if (year == '2') {
                System.out.print("year two");
            } else if (year == '3') {
                System.out.print("year three");
            } else if (year == '4') {
                System.out.print("year four");
            }
        } else {
            System.out.println("Invalid Input");
        }

    }
}
