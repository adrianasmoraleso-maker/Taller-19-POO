package org.taller;

public interface Almacenamiento {
    void guardar(String archivo);
    String recuperar(String nombre);
}