package Day20_Strings_practice;

public class IndexOfExample {
    public static void main(String[] args) {
        String word = "banana";
        //012345
        int firstIndex = word.indexOf('a');
        System.out.println(firstIndex);
        int lastIndex = word.lastIndexOf('a');
        System.out.println(lastIndex);
        int secondIndex = word.indexOf('a', firstIndex +1);
        System.out.println(secondIndex);

        int thirdIndex = word.indexOf('a', secondIndex +1);
        System.out.println(thirdIndex);

    }
}
