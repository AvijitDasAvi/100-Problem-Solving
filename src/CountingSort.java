import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int[] array) {
        int max = findMax(array);
        int min = findMin(array);
        int range = max - min + 1;
        int[] count = new int[range];

        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        countingSort(array);
        System.out.print("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        input.close();
    }
}
