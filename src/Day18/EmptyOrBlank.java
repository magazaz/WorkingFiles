package Day18;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String name = "";
        System.out.println(name.isEmpty());
        String surname = " ";
        System.out.println(surname.isBlank());
        System.out.println(surname.length() == 1);
        surname = "Magaz";
        System.out.println(surname.isBlank());
    }
}
