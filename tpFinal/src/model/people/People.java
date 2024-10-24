package model.people;

import java.util.Objects;

public abstract class People {

    private String name;
    private String lastName;
    private int age;


    public People(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age =age;
    }

    public People(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name) && Objects.equals(lastName, people.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }

    @Override
    public String toString() {
        return "People{" +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
