public class ArraySum {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0, evenSum = 0,
                oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
            if (arr[i] % 2 == 1) {
                oddSum += arr[i];
            }
        }
        System.out.println("Sum without recursion" + sum);
        System.out.println("Even number sum" + evenSum);
        System.out.println("Odd number sum" + oddSum);
    }

}