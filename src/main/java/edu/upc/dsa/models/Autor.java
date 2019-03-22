package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Autor {
    private String id;
    private String nombre;

    public Autor() {
        this.id = RandomUtils.getId();
    }

    public Autor(String nombre){

        this();
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
