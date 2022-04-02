package Day22_loops;

import java.util.Locale;
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keep = true;
        while (keep) {
            System.out.printf("\nEnter a message: ");
            String msg = input.nextLine().toLowerCase();

            switch (msg) {
                case "hi":
                    System.out.printf("Hi!");
                    break;
                case "hello":
                    System.out.printf("Hi!");
                    break;
                case "how are you?":
                    System.out.printf("Fine!");
                    break;
                case "what time is it?":
                    System.out.printf("It is 7 o'clock");
                    break;
                case "bye":
                    System.out.printf("Good bye!");
                    keep = false;
                    break;
                default:
                    System.out.printf("I don't know what are you talking about\n");
            }
        }

    }
}
