package Day12;

import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {
         /*
    create a double variable for your hourly rate
create a double variable for the number of hours worked
calculate your net pay, with consideration of overtime pay
    if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
        (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */
        Scanner time = new Scanner(System.in);
        System.out.printf("Enter hours amount: ");
        double hours = time.nextDouble();
        double rate = 30;
        double normalHours = 8.0;
        double overtimeRate = rate * 1.5;
        double netPay;
        double overtimeHours = hours - normalHours;
        String message;
        if (hours > normalHours) {
            netPay = normalHours * rate + overtimeHours * overtimeRate;
            System.out.println("You worked " + overtimeHours + " overtime hours. You get $" + normalHours * rate + " for regular hours and $" + overtimeHours * overtimeRate + " for overtime hours.");
        } else {
            System.out.println("You worked no overtime hours. Your pay is $" + normalHours * rate + " for regular hours.");
        }
    }
}
