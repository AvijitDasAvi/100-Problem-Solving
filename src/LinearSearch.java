import java.util.Scanner;

public class LinearSearch {
    int length;

    public int linearSearch(int[] array, int target) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = { 3, 5, 7, 9, 11, 13, 15 };

        System.out.print("Enter the target: ");
        int target = input.nextInt();

        LinearSearch obj = new LinearSearch();
        int result = obj.linearSearch(array, target);
        if (result != -1) {
            System.out.println("The target found at position " + (result + 1));
        } else {
            System.out.println("The target is not found.");
        }
        input.close();
    }
}
