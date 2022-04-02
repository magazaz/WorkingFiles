package Day22_loops;

import java.util.Locale;
import java.util.Scanner;

public class UniqueColors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pickedNum = 0;
        String uniqueColors = "";
        while (pickedNum < 3) {
            System.out.printf("Pick the color:\n");
            String color = input.nextLine().toLowerCase();
            if (uniqueColors.contains(color)) {
                System.out.printf("You have this color already. Pick another\n");
            } else {
                pickedNum ++;
                uniqueColors += color + " ";
            }
        }
        System.out.println("You have picked the following colors: " + uniqueColors);
    }
}
