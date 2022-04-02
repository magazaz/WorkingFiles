package Day14;

import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        /*
    Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.
	- The person must be a citizen or a resident
		-> If not print: You must be a citizen or a resident
	- Their age must be between 18 and 35
		-> If not print: Your age must be between 18 to 35 years old
	- They must have a high school diploma
		-> If not print: You must have a high school diploma
	> If all the criteria is met print: You are qualified for the Army
     */
        Scanner input = new Scanner(System.in);
        System.out.printf("Are you a citizen?: ");
        boolean citizen = input.nextBoolean();
        if (!citizen) {
            System.out.printf("You must be a citizen");
        } else {
            System.out.printf("Are you resident?: ");
            boolean resident = input.nextBoolean();
            if (!resident) {
                System.out.printf("You must be a resident");
            } else {
                System.out.printf("Enter your age: ");
                int age = input.nextInt();
                if (age <= 18 || age >= 35) {
                    System.out.printf("Your age must be between 18 and 35 years old");
                } else {
                    System.out.printf("Do you have high school diploma? ");
                    boolean diploma = input.nextBoolean();
                    if (!diploma) {
                        System.out.printf("You must have a high school diploma");
                    } else {
                        System.out.printf("You are qualified for the Army");
                    }
                }
            }
        }
    }
}