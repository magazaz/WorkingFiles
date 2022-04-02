package Day06;

public class Casting {
    public static void main(String[] args) {
        short numOne = 40;
        float numTwo = numOne;

        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short)num3;

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300; // 30 is int by default, at it automatically goes up to float
        byte num6 = (byte)num5;

        System.out.println(num5);
        System.out.println(num6);


        char letter = 'A';
        int letter2 = letter;

        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter);
        System.out.println((char)66);
        System.out.println((int)'z');
        System.out.println(10.0 / 5);
        System.out.println(10 / 5.0);
        System.out.println((int)(10.0 / 5.0));
        System.out.println((int)(10.9 / 5)); // (int) -> casting

        byte b1 = 10;
        byte b2 = 20;

//        byte sum = b1 + b2; this will not work, cause the values are converted to int

        int sum = b1 + b2;

        byte sumByte = (byte) (b1 + b2);

        System.out.println(sum);
        System.out.println(sumByte);
    }
}
