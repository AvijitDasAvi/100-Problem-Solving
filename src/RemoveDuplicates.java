import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a list with duplicates
        List<String> listWithDuplicates = new ArrayList<>(
                Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape"));

        // Convert the list to a set to remove duplicates
        Set<String> setWithoutDuplicates = new HashSet<>(listWithDuplicates);

        // Convert the set back to a list
        List<String> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

        // Print the list without duplicates
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}