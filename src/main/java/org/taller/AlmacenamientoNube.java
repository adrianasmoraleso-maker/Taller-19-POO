package org.taller;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String archivo) {
        System.out.println("Guardando '" + archivo + "' en la nube");
    }

    @Override
    public String recuperar(String nombre) {
        System.out.println("Recuperando '" + nombre + "' desde la nube");
        return "contenido_nube_de_" + nombre;
    }
}