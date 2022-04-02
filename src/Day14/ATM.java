package Day14;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner atm = new Scanner(System.in);
        int pin = 1234;
        double balance = 2000;
        System.out.printf("Enter your PIN number: ");
        int pincode = atm.nextInt();
        if (pin == pincode) {
            System.out.printf("Please choose the option: \n1. Show balance \n2. Money withdrawal \n3. Money deposit\n");
            int option = atm.nextInt();
            if (option == 1) {
                System.out.printf("Your balance is: $" + balance);
            } else if (option == 2) {
                System.out.printf("Enter amount to withdraw: ");
                double withdrawal = atm.nextDouble();
                balance -= withdrawal;
                System.out.printf("Please take your money from ATM. Remaining balance is $" + balance + "\nDo you wish to proceed with another transaction?");
                System.out.printf("");
            } else if (option == 3) {
                System.out.printf("Please enter amount you are depositing: ");
                double deposit = atm.nextDouble();
                balance += deposit;
                System.out.printf("Your current balance is $" + balance + "\nDo you wish to proceed with another transaction?");
            } else {
                System.out.printf("Invalid selection. Please Try again.");
            }
            } else {
            System.out.printf("Incorrect PIN. Please Try again. You have 2 attempts left.");
        }
    }
}
