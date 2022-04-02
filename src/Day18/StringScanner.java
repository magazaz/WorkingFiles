package Day18;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
     /*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:
        java is bad
        quit
        have fun
        crying
    if there is a bad phrase in the message print:
        message failed to send
    otherwise print:
	$message sent
     */
        System.out.println("Please enter a message:");
    Scanner input = new Scanner(System.in);
    String message = input.nextLine().toLowerCase();
    message = message.trim();
    if (message.contains("java is bad") || message.contains("quit") || message.contains("have fun") || message.contains("crying")) {
        System.out.println("Incorrect message");
    } else {
        System.out.printf("Message sent");
    }


    }
}
