package Day09;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         /*
        Task
            declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter
             Do you get a discount?
                Must be a weekend day and you must be one of the given professions
     */
        System.out.printf("Please enter number of day: ");
        int weekend = scan.nextInt();
        System.out.printf("Are you a police officer? Y/N?:");
        String policeOfficerTest = scan.next();
        System.out.printf("Are you a firefighter? Y/N?:");
        String firefighterTest = scan.next();
        boolean discountEligibility = (policeOfficerTest == "Y" || firefighterTest == "Y" || weekend == 6 || weekend ==7);
        System.out.printf("You are eligible for discount: " + discountEligibility);
    }
}
