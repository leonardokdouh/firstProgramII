package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.NotEnoughKitsExeption;
import model.Personas;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class PersonasService {
    private ObjectMapper myMapper;

    public Set<Personas> mySet= new HashSet<Personas>();
    
    public PersonasService() {
        this.myMapper = new ObjectMapper();
    }

    public void incluirPersonas(Personas person) {
        mySet.add(person);
    }

    public void mostrarListaPersonas() {
        for (Personas person : mySet) {
            System.out.println(person);
        }
    }

    public Set<Personas> getPersonSet(){
        return mySet;
    }


}
