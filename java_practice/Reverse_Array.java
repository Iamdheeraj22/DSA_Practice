public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
