package Chapter3;

import java.util.Scanner;

/**
 * heads or tails
 *
 * @author William Hibbert
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess  1 or 0, for heads or tails Guess:");
        double guess = input.nextDouble();
        int answer = (int) (Math.random() * 2);
        if (answer == guess) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
        System.out.println(answer);
    }
}
