package Day09;

public class test2 {
    public static void main(String[] args) {
        int w = 78 / 2 * 2 + 3 - 5 % 5;
        //        81

        System.out.println(w);
        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        // w = -20 + -19 + 19 * 19 % 2
        // w = -39 + 361 % 2 = -38
        System.out.println(W);
        int e = 1; // e = 1 -> 0 -> 1 -> 0 -> -1
        int f = -e-- + e++ / -e-- * --e;
        // f = -1 + 0 / -1 * -1 = -1
        System.out.println(f);

        int apples = 5;
        int oranges = 10;

        System.out.println(apples > 1 && oranges < 5);
        System.out.println(apples > 10 || oranges == 10);
        System.out.println(apples > 10 && oranges == 10);

        int a = 0;

        System.out.println(false || a++ == 0);
        System.out.println(a);
    }
}
