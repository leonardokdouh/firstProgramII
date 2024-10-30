package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Personas;
import model.TemperatureExeption;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class TesteosService {

    public static Map<String, Map<Integer, Integer>> enfermos = new HashMap<String, Map<Integer, Integer>>();
    public Map<String, Map<Integer, Integer>> sanos = new HashMap<String, Map<Integer, Integer>>();

    private static ObjectMapper myMapper;

    public TesteosService() {
        this.myMapper = new ObjectMapper();
    }


    //Metodo para testear, recibe una lista de personas y una lista de Kits
    public void testear(Set<Personas> setDePersonas) throws TemperatureExeption, IOException {
        Map<Integer, Integer> midleMap = new HashMap<Integer, Integer>();
        for (Personas person : setDePersonas) {
            Integer temperature = (int) (Math.random() * (39 - 36 + 1) + 36);
            midleMap.put(person.getDni(), temperature);

            if (temperature > 38) {
                enfermos.put("aislar", midleMap);
                //Si arrojo la excepcion, revienta todo.
                //aislar(person);
            } else {
                sanos.put("sanos", midleMap);
            }
        }

    }


    public void aislar(Personas p) throws TemperatureExeption {
        throw new TemperatureExeption(p.getKitNumber(), p.getBarrio());
    }

    public static void createFileOfEnfermos(String archivo) throws IOException {
        myMapper.writeValue(new File(archivo), enfermos);
    }


    //CREO UN JSON FILE CON AMBOS MAPAS
    public void saveEverything(String archivo) throws IOException {
        Map<String, Map<Integer, Integer>> mergedRequestParam = new HashMap<>();
        mergedRequestParam.putAll(sanos);
        mergedRequestParam.putAll(enfermos);
        myMapper.writeValue(new File(archivo), mergedRequestParam);
    }


}
