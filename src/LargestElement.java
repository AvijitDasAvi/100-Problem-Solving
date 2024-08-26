import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int num = input.nextInt();

        int[] array = new int[num];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }

        LargestElement lar = new LargestElement();
        int max = lar.largest(array, num);

        System.out.println("The largest element in the array is " + max);

        input.close();
    }

    public int largest(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
