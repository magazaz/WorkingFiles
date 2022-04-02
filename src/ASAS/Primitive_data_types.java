package ASAS;

import java.util.Locale;

public class Primitive_data_types {
    public static void main(String[] args) {
        double Year;
        Year = 305.52;
        Year = 144.222;
        System.out.println(Year);
        long Gnumber;
        Gnumber = 123456789123456L;
        System.out.println(Gnumber);
        int month = 2;
        int day = 5;
        int year = 2022;
        System.out.println(month+"/"+day+"/"+year);
        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have: " + apples);
        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: " + bananas);

        System.out.println("sold some apples");
        apples = 30; // reassigning apples to have value of 25
        System.out.println("Apples after selling: " + apples);

        int price = 15;

        //  System.out.println("The price of my 25 apples is $20"); hard coded
        System.out.println("The price of my " + apples  + " apples is $" + price);
        int Birth_Year;
        Birth_Year = 2022;
        System.out.println(Birth_Year);
        String name = "Azamat";
        System.out.println("Hello "+ name+"!");
        String firstname = "John";
        String lastname = "Doe";
        String fullname = firstname+" "+lastname;
        System.out.println(fullname);
        String school = "Bond Lake";
        System.out.println(school.toUpperCase(Locale.ROOT));






    }}
