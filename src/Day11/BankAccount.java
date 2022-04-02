package Day11;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 500;
        double overdraft = 50;
        System.out.printf("Enter withdrawal amount: ");
        double withdrawal = input.nextDouble();
        if ((balance - withdrawal) > 0) {
            balance -= withdrawal;
        } else {
            balance -= withdrawal;
            balance -= overdraft;
        }
        System.out.printf("Your current balance is: $" + balance);
    }
}
