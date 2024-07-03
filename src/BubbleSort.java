import java.util.Scanner;

public class BubbleSort {
    public void bubbleSort(int[] array) {
        int length = array.length;
        boolean swapped;
        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arrayInput = new int[n];
        BubbleSort num = new BubbleSort();
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arrayInput[i] = input.nextInt();
        }
        num.bubbleSort(arrayInput);
        System.out.print("Sorted: ");
        for (int i : arrayInput) {
            System.out.print(i + " ");
        }
        input.close();
    }
}
