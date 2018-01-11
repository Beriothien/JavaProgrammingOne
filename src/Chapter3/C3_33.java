package Chapter3;

import java.util.Scanner;

/**
 * compares cost
 *
 * @author William Hibbert
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("weight 1");

        double A = input.nextDouble();
        System.out.println("price 1");
        double B = input.nextDouble();
        double W = B / A;
        System.out.println("weight 2");
        double C = input.nextDouble();
        System.out.println("price 2");
        double D = input.nextDouble();
        Double R = D / C;
        if (R < W) {
            System.out.println("The second has a better price");
        } else {
            System.out.println("The first has a better price");
        }
        if (B == D) {
            System.out.println("same prices");
        }
    }
}
