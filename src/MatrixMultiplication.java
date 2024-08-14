import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrixA = new int[2][3];
        int[][] matrixB = new int[3][3];
        int[][] result = new int[2][3];

        System.out.print("Enter the elements in matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("The matrix-A is: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
