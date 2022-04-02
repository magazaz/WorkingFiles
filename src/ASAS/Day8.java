package ASAS;

public class Day8 {
    public static void main(String[] args) {
        char amb = 'B';
        amb += 2;
        System.out.println(amb);
        System.out.println(++amb);
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt++);
        System.out.println(myInt);
        System.out.println((int)amb);
    }
}
