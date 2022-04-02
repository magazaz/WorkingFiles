package Day11;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.printf("Please enter any amount of seconds:");
        int seconds = time.nextInt();
        int hours = seconds / 3600;
        int min = (seconds / 60 % 60);
        int sec = seconds % 60;
        System.out.println(hours + ":" + min + ":" + sec);

    }
}
