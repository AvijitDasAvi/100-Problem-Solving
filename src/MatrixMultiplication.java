import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st matrix row number: ");
        int r1 = input.nextInt();
        System.out.print("Enter 1st matrix column number: ");
        int c1 = input.nextInt();
        System.out.print("Enter 2nd matrix row number: ");
        int r2 = input.nextInt();
        System.out.print("Enter 2nd matrix column number: ");
        int c2 = input.nextInt();

        int[][] matrixA = new int[r1][c1];
        int[][] matrixB = new int[r2][c2];
        int[][] result = new int[r1][c2];

        if (c1 == r2) {
            System.out.print("Enter the elements for matrix-A: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    matrixA[i][j] = input.nextInt();
                }
            }

            System.out.print("Enter the elements for matrix-B: ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    matrixB[i][j] = input.nextInt();
                }
            }

            System.out.println("The matrix-A is: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("The matrix-B is: ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(matrixB[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            System.out.println("The result of multiplication: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("This multiplication isn't possible.");
        }

        input.close();
    }
}
