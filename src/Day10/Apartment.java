package Day10;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner div = new Scanner(System.in);
         /*
    Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values
    Ex:
    Enter a number
    65
    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
     */
        System.out.printf("Please enter a number: ");
        int num = div.nextInt();
        boolean divBy2 = num % 2 == 0;
        boolean divBy3 = num % 3 == 0;
        boolean divBy5 = num % 5 == 0;
        System.out.printf("Divisible by 2: " + divBy2 + "\nDivisible by 3: " + divBy3 + "\nDivisible by 5: " + divBy5);


    }
}
