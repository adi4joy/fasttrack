package ro.fasttrackit.curs8.TryStatic.interfaces.messages;

public class Messenger implements SendMessages {
    public void sendMessage(String message) {
        System.out.println("Sending " + message + " by Messenger");
    }
}
