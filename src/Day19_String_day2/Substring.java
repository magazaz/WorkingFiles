package Day19_String_day2;

public class Substring {
    public static void main(String[] args) {
        String str = "sunday";
        //            012345
        System.out.println(str.substring(1));
        System.out.println(str.substring(3));
        System.out.println(str);
        System.out.println("satur" + str.substring(3));

        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(0, 6));

        String word = "Washington";
        //             0123456789
        System.out.println(word.substring(0, 7));
    }
}
