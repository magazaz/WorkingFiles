package Day20_Strings_practice;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        /*
        first name
        last name
        fix to print proper name:
        capital first letter, the rest of the letters lowercase, no extra space
         */
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter your first name: ");
        String firstName = input.next().toLowerCase();
        System.out.printf("Please enter your last name: ");
        String lastName = input.next().toLowerCase();
        System.out.println("\n" + firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " " + lastName.toUpperCase().substring(0, 1) + lastName.substring(1));


    }
}
