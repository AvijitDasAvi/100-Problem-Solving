import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("To check (Year - 1 / Century - 2): ");
        int check = input.nextInt();
        int year, century;

        switch (check) {
            case 1:
                System.out.print("Enter the year: ");
                year = input.nextInt();
                if (year % 4 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " isn't a leap year.");
                }
                break;
            case 2:
                System.out.print("Enter the century: ");
                century = input.nextInt();
                if (century % 400 == 0) {
                    System.out.println(century + " is a leap year century.");
                } else {
                    System.out.println(century + " isn't a leap year century.");
                }
                break;
            default:
                System.out.println("Wrong input.");
                break;
        }
        input.close();
    }
}
