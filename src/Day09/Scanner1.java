package Day09;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner azamat = new Scanner(System.in);
        String text1 = azamat.nextLine();
        String text2 = azamat.nextLine();
        String text3 = azamat.nextLine();

        System.out.println("Three words are " + text1 + " " + text2 + " " + text3);
    }
}
