package Day19_String_day2;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        System.out.printf("Enter a word:");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        System.out.println("First letter is: " + sentence.charAt(0));
        System.out.println("Last letter is: " + sentence.charAt(sentence.length()-1));
    }
}
