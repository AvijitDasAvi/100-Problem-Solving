import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();

        ArmstrongNumber arm = new ArmstrongNumber();
        arm.armstrong(num);
    }

    public void armstrong(int num) {
        int originalNum = num;
        int sumNum = 0;
        int digits = 0;
        int temp = num;

        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sumNum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (originalNum == sumNum) {
            System.out.println(originalNum + " is a armstrong number.");
        } else {
            System.out.println(originalNum + " isn't a armstrong number.");
        }
    }
}
