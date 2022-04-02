package Day09;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        /*
        create a Scanner object
        ask the user to enter 2 numbers
        check if the numbers are equal to each other
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = input.nextInt();
        System.out.println("Please enter number 2");
        int num2 = input.nextInt();
        System.out.println("Numbers are equal: " + (num1 == num2));
    }
}
