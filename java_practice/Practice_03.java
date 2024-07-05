
import java.util.Scanner;

public class Practice_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // If Condition
        /*
         * System.out.println("Enter a firs number: ");
         * int firstNumber = sc.nextInt();
         * System.out.println("Enter a second number: ");
         * int secondNumber = sc.nextInt();
         * if (firstNumber > secondNumber) {
         * System.out.println("First number is greater than second number.");
         * } else if (firstNumber < secondNumber) {
         * System.out.println("First number is less than second number.");
         * } else {
         * System.out.println("Both numbers are equal.");
         * }
         */

        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         * Output
         *
         * 
         * 
         * *
         * * *
         * * * *
         * * * * *
         * 
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((n - i) < j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        /*
                    *
                   **
                  ***
                 ****
                *****
         */
        // print the pyramid pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
