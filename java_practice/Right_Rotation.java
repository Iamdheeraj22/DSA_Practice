
import java.util.Arrays;

public class Right_Rotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                newArr[i] = arr[arr.length - 1];
                newArr[i + 1] = arr[i];
            } else {
                if (i != arr.length - 1) {
                    newArr[i + 1] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
