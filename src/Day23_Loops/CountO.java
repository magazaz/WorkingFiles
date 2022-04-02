package Day23_Loops;

import java.util.Locale;

public class CountO {
    public static void main(String[] args) {
        int count = 0;
        String msg = "Ambalangodakl;k;ljja;ljkjlkjakjkljkla";
        msg = msg.toLowerCase();
        for (int index = 0; index < msg.length(); index++) {
            if (msg.charAt(index) == 'a') {
                count++;
            }
        }
        System.out.println(count); // how many "a" is in the above word
    }
}
