import java.util.Scanner;

public class PalindromeNum {
    public static boolean isPalindrome(int n) {
        int originalNum = n;
        int reverseNum = 0;
        while (n != 0) {
            int digit = n % 10;
            reverseNum = reverseNum * 10 + digit;
            n /= 10;
        }
        return originalNum == reverseNum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + "- is Palindrome");
        } else {
            System.out.println(num + "- is not a Palindrome");
        }
        input.close();
    }
}
