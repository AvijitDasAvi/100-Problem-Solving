import java.util.Scanner;

public class CountVowels {
    public int counting(String input) {
        int count = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        CountVowels countVowels = new CountVowels();

        System.out.print("Enter the word: ");
        String input = str.nextLine();

        int result = countVowels.counting(input);

        if (result == 0) {
            System.out.println("No vowels are found.");
        } else {
            System.out.println("Total number of vowels are - " + result);
        }

        str.close();

    }
}
