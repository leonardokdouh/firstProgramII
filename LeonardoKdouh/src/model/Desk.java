package model;

public class Desk extends Furniture{
    private float high;
    private float wide;


    public Desk(int id, int stock, String name, float price, float high, float wide ) {
        super(id, stock, name, price);
        this.high=high;
        this.wide=wide;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getWide() {
        return wide;
    }

    public void setWide(float wide) {
        this.wide = wide;
    }

    @Override
    public String toString() {
        return super.toString()+"Desk{" +
                "high=" + high +
                ", wide=" + wide +
                '}';
    }
}
