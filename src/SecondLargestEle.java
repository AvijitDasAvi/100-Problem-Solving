import java.util.Scanner;

public class SecondLargestEle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the elements: ");
        int num = input.nextInt();

        int[] array = new int[num];
        System.out.println("Enter the elements- ");
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + " no. element: ");
            array[i] = input.nextInt();
        }
        input.close();
        SecondLargestEle secondLargest = new SecondLargestEle();
        secondLargest.secondLargest(array, num);
    }

    public void secondLargest(int[] array, int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There are no second largest in this array.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
