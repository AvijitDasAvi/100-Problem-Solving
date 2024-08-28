import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        input.close();

        GCD gcd = new GCD();
        int result = gcd.findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + result);
    }

    public int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }
}