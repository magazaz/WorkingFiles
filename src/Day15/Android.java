package Day15;

import java.util.Scanner;

public class Android {
    public static void main(String[] args) {
        /*Android is one of the popular mobile operating systems. The versions in android systems follow names related to sweets. You will need to take the given version value to output the name of the current version. Use the follow chart to determine the versions:
Note: The version will be given as a String
Versions

1.5 - Cupcake
1.6 - Donut
2.1 - Eclair
2.2 - Froyo
2.3 - Gingerbread
3.1 - Honeycomb
4.0 - Ice Cream Sandwich
4.1 - Jelly Bean
4.4 - KitKat
5.0 - Lollipop
8.0 - Oreo
9.0 - Pie
Any other number is invalid and should display: Not a valid version
Note: Its possible to use if statements to complete this, but use switch statement for practice. Or for even more practice, complete the task twice, once using each different conditional statement.
Main topics: switch statements, primitive variables, Scanner
*/
Scanner input = new Scanner(System.in);
        System.out.printf("Enter android version:\n");
        String androidVersion = input.nextLine();
        String androidName = "";
        switch (androidVersion) {
            case "1.5":
                androidName = "Cupcake";
                break;
            case "1.6":
                androidName = "Donut";
                break;
            case "2.1":
                androidName = "Eclair";
                break;
            case "2.2":
                androidName = "Froyo";
                break;
            case "2.3":
                androidName = "Gingerbread";
                break;
            case "3.1":
                androidName = "Honeycomb";
                break;
            case "4.0":
                androidName = "Ice Cream Sandwich";
                break;
            case "4.1":
                androidName = "Jelly Bean";
                break;
            case "4.4":
                androidName = "KitKat";
                break;
            case "5.0":
                androidName = "Lollipop";
                break;
            case "8.0":
                androidName = "Oreo";
                break;
            case "9.0":
                androidName = "Pie";
                break;
            default:
                androidName = "Invalid input";
        }
        System.out.println(androidName);


    }
}
