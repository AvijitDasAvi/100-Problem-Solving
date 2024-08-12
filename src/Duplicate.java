import java.util.Scanner;

public class Duplicate {
    public int duplicate(int[] array, int data, int n) {
        int count = 0;
        if (n == 1 || n == 0) {
            System.out.println("Add more data in array.");
        } else {
            for (int i = 0; i < n; i++) {
                if (array[i] == data) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Duplicate dup = new Duplicate();

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " no. element: ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the to find (duplicates or not): ");
        int data = input.nextInt();

        int result = dup.duplicate(array, data, n);

        if (result != 0) {
            System.out.println("The data " + data + " is " + result + " times in the array.");
        } else {
            System.out.println("The given data isn't in the array.");
        }

        input.close();
    }
}
