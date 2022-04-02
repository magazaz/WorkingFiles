package Day09;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner azamat = new Scanner(System.in);
        System.out.println("Enter Last Name: ");
        String lastName = azamat.nextLine();
        System.out.println("Enter First Name: ");
        String firstNmae = azamat.nextLine();
        System.out.println("Last and First names are: " + lastName + " " + firstNmae);
    }
}
