package model.people;

public class Workers extends People{
    private int id;
    private String shift;


    public Workers(int id,String name, String lastName, int age, String shift) {
        super(name, lastName, age);
        this.id=id;
        this.shift=shift;
    }
}
