package com.dojo.cursos.model;

import java.util.UUID;

public class Cursos {

    private String id = UUID.randomUUID().toString().substring(0, 5);
    private String nombre;
    private int horas;

    public Cursos( String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
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

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", horas=" + horas +
                '}';
    }
}
