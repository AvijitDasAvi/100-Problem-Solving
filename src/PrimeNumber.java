import java.util.Scanner;

public class PrimeNumber {
    public void primeNumber(int n) {
        int count = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + " isn't Prime Number.");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(n + " , ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting to find Prime Number: ");
        int start = input.nextInt();
        System.out.print("Enter the ending point to find Prime Number: ");
        int end = input.nextInt();
        PrimeNumber a = new PrimeNumber();
        System.out.print("\nPrime Numbers of ( " + start + " to " + end + " ) : ");
        for (int i = start; i <= end; i++) {
            a.primeNumber(i);
        }
        input.close();
    }
}
