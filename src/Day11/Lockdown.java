package Day11;

import java.util.Scanner;

public class Lockdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter a year: ");
        int year = input.nextInt();
        if (year <= 2022 && year >= 2020) {
            System.out.printf("Stay at home!");
        } else {
            System.out.printf("Time to go out!");
        }
    }
}
