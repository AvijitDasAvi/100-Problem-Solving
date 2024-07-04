import java.util.Scanner;

public class BinarySearch {
    public int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearch obj = new BinarySearch();
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the sorted elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = input.nextInt();
        int index = obj.binarySearch(array, target);
        System.out.println(index != -1 ? "The index of target: " + index : "The target is not found.");
        input.close();
    }
}