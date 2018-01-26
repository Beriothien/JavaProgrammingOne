package Chapter7;

import java.util.Scanner;

/**
 * Program to average a specified amount of numbers
 *
 * @author Willaim Hibbert
 */
public class P7 {

    public static Integer arraySize;

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer x;
        System.out.println("How many numbers will you read in?");
        arraySize = input.nextInt();
        int c[];
        c = new int[arraySize];
        l(c);
        x = ac(c);
        System.out.print("The average is ");
        System.out.println(x);
        k(c);
    }

    /**
     * Fills Loop Method
     *
     * @param s
     */
    public static void l(int s[]) {
        Scanner input = new Scanner(System.in);
        for (int loopSize = 0; loopSize < arraySize; loopSize++) {
            s[loopSize] = input.nextInt();
        }
    }

    /**
     * Average Method
     *
     * @param s
     * @return
     */
    public static Integer ac(int s[]) {
        int b = 0;
        int ss = 0;
        int n = 0;
        for (int loopSize = 0; loopSize < arraySize; loopSize++) {
            n = s[loopSize];
            b = b + n;
        }
        ss = b / arraySize;
        return ss;
    }

    /**
     * Final Method
     *
     * @param s
     */
    public static void k(int s[]) {
        for (int loopSize = 0; loopSize < arraySize; loopSize++) {

            System.out.print("Item " + (loopSize + 1) + ": ");
            System.out.println(s[loopSize]);
        }
    }
}
