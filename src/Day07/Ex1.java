package Day07;

public class Ex1 {
    public static void main(String[] args) {
        int g = 1;
        g++; // 2
        System.out.println(g++); // print 2, 3 in memory
        System.out.println(g); // 3
        int age = 20;
        System.out.println(age); //20
        System.out.println(age++);
        System.out.println(age);

        System.out.println(age++); // 21
        System.out.println(age); // 22

        System.out.println(++age); // 23
        int a = 10;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        int i = 100;
        ++i;
        System.out.println(i);

        int z = ++i;
        System.out.println("z value is " + z);
        System.out.println(i);

        int x = 5; //6
        int y = x++; //5

        System.out.println(x);
        System.out.println(y);
        System.out.println(y);
    }
}
