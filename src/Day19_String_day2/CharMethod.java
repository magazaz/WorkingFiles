package Day19_String_day2;

public class CharMethod {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        int lastIndex = s.length() - 1;
        System.out.println(lastIndex);
        char lastChar = s.charAt(lastIndex);
        System.out.println(lastChar);
    }
}
