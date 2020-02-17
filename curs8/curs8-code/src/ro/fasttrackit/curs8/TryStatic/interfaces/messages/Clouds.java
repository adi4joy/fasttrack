package ro.fasttrackit.curs8.TryStatic.interfaces.messages;

public class Clouds implements SendMessages {
    public void sendMessage(String message) {
        System.out.println("Sending " + message + " by Clouds");
    }
}
