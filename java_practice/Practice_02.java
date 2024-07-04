
import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {
        /*
         * Random random = new Random();
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter your lucky number between 0 to 10: ");
         * int yourNumber = sc.nextInt();
         * int luckyNumber = random.nextInt(10);
         * if (yourNumber == luckyNumber) {
         * System.out.println("Congratulations! You won the lottery.");
         * } else {
         * System.out.println("Better luck next time. Lucky number was: " +
         * luckyNumber);
         * }
         * sc.close();
         * 
         * // Shift OperaTor
         * 
         * System.out.println(10 << 2);
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hasValue = sc.hasNextInt();
        System.out.println(n);
        System.out.println(hasValue);
        System.out.println(sc.nextLine());
    }
}
