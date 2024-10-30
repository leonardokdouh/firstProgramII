package model;

public class TemperatureExeption extends Throwable{


    public TemperatureExeption(Integer testNumber, String barrio) {
        super("The test number is: " + testNumber + "  barrio " + barrio);
    }

}
