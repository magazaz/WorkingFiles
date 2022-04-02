package Day06;

public class Casting_practice {
    public static void main(String[] args) {
    int num1 = 10;
    float num2 = num1;
    int num3 = (int)num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        double num4 = 100.055;
        int num5 = (int)num4;
        System.out.println(num4);
        System.out.println(num5);

        char letter = 'a';
        int letter2 = letter;

        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter);
        System.out.println((char)66);
        System.out.println((int)'z');
    }


}
