package ro.fasttrackit.curs8.TryStatic.interfaces.messages;

public class Email implements SendMessages {
    public void sendMessage(String message) {
        System.out.println("Sending " + message + " by Email");
    }
}
