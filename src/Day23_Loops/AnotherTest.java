package Day23_Loops;

public class AnotherTest {
    public static void main(String[] args) {
        int count = 0;
        String msg = "aksdbfjkasbdfmnasbdfuhwpejkhnfklasdbalslkjasbhdfkljasd";

        for (int index = 0; index < msg.length(); index++) {
            if (msg.charAt(index) == 'a') {
                count++;

            }

        }
        System.out.println(count);

    }
}
