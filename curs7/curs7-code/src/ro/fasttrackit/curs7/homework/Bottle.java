package ro.fasttrackit.curs7.homework;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open = true;

    public Bottle() {
        this(500, 0);
    }

    public Bottle(int totalCapacity) {
        this(totalCapacity,0);
    }

    public Bottle(int totalCapacity, int availableLiquid) {
        if (totalCapacity > 0) {
            this.totalCapacity = totalCapacity;
        } else {
            this.totalCapacity = 500;
        }
        if (availableLiquid > 0 && availableLiquid <= totalCapacity) {
            this.availableLiquid = availableLiquid;
        } else if (availableLiquid < 0) {
            this.availableLiquid = 0;
        } else {
            this.availableLiquid = this.totalCapacity;
        }
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClose() {
        return !open;
    }

    public boolean hasLiquid() {
        if (getAvailableLiquid() > 0 && getAvailableLiquid() < totalCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public int emptyCapacity() {
        return totalCapacity - getAvailableLiquid();
    }

    public String open() {
        if (isOpen()) {
            return "You can't open an opened bottle";
        } else {
            this.open = true;
            return "The bottle has been opened";
        }
    }

    public String close() {
        if (isClose()) {
            return "You can't close a closed bottle";
        } else {
            this.open = false;
            return "The bottle has been closed";
        }
    }

    public String drink(int amount) {
        if (isOpen()) {
            if (availableLiquid >= amount) {
                availableLiquid -= amount;
                return "You drank " + amount + " ml so the bottle has " + availableLiquid + " ml";
            } else {
                return "There is not enough liquid";
            }
        } else {
            return "You can't drink from a closed bottle";
        }
    }
}
