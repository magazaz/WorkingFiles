package Day11;

import java.util.Scanner;

public class Hunger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Are you hungry?: ");
        boolean isHungry = input.nextBoolean();
        if (isHungry) {
            System.out.printf("Go and grab some food, bro!");
        } else {
            System.out.printf("Great, go and nail your wife!");
        }
    }
}
