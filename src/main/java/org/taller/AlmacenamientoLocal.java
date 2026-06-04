package org.taller;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String archivo) {
        System.out.println("Guardando '" + archivo + "' en disco local");
    }

    @Override
    public String recuperar(String nombre) {
        System.out.println("Recuperando '" + nombre + "' desde disco local");
        return "contenido_local_de_" + nombre;
    }
}