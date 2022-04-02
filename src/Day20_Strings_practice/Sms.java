package Day20_Strings_practice;

public class Sms {
    public static void main(String[] args) {
        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        int senderStart = msg.indexOf('<');
        int senderEnd = msg.indexOf('>');
        System.out.println("Sender name: " + msg.substring(senderStart + 1, senderEnd));

        int numberStart = msg.indexOf('[');
        int numberEnd = msg.indexOf(']');
        System.out.println("Cell number: " + msg.substring(numberStart + 1, numberEnd));

        int messageStart = msg.indexOf('{') + 1;
        int messageEnd = msg.indexOf('}');
        System.out.println("Message: " + msg.substring(messageStart, messageEnd));
    }
}
