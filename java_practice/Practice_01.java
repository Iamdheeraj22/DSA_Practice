import java.util.Scanner;

class Practice_01 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Entered number is: " + num);
        sc.close();
    }
}