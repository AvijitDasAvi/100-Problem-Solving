import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        input.close();

        LCM lcm = new LCM();
        int gcd = lcm.findGCD(num1, num2);
        int result = (num1 * num2) / gcd;
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + result);
    }

    public int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }
}
