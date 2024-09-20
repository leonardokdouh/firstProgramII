package model;

import interfaces.IDiscount;

public class Chair extends Furniture  implements IDiscount {

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

    @Override
    public float applyDiscount(float discount) {
        float aux= super.getPrice();
        System.out.println("The original price was:");
        System.out.println(super.getPrice());
        aux= aux* (1 - discount/100);
        return aux;
    }
}
