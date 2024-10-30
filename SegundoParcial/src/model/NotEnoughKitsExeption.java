package model;

public class NotEnoughKitsExeption extends Throwable{

    private Integer amountOfTests;

    public NotEnoughKitsExeption() {
    }

    public NotEnoughKitsExeption(String message) {
        super(message);
    }

    public NotEnoughKitsExeption(String message, Integer amountOfTests) {
        super("Amount of tests not available: " + amountOfTests);
        this.amountOfTests=amountOfTests;
    }

    public Integer getAmountOfTests() {
        return amountOfTests;
    }

    public void setAmountOfTests(Integer amountOfTests) {
        this.amountOfTests = amountOfTests;
    }
}
