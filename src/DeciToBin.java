import java.util.Scanner;

public class DeciToBin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = input.nextInt();
        input.close();
        String result = Integer.toBinaryString(n);
        System.out.println("Binary representation of " + n + " is: " + result);
    }
}
