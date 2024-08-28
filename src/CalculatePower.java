import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        input.close();

        int result = (int) Math.pow(base, power);

        System.out.println(base + "^" + power + " = " + result);
    }
}
