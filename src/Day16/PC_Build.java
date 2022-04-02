package Day16;

import java.util.Scanner;

public class PC_Build {
    public static void main(String[] args) {
        /*Select screen size:

For a screen size of 13.3, add $200 to the total price
For a screen size of 15.0, add 300 to the total price
For screen size of 17.3, add $400 to the total price
Then ask the user about the CPU

Select CPU type:

For a CPU of i3, add $150 to the total price
For a CPU of i5, add $250 to the total price
For a CPU of i7, add $350 to the total price
Then ask the user about the RAM size

Select RAM size:

Add $50 to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4
Then ask the user about the storage type and amount

Select storage type:

Select storage size:

For HDD, add $50 to the total price for every 500GB
For SSD, add $100 to the total price for every 500GB
Then ask the user about the screen resolution

Select screen resolution:

For FULLHD, add $100 to the total price
For 4K, add $200 to the total price
At the end display the total price of the custom computer

Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

         */
        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        System.out.printf("Select screen size: ");
        double screenSize = input.nextDouble();
        boolean screen13 = screenSize == 13.3;
        boolean screen15 = screenSize == 15.5;
        boolean screen17 = screenSize == 17.3;
        if (screen13) {
            totalPrice += 150;
        } else if (screen15) {
            totalPrice += 300;
        } else if (screen17) {
            totalPrice += 400;
        } else {
            System.out.printf("Invalid input");
        }
        System.out.printf("Select CPU type: ");
        input.nextLine();
        String cpu = input.nextLine();
        switch (cpu) {
            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;
            default:
                System.out.printf("Invalid input");
        }
        System.out.printf("Select RAM size: ");
        int ram = input.nextInt();
        int ramMultiplier = ram / 4;
        totalPrice += ramMultiplier * 50;
        System.out.printf("Select storage type: ");

        input.nextLine();
        String storageType = input.nextLine();
        int storageMultiplier = 0;
        switch (storageType) {
            case "HDD":
                storageMultiplier = 50;
                break;
            case "SSD":
                storageMultiplier = 100;
                break;
            default:
                System.out.printf("Invalid input");
        }
        System.out.printf("Select storage size: ");
        int storageSize = input.nextInt();
        totalPrice += storageSize / 500 * storageMultiplier;

        System.out.printf("Select screen resolution: ");
        input.nextLine();
        String resolution = input.nextLine();
        switch (resolution) {
            case "FULLHD":
                totalPrice += 100;
                break;
            case "4K":
                totalPrice += 200;
                break;
            default:
                System.out.printf("Invalid input");
        }
        System.out.println("Laptop price is: $" + totalPrice);

    }
}
