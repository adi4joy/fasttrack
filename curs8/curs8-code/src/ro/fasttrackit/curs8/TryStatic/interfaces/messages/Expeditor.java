package ro.fasttrackit.curs8.TryStatic.interfaces.messages;

public class Expeditor {
        private SendMessages message;

    public Expeditor(SendMessages message) {
        this.message = message;
    }

        public void deliverMessage() {
        this.message.sendMessage("this awesome message");
        System.out.println("Message sent!");
    }
}
