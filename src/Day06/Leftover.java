package Day06;

public class Leftover {
    public static void main(String[] args) {
        int num = 3725;
        int hours = num / 3600;
        System.out.println(hours);
        int min = num % 60;
        System.out.println(min);
        int noMin = num/60;
        System.out.println(noMin);
    }
}
