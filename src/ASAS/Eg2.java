package ASAS;

import java.util.Scanner;

public class Eg2 {
    /*
    create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23, print: Good night
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        if (time >= 6 && time <= 11)
            System.out.print("Good Morning!");
        else if (time >= 12 && time <= 18)
            System.out.printf("Good Evening");
        else if (time >= 19 && time <= 24)
            System.out.println("Good night");


    }
}
