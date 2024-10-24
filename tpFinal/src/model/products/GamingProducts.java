package model.products;

public class GamingProducts extends Products{

    private int id;
    private String console;

    public GamingProducts(int id, String console, String name, int price, int days) {
        super(name, price, days);
        this.id=id;
        this.console=console;

    }

    public GamingProducts(){

    }


}
