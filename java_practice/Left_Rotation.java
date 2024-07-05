
import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 2)) {
                newArr[i] = arr[i + 1];
                newArr[i + 1] = arr[0];
                break;
            } else {
                newArr[i] = arr[i + 1];
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
