package Day08;

public class Test1 {
    public static void main(String[] args) {
        int age = 3;

        boolean isKid = age <=13;
        boolean isSenior = age >= 65;

        System.out.println("You are a kid: " + isKid);
        System.out.println("You are a senior: " + isSenior);
        System.out.println(5 + 2 * 3);
        System.out.println(5 * 2 + 4 / 2);
        System.out.println(5 + 2 > 4 -3);

        int a = 20; // 20 -> 19 -> 20 -> 19 -> 18
        int b = -a-- + a++ + --a * a--;
        //      -20  + 19  + 19 * 19 = 360

        System.out.println(a);
        System.out.println(b);
    }
}
