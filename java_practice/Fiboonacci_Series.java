public class Fiboonacci_Series {
    public static void main(String[] args) {
        int n = 10;
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.println("Without recursion");
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

        System.out.println("\nWith recursion");
        System.out.print(n11 + " " + n22 + " ");
        printFibnacciWithRecursion(n);
    }

    // Recursion
    static int n11 = 0, n22 = 1, n33 = 0;

    public static void printFibnacciWithRecursion(int count) {
        if (count > 1) {
            n33 = n11 + n22;
            System.out.print(n33 + " ");
            n11 = n22;
            n22 = n33;
            printFibnacciWithRecursion(count - 1);
        }
    }
}