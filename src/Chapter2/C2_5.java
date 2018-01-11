package Chapter2;

import java.util.Scanner;

/**
 * Determines total after gratuity rate
 *
 * @author William Hibbert
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("amount:");
        double amount = input.nextDouble();
        System.out.println("gratuity:");
        double gratuity = input.nextDouble();
        double gratuity2 = gratuity / 100 * amount;
        double total = amount + gratuity2;
        System.out.println("gratuity is: " + gratuity2 + " total: " + total);
    }
}
