package Day18;

public class Recap {
    public static void main(String[] args) {
        String s = "pen"; // s is a String literal, so it is in the String pool
        String s2 = new String("pen"); // s2 is object in the heap, because we used new

        System.out.println("Compare with == " + (s == s2));
        System.out.println("Compare with .equals() " + s.equals(s2));
        System.out.println("compare with .equals() " + s.equals("Pen"));
        System.out.println("compare with .equalsIgnoreCase() " +s.equalsIgnoreCase("Pen"));
        int len = s.length();
        System.out.println(len);
        System.out.println(("aaaa").length());
        System.out.println(("aa aa").length());
    }
}
