package ro.fasttrackit.curs7;

public class Door {
    private boolean open;
    private boolean locked;

    public Door() {
        open = false;
        locked = false;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClosed() {
        return !isOpen();
    }

    public boolean isLocked() {
        return locked;
    }

    public void unlock() {
        locked = false;
    }

    public void lock() {
        if (isOpen()) {
            System.out.println("The door is opened. Cannot be locked");
        } else {
            locked = true;
        }
    }

    public void open() {
        if (!isLocked()) {
            open = true;
        } else {
            System.out.println("The door is locked. Cannot be opened");
        }
    }

    public void close() {
        open = false;
    }

    public String toString() {
        return "opened=" + open +
                ", locked=" + locked;
    }
}
