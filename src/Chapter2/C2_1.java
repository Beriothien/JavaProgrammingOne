package Chapter2;

import java.util.Scanner;

/**
 * converts Celsius to Farenheit
 *
 * @author William Hibbert
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Celcius:");
        double celcius = input.nextDouble();
        double farenheit = (9.0 / 5) * celcius + 32;
        System.out.println("Farenheit:" + farenheit);
    }
}
