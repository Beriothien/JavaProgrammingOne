package Chapter7;

import java.util.Scanner;

/**
 * Program to Determine students scores.
 *
 * @author Gavin Wilkens
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int[] scores = new int[input.nextInt()];
        char[] grades = new char[scores.length];

        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        getGrades(scores, grades);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is "
                    + scores[i] + " and grade is " + grades[i]);
        }
    }

    /**
     * Max Method
     *
     * @param array
     * @return
     */
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Grade Method
     *
     * @param scores
     * @param grades
     */
    public static void getGrades(int[] scores, char[] grades) {
        int best = max(scores);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= best - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= best - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= best - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }
}
