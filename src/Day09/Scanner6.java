package Day09;

import java.util.Scanner;

public class Scanner6 {
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
        boolean isWeekend = false;
        boolean isPolice = false;
        boolean isfirefighter = true;
        boolean discountEligible = !isWeekend && (isPolice || isfirefighter);
        System.out.println(discountEligible);
    }
}
