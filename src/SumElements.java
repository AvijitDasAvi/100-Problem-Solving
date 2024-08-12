import java.util.Scanner;

public class SumElements {
    public int sumElements(int[] array, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SumElements sum = new SumElements();

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " no. elements: ");
            array[i] = input.nextInt();
        }

        int result = sum.sumElements(array, n);

        System.out.println("The sum of elements in array: " + result);

        input.close();
    }
}
