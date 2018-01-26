package Chapter5;

import java.util.Scanner;

/**
 *
 * @author William Hibbert
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a String:");
        String s1 = input.next();
        char ab = s1.charAt(0);
        char bc = s1.charAt(1);
        char cd = s1.charAt(2);
        char de = s1.charAt(3);
        char ef = s1.charAt(4);
        System.out.print(ef);
        System.out.print(de);
        System.out.print(cd);
        System.out.print(bc);
        System.out.print(ab);
    }
}
