import model.Personas;
import model.TemperatureExeption;
import service.TesteosService;
import service.PersonasService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TemperatureExeption, IOException {

        String sickPeople = "urgente.dat";
        String outputTodos = "todos.json";


        //Creacion de objetos de tipo person e inclusion dentro del set
        PersonasService personService = new PersonasService();
        Personas persona1 = new Personas(1, "Juan", "Gomez", 22, "Barrio 1", 12345, "trabajador", 23);
        Personas persona2 = new Personas(2, "Jose", "Suarez", 33, "Barrio 2", 66666, "noTrabajo", 45);
        Personas persona3 = new Personas(3, "Pepe", "Rodo", 44, "Barrio 3", 23232, "estudia", 34);
        Personas persona4 = new Personas(4, "Silvio", "Rodriguez", 55, "Barrio 4", 33333, "vive", 44);

        personService.incluirPersonas(persona1);
        //PERSONA CON EL MISMO DNI SOLO PARA VER SI NO LO AGREGA Y EL METODO EQUALS ANDA
        personService.incluirPersonas(persona2);
        personService.incluirPersonas(persona3);
        personService.incluirPersonas(persona4);
        //Se mostrara la lista de personas
        personService.mostrarListaPersonas();


        TesteosService kitService = new TesteosService();
        kitService.testear(personService.getPersonSet());


        //CREO EL ARCHIVO DE LA GENTE ENFERMA
        TesteosService.createFileOfEnfermos(sickPeople);


        //CREO EL ARCHIVO DE TODOS JUNTOS
        kitService.saveEverything(outputTodos);

    }
}