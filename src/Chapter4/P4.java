package Chapter4;

import java.util.Scanner;

/**
 * compares cost to work hours
 *
 * @author William Hibbert
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Bidder 1
        System.out.println("Please enter your Name:");
        String x = input.next();
        System.out.println("How many hours of work will you require?");
        double bid1Time = input.nextDouble();
        System.out.println("How much do you charge per hour?");
        double amount1 = input.nextDouble();
        double timeAmount1 = bid1Time * amount1;
        // Bidder 2
        System.out.println("Please enter your Name:");
        String x2 = input.next();
        System.out.println("How many hours of work will you require?");
        double bid2Time = input.nextDouble();
        System.out.println("How much do you charge per hour?");
        double amount2 = input.nextDouble();
        double timeAmount2 = bid2Time * amount2;
        // if else
        if (timeAmount1 < timeAmount2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", x, timeAmount1, bid1Time);
        }
        if (timeAmount1 > timeAmount2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", x2, timeAmount2, bid2Time);
        }

        if (amount1 == amount2 && bid1Time < bid2Time) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", x, timeAmount1, bid1Time);
        }
        if (amount1 == amount2 && bid1Time > bid2Time) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", x2, timeAmount2, bid2Time);
        }
        if (timeAmount1 == timeAmount2 && bid1Time == bid2Time) {
            System.out.printf("Thebidders have identitcal costs with a total cost of %.2f and %d hours", timeAmount1, bid1Time);
        }

    }
}
