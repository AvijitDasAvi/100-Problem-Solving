import java.util.Scanner;

public class Factorial {
    int n;
    int result;

    public Factorial(int n) {
        this.n = n;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        this.result = result;
    }

    public void display() {
        System.out.println("The factorial of " + n + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find Factorial: ");
        int num = input.nextInt();
        Factorial fact = new Factorial(num);
        fact.display();
        input.close();
    }
}
