
package com.example.prubapostgres.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "animal")
public class Animal {
    
    @Id
    private int id;
    private String nombre;
    private int numpatas;

    public Animal() {
    }

    public Animal(int id, String nombre, int numpatas) {
        this.id = id;
        this.nombre = nombre;
        this.numpatas = numpatas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumpatas() {
        return numpatas;
    }

    public void setNumpatas(int numpatas) {
        this.numpatas = numpatas;
    }
}