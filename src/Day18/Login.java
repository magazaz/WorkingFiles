package Day18;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter username: ");
        String username = input.nextLine().toLowerCase();
        System.out.printf("Enter password: ");
        String password = input.nextLine();
        if (password.length() >= 8 && password.equals("jamesbond")) {
            System.out.println("Logged in with " + username);
        } else {
            System.out.println("Invalid password");
        }
    }
}
