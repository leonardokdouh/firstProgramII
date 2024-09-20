package model;

public abstract class Technology extends Products {

    private String factoryName;

    public Technology(int id, int stock, String name, float price, String factoryName) {
        super(id, stock, name, price);
        this.factoryName = factoryName;
    }

    public Technology() {
    }


    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return  "Technology - Product:" +
                "factoryName = " + factoryName + '\'' +
                '}' + super.toString();
    }
}
