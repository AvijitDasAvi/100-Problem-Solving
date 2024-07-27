import java.util.Scanner;

public class MergeSort {
    public void sort(int[] array, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            sort(array, left, mid);
            sort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {

        int num1 = mid - left + 1;
        int num2 = right - mid;

        int[] leftArray = new int[num1];
        int[] rightArray = new int[num2];

        for (int i = 0; i < num1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < num2; ++j)
            rightArray[j] = array[mid + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < num1 && j < num2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < num1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < num2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
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

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);

        System.out.print("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
