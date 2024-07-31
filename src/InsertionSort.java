public class InsertionSort {
    public static void insertionSort(int[] array) {

        int length = array.length;
        for (int i = 1; i < length; i++) {
            int value = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j] = value;
        }

    }

    public static void print(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = { 12, 11, 15, 10, 5, 7, 77, 89 };

        System.out.println("Original array: ");
        print(array);

        insertionSort(array);
        System.out.println("Sorted array: ");
        print(array);
    }
}
