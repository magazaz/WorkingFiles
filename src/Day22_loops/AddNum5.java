package Day22_loops;

import java.util.Scanner;

public class AddNum5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        int total = 0;
        while (num<=5) {
            System.out.println("Please enter number " + num + ":");
            total += input.nextInt();
            num ++;
        }
        System.out.println("Total of entered numbers is: " + total);
    }
}
