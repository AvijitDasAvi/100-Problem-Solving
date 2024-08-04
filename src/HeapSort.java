import java.util.Scanner;

public class HeapSort {
    int n;

    public void heapSort(int[] array, int n) {
        this.n = n;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heap(array, i, 0);
        }
    }

    private void heap(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heap(array, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HeapSort obj = new HeapSort();

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        obj.heapSort(array, n);
        System.out.print("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        input.close();

    }
}
