package Day19_String_day2;

public class IndexOfMethod {
    public static void main(String[] args) {
        String word = "Ambalangada";
        //             012345678910
        System.out.println(word.indexOf("A"));
        System.out.println(word.indexOf('a'));
        System.out.println(word.indexOf("l"));
        int firstIndexA = word.indexOf('a');
        int firstIndexAPlusOne = firstIndexA + 1;
        int secondIndexA = word.indexOf('a', firstIndexAPlusOne);
        int secondIndexAPlusOne = secondIndexA + 1;
        System.out.println("First index of a is: " + firstIndexA);
        System.out.println("Second index of a is: " + secondIndexA);
        System.out.println("Third index of a is: " + word.indexOf('a', secondIndexA + 1));
    }
}
