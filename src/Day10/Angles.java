package Day10;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        /*
    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */
        System.out.printf("Enter three angles:\n");
        Scanner angles = new Scanner(System.in);
        float angle1 = angles.nextFloat();
        float angle2 = angles.nextFloat();
        float angle3 = angles.nextFloat();
        float sumOfAngles = angle1 + angle2 + angle3;
        boolean triangle = sumOfAngles == 180;
        boolean circle = sumOfAngles == 360;
        System.out.println("Is triangle: " + triangle);
        System.out.println("Is circle: " + circle);
    }
}
