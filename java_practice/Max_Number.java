import java.util.Arrays;
import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max3 && arr[i] < max2) {
                max3 = arr[i];
            }
        }
        System.out.println("Greatest No 1 => " + max1);
        System.out.println("Greatest No 2 => " + max2);
        System.out.println("Greatest No 3 => " + max3);

    }
}
