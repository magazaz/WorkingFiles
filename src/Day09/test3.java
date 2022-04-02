package Day09;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /*
create a class called Speeding, and write a program to determine if the car is speeding
        declare 3 variables:
        current speed, speed limit, speeding boolean
        print
        "Are you speeding? " true/false
________________________________________
     */
        Scanner speeding = new Scanner(System.in);
        System.out.printf("What is current speed?:\n");
        int speed = speeding.nextInt();
        int speedLimit = 60;
        boolean speedInfraction = speed > speedLimit;
        System.out.println("You are speeding: " + speedInfraction);
    }
}
