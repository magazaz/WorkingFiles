package Day20_Strings_practice;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().trim();
        int spaceIndex = word.indexOf(' ');
        String firstWord = word.substring(0, spaceIndex);
        String finalWord = word.substring(spaceIndex + 1) + " " + firstWord;
        System.out.println(finalWord);
    }
}
