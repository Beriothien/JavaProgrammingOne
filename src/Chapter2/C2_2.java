package Chapter2;

import java.util.Scanner;

/**
 * Computes volume of a cylinder
 *
 * @author William Hibbert
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius:");
        double radius = input.nextDouble();
        System.out.println("Length:");
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("Area:" + area + " Volume:" + volume);
    }
}
