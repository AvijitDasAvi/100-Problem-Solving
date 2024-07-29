import java.util.Scanner;

public class QuickSort {
    public void sort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the elements: ");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int length = array.length;

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, length - 1);

        System.out.print("Sorted data: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
