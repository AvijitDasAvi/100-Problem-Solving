import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the input (String): ");
        String n = a.next();
        if (isPalindrome(n) == true) {
            System.out.println(n + "- is Palindrome");
        } else {
            System.out.println(n + "- is not a Palindrome");
        }
        a.close();
    }
}