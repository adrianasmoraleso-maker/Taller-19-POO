package org.taller;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void subirArchivo(String archivo) {
        almacenamiento.guardar(archivo);
    }

    public void descargarArchivo(String nombre) {
        String contenido = almacenamiento.recuperar(nombre);
        System.out.println("Contenido: " + contenido);
    }
}