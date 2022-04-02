package Day22_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to TD ATM!");
        int attempts = 0;
        int PIN = 1234;
        int entPIN = 0;
        do {
            System.out.printf("Enter your PIN:");
            entPIN = input.nextInt();
            attempts++;
        }
        while (attempts < 3 && PIN != entPIN);
        if (entPIN == PIN) {
            System.out.printf("Logged in");
        } else {
            System.out.printf("Limit of attempts has been exceeded");
        }
    }
}
