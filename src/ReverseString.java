import java.util.Scanner;

public class ReverseString {
    public String reverse(String str) {
        String result = " ";
        char temp;
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            result = temp + result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = input.nextLine();

        ReverseString obj = new ReverseString();
        String result = obj.reverse(str);

        System.out.println("The reverse output: " + result);

        input.close();
    }
}
