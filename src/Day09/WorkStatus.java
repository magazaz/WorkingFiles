package Day09;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        /*
        Task
        create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean
     */
        Scanner work = new Scanner(System.in);
        System.out.printf("Enter your First Name: ");
        String firstName = work.nextLine();
        System.out.printf("Enter your Last Name: ");
        String lastName = work.nextLine();
        System.out.printf("Are you employed?: \n");
        boolean employmentTest  = work.nextBoolean();
        System.out.printf("Are you a student?: \n");
        boolean studentTest = work.nextBoolean();
        System.out.println(firstName + " " + lastName + " is employed: " + employmentTest + "\n" + firstName + " " + lastName + " is a student: " + studentTest);


    }
}
