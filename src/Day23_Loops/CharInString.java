package Day23_Loops;

public class CharInString {
    public static void main(String[] args) {
        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            System.out.println((int)s.charAt(i) + " "); // shows abcd as an integer value (each letter has an integer askew code)
        }
    }
}
