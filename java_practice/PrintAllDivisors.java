import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}