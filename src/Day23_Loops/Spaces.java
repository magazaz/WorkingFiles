package Day23_Loops;

import java.util.Scanner;

public class Spaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a sentence: ");
        String word = input.nextLine().trim();
        int count = 0;
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
