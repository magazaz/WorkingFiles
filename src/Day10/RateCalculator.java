package Day10;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
         /*
    write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
     */
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter salary amount: ");
        double salary = input.nextDouble();
        System.out.printf("How many hours do you work in a week?: ");
        int hours = input.nextInt();
        double rate = salary / (hours * 52);
        System.out.printf("Your hourly rate is: " + "$" + rate);

    }
}
