import java.util.Scanner;

public class NumberOfWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();
        input.close();

        String[] words = sentence.trim().split("\\s+");

        int count = words.length;
        System.out.println("Number of the words in given sentence: " + count);
    }
}
