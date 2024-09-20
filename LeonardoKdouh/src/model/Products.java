package model;

import interfaces.IDiscount;

public abstract class Products {

    private int id;
    private int stock;
    private String name;
    private float price;

    public Products(int id, int stock, String name, float price) {
        this.id = id;
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    public Products() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", stock=" + stock +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
