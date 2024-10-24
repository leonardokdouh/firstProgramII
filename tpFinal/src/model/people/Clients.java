package model.people;

public class Clients extends People{

    private int id;


    public Clients(int id, String name, String lastName, int age) {
        super(name, lastName, age);
        this.id=id;
    }

    public Clients(){

    }
}
