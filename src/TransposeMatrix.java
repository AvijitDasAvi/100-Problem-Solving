import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row number: ");
        int row = input.nextInt();
        System.out.print("Enter the column number: ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];
        int[][] result = new int[col][row];

        System.out.print("Enter the elements of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
