import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = input.nextInt();
        input.close();
        PascalTriangle pas = new PascalTriangle();
        pas.pascalTriangleCal(row);
    }

    public void pascalTriangleCal(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
