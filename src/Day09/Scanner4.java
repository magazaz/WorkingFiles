package Day09;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner address = new Scanner(System.in);
        System.out.println("Print your street name: ");
        String streetName = address.nextLine();
        System.out.println("Print your street number: ");
        String streetNumber = address.nextLine();
        System.out.println("Your address is: " + streetNumber + " " + streetName);
    }
}
