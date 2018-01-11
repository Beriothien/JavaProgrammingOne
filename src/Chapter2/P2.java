package Chapter2;

import java.util.Scanner;

/**
 * Calculates total cost of a meal
 *
 * @author William Hibbert
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Meal Price:");
        //mP is Meal Price
        double mP = input.nextDouble();
        System.out.println("Drink Price:");
        //dP is Drink Price
        double dP = input.nextDouble();
        System.out.println("Dessert Price:");
        //dtP is Dessert Price
        double dtP = input.nextDouble();
        // tP is Total Price
        double tP = mP + dP + dtP;
        double tax = tP * 0.10;
        double tip = (tP + tax) * 0.15;
        // tC is total cost including tax and tip
        double tC = tP + tax + tip;
        System.out.println(" Food Cost:" + tP + " Tax:" + tax + " Tip:" + tip
                + " Total Cost:" + tC);
    }
}
