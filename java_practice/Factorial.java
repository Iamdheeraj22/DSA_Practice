import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                int calculate = result;
                calculate *= i;
                result = calculate;
            }
            System.out.println(result);
        } else if (n == 0) {
            System.out.println(1);
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
