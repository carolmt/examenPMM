package com.example.examenfinal;

public class ItemJuegoPokemon {

    /* El nombre del ítem.

- La categoría del ítem.

- El coste. */
    private String nombre;
    private String categoria;
    private String coste;

    public ItemJuegoPokemon(String nombre) {
        this.nombre = nombre;
    }

    public ItemJuegoPokemon(String nombre, String categoria, String coste) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.coste = coste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCoste() {
        return coste;
    }

    public void setCoste(String coste) {
        this.coste = coste;
    }
}
