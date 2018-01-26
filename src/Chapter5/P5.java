/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

import java.util.Scanner;

/**
 *
 * @author William Hibbert
 */
public class P5 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'Y' to vote Yes, 'N' to vote No, ot 'Q' to quit voting");
        String s1 = input.nextLine();
        char c = s1.charAt(0);
        int y = 0;
        int n = 0;
        if (c == 'Y' || c == 'N') {
            do {
                if (c == 'Y') {
                    y++;
                }
                if (c == 'N') {
                    n++;
                }
            } while (c != 'Q' || c != 'q');
            if (c == 'Q') {
                System.out.println("Yes Votes: " + y + " No Votes: " + n);
            }

        } else {
            System.out.println("INVALID CODE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
        }

    }
}
