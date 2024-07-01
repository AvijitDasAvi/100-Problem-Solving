import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int first = 0, second = 1, next;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.print("Fibonacci series: " + first + " , " + second);
        for (int i = 2; i <= n; i++) {
            next = first + second;
            System.out.print(" , " + next);
            first = second;
            second = next;
        }
        input.close();
    }
}
