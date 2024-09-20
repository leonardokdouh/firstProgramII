package model;

public abstract class Furniture extends Products{


    public Furniture(int id, int stock, String name, float price){
        super(id, stock, name, price);
    }




    @Override
    public String toString() {
        return "Furniture{}";
    }
}
