package com.example.prueba_base_Datos;

public class Coche
{
 private Long id;
 private String name;
 private Integer caballos;

    public Coche(Long id, String name, Integer caballos) {
        this.id = id;
        this.name = name;
        this.caballos = caballos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCaballos() {
        return caballos;
    }

    public void setCaballos(Integer caballos) {
        this.caballos = caballos;
    }
}
