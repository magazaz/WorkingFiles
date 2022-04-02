package Day23_Loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 99999999;
        int entry = 0;
        while (entry < 5) {
            entry++;
            System.out.printf("Please enter a number: ");
            int number = input.nextInt();
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number is: " + max + "\nMinumum number is: " + min);
    }
}
