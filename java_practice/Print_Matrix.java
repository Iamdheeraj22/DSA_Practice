
import java.util.Scanner;

public class Print_Matrix {
    public static void main(String[] args) {
        int row, column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing Matrix");
        System.out.println("Enter the size of row");
        row = sc.nextInt();
        System.out.println("Enter the size of column");
        column = sc.nextInt();
        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
