package Day23_Loops;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 56;
        int guess;
        do {
            System.out.printf("Guess the number between 1 and 100: ");
            guess = input.nextInt();
            if (guess < num) {
                System.out.printf("Number is too low\n");
            } else if (guess > num) {
                System.out.printf("Number is too high\n");
            }
        } while (guess != num);
        System.out.printf("Bingo!");
    }
}
