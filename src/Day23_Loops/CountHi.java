package Day23_Loops;

public class CountHi {
    public static void main(String[] args) {
        String str = "aaaaahiahihipfghibbsdbdsfbsl";
        int count = 0;
        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
                count++;
            }
        }
        System.out.println(count);
    }
}
