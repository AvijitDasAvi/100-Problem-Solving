import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();

        PerfectNumber per = new PerfectNumber();
        per.perfectNumber(num);
    }

    private void perfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " isn't a Perfect Number.");
        }

    }
}
