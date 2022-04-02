package Day18;

public class Contains {
    public static void main(String[] args) {
        String day = "Today it is above 70";
        System.out.println(day.contains("it is"));
        System.out.println(day.contains("7"));
        System.out.println(day.equalsIgnoreCase("today it is above 70"));
        System.out.println(day.contains("T") && day.contains("70"));
    }
}
