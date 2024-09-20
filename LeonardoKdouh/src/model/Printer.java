package model;

import interfaces.IDiscount;

public class Printer extends Technology  implements IDiscount {

private int printsPerMinute;

public Printer(int id, int stock, String name, float price, String factoryName, int printsPerMinute) {
    super(id, stock, name, price, factoryName);
    this.printsPerMinute = printsPerMinute;
}


    public int getPrintsPerMinute() {
        return printsPerMinute;
    }

    public void setPrintsPerMinute(int printsPerMinute) {
        this.printsPerMinute = printsPerMinute;
    }

    @Override
    public String toString() {
        return  super.toString() + "Printer{" +
                "printsPerMinute=" + printsPerMinute +
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
