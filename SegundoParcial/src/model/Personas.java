package model;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Personas {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("apellido")
    private String apellido;
    @JsonProperty("edad")
    private Integer edad;
    @JsonProperty("barrio")
    private String barrio;
    @JsonProperty("dni")
    private Integer dni;
    @JsonProperty("ocupacion")
    private String ocupacion;

    @JsonProperty("kitNumero")

    private Integer kitNumber;

    public Personas(Integer id, String nombre, String apellido, Integer edad, String barrio, Integer dni, String ocupacion, Integer kitNumber) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.barrio = barrio;
        this.dni = dni;
        this.ocupacion = ocupacion;
        this.kitNumber = kitNumber;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getKitNumber() {
        return kitNumber;
    }

    public void setKitNumber(Integer kitNumber) {
        this.kitNumber = kitNumber;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", barrio='" + barrio + '\'' +
                ", dni=" + dni +
                ", ocupacion='" + ocupacion + '\'' +
                ", kitNumber=" + kitNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personas personas = (Personas) o;
        return Objects.equals(dni, personas.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
