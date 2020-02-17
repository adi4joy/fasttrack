package ro.fasttrackit.curs8.TryStatic.interfaces.messages;

public class Main {
    public static void main(String[] args) {
        SendMessages post = new Post();
        SendMessages messenger = new Messenger();
        SendMessages email = new Email();
        SendMessages clouds = new Clouds();

        new Expeditor(post).deliverMessage();
    }
}
