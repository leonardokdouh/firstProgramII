package model;

public class Printer extends Technology{

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
        return  super.toString()+ "Printer{" +
                "printsPerMinute=" + printsPerMinute +
                '}';
    }
}
