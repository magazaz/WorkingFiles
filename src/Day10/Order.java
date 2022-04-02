package Day10;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        /*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
     */
        Scanner order = new Scanner(System.in);
        System.out.println("Please enter the product name: ");
        String product = order.nextLine();
        System.out.println("Please enter price: ");
        double price = order.nextDouble();
        System.out.println("Please enter quantity: ");
        int quantity = order.nextInt();
        order.nextLine();
        System.out.println("Please enter your full name:");
        String fullName = order.nextLine();
        System.out.println(fullName + ", your order for " + quantity + " " + product + " has been placed. Your total is " + quantity * price + ".");
    }
}
