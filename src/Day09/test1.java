package Day09;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*
        create and assign these variables:
            name
            are they citizen
            do have criminal background
            age
            sample inputs:
                "James Bond"
                true
                false
                49
        determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18
        print : $name is eligible to vote: $boolean
     */
        Scanner vote = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = vote.nextLine();
        System.out.println("Are you citizen?");
        boolean citizenTest = vote.nextBoolean();
        System.out.printf("Do you have criminal record?\n");
        boolean criminalRecordTest = vote.nextBoolean();
        System.out.printf("Enter your age: ");
        int age = vote.nextInt();
        boolean eligibilityToVote = citizenTest && !criminalRecordTest && (age >= 18);
        System.out.println(name + " is eligible to vote: " + eligibilityToVote);
    }
}
