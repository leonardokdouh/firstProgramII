package model;

import javax.swing.*;

public class Notebook extends Technology{


    private int memory;

    public Notebook(int id, int stock, String name, float price, String factoryName, int memory){
        super(id, stock, name, price, factoryName);
        this.memory=memory;
    }


    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }


    @Override
    public String toString() {
        return super.toString() + "Notebook{" +
                "memory=" + memory +
                '}';
    }
}
