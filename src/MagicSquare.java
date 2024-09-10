import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the magic square (odd number): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int[][] magicSquare = new int[n][n];
        int number = 1;
        int row = 0;
        int col = n / 2;

        while (number <= n * n) {
            magicSquare[row][col] = number;
            number++;

            int newRow = (row - 1 + n) % n;
            int newCol = (col + 1) % n;

            if (magicSquare[newRow][newCol] != 0) {
                row = (row + 1) % n;
            } else {
                row = newRow;
                col = newCol;
            }
        }
        System.out.println("Magic Square of size " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
