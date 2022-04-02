package Day19_String_day2;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter three words: ");
        String firstWord = input.next().toLowerCase();
        String secondWord = input.next();
        String thirdWord = input.next();
        String longestWord = "";
        if (firstWord.contains("a")) {
            longestWord = firstWord;
        }
        if (secondWord.contains("a") && secondWord.length() > longestWord.length()) {
            longestWord = secondWord;
        }
        if (thirdWord.contains("a") && thirdWord.length() > longestWord.length()) {
            longestWord = thirdWord;
        }
        System.out.println(longestWord.isEmpty() ? "No single biggest word with a" : longestWord + " is the longest with a");
    }
}
