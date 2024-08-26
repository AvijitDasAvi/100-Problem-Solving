import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        SmallestElement small = new SmallestElement();
        int min = small.smallest(array, n);

        System.out.println("The smallest element in the array is " + min);

        input.close();
    }

    public int smallest(int[] array, int n) {
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
