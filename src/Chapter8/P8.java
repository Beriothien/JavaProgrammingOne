package Chapter8;

import java.util.Scanner;

/**
 * Program to compare hours to price of two salesmen
 *
 * @author Willaim_Hibbert
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
//                           Variables    
//******************************************************************************
        Boolean more = true;
        int i = 0;
        int j = 0;
        double a = 0;
//                            First Loop
//******************************************************************************
        while (more == true) {
//                             Salesman
//******************************************************************************
            System.out.println("Enter the salesman ID as A, B, C, or D:");
            String SalesID = input.nextLine();
            char SalesIDChar = SalesID.charAt(0);
            if (SalesIDChar == 'A' ^ SalesIDChar == 'B' ^ SalesIDChar == 'C' ^ SalesIDChar == 'D') //      use j to say continue for Salesman
            {
                j = 1;
            } else {
                System.out.println("Invalid Input");
                System.exit(0);
            }
//                            Day of the Week
//******************************************************************************
            System.out.println("Enter the day as M, T, W, H, or F:");
            String DOTW = input.nextLine();
            char DOTWChar = DOTW.charAt(0);
            if (DOTWChar == 'M' ^ DOTWChar == 'T' ^ DOTWChar == 'W' ^ DOTWChar == 'H' ^ DOTWChar == 'F') //      use i to say continue for days of the week
            {
                i = 1;
            } else {
                System.out.println("Invalid Input");
                System.exit(0);
            }

//                             Amount
//******************************************************************************
            System.out.println("Enter The Amount of the Sale:");
            a = input.nextDouble();

//                             Continue?
//******************************************************************************
            System.out.println("More data? Enter Y for more or N to Stop:");
            String More = input.next();
            char MoreChar = More.charAt(0);
            if (MoreChar == 'N') {
                more = false;
            } else {
                more = true;
            }
//******************************************************************************
        }
//******************************************************************************

//******************************************************************************
    }

}
