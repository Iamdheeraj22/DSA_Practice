import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = new int[n];
        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                evenSum += rem;
            } else {
                oddSum += rem;
            }
            n /= 10;
        }

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // if (arr[i] % 2 == 0) {
        // evenSum += arr[i];
        // } else {
        // oddSum += arr[i];
        // }
        // }

        System.out.println(evenSum + " " + oddSum);
        sc.close();
    }
}
//Problem statement
//Write a program to input an integer N and print the sum of all its even digits and all its odd digits separately.
//Digits mean numbers, not the places! If the given integer is "13245", the even digits are 2 and 4, and the odd digits are 1, 3, and 5