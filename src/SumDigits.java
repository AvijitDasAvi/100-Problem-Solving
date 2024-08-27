import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        input.close();

        SumDigits sum = new SumDigits();
        int result = sum.sumDigits(number);
        System.out.println("Sum of the digits of given number: " + result);
    }

    private int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
