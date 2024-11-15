import java.util.Scanner;

public class TotalSalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bSalary = sc.nextInt();
        char grade = sc.next().charAt(0);

        double hra = (bSalary * 20) / 100;

        double da = (bSalary * 50) / 100;

        double pf = (bSalary * 11) / 100;

        int allow = 0;

        if (grade == 'A' || grade == 'a') {
            allow = 1700;
        } else if (grade == 'B' || grade == 'b') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double result = ((bSalary + hra + allow + da) - pf);
        System.out.println(Math.round(result));
        sc.close();
    }
}
