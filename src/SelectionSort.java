import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int num = input.nextInt();

        int[] array = new int[num];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        selectionSort(array);

        System.out.print("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
