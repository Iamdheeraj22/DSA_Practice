import java.util.Scanner;

public class CalculateTemprature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();

        for (int i = start; i <= end; i += step) {
            int c = (5 * (i - 32)) / 9;
            System.out.println(i + "\t" + c);

        }
        scanner.close();
    }

}
