package model;

public class Chair extends Furniture{

    private boolean hasWheels;

    public Chair(int id, int stock, String name, float price, boolean hasWheels) {
        super(id, stock, name, price);
        this.hasWheels=hasWheels;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    @Override
    public String toString() {
        return super.toString()+"Chair{" +
                "hasWheels=" + hasWheels +
                '}';
    }
}
