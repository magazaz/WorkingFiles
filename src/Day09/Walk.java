package Day09;

import java.util.Scanner;

public class Walk {
    public static void main(String[] args) {
        Scanner weather = new Scanner(System.in);
        System.out.printf("Is it raining?:\n");
        boolean rain = weather.nextBoolean();
        System.out.printf("What is the temperature outside?:\n");
        int temp = weather.nextInt();
        System.out.println("We are going outside for a walk: " + (!rain && temp >= 70));

    }
}
