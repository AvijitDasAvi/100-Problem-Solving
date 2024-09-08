import java.util.Scanner;

public class BinToDeci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary numbers: ");
        String bin = input.nextLine();
        input.close();
        int result = Integer.parseInt(bin, 2);
        System.out.println("Decimal representation of " + bin + " number is: " + result);
    }
}
