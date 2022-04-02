package Day19_String_day2;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
         /*
        Ask the user to enter their first name
        Ask the user to enter their last name
        Print the initials as uppercase letters
        james
        bond
        JB
         */
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your first name: ");
        String firstName = input.nextLine().toLowerCase().trim();
        System.out.printf("Enter your last name: ");
        String lastName = input.nextLine().toLowerCase().trim();
        System.out.println(firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0) + ".");
    }
}
