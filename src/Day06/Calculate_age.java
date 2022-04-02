package Day06;

public class Calculate_age {
    public static void main(String[] args) {
         /*
        create a class CalculateAge
        add a main method
        declare and assign these variables:
        current year, year you were born
        calculate your age from the two variables.
        Print: I'm $years old
         */
        int currentYear = 2022;
        int yearOfBirth = 1985;
        int yearOld = currentYear - yearOfBirth;
        System.out.printf("I'm " + yearOld + " years old");
    }
}
