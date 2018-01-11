package Chapter4;

import java.util.Scanner;

/**
 * see if the second String is a substring
 *
 * @author William Hibbert
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("2 Strings:");
        //Strings
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        if (s1.contains(s2)) {
            System.out.println(s2 + "is a substring of " + s1);
        } else {
            System.out.print("There is not substring");
        }

    }

}
