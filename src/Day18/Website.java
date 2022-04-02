package Day18;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         /*
    Ask the user to enter a website
    check if it is a valid website
	- it is valid if it begins with:
		www.
	- it is valid if the end is:
		.com
		.edu
		.gov
		.net
      in cases it is not valid, tell the reason why
     */
        System.out.println("Enter website address:");
        String website = input.nextLine();
        website = website.toLowerCase();
        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");
        if (validEnd && validStart) {
            System.out.println(website + " has valid address");
        } else {
            if (!validStart) {
                System.out.printf("URL has to start with www.");
            }
            if (!validEnd) {
                System.out.printf("\nURL has to end with .com or .net or .edu or .gov");
            }
        }
    }
}
