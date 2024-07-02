import java.util.Scanner;

public class PalindromeArray {
    public static boolean isArrayList(int[] a) {
        int size = a.length, i;
        for (i = 0; i < size / 2; i++) {
            if (a[i] == a[size - i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the elements: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        if (isArrayList(array) == true) {
            System.out.println("This array elements is Palindrome.");
        } else {
            System.out.println("This array elements isn't Palindrome.");
        }
        input.close();
    }
}
