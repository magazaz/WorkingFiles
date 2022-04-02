package Day14;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
         /*
    declare and assign an age variable
use these ranges to determine which age group you belong to
	if the given age value is less than 0 or more than 120:
		print: Invalid age
	otherwise uses these to determine the age group
		Baby (2 years and below)
		Toddler (3 - 5)
		Kid (6 - 9
		Pre-Teen (10 - 12)
		Teenager (13 - 17)
		Young Adult (18 - 20)
		Adult (21 - 35)
		Middle-Aged Adult (36 - 55)
		Senior Citizen (55+)
     */
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter your age: ");
        int age = input.nextInt();
        if (age > 120 || age <= 0) {
            System.out.printf("Invalid input");
        } else if (age <= 2) {
            System.out.printf("You are baby");
        } else if (age >= 3 && age <= 5) {
            System.out.printf("You are toddler");
        } else if (age >=6 && age <= 9) {
            System.out.printf("You are kid");
        } else if (age >= 10 && age <= 17) {
            System.out.printf("You are teenager");
        } else if (age >= 18 && age <= 64) {
            System.out.printf("You are adult");
        } else if (age >= 65) {
            System.out.printf("You are senior citizen");
        }
        }

    }
