package org.taller;

// PruebaAlmacenamiento.java
public class PruebaAlmacenamiento {
    public static void main(String[] args) {

        System.out.println("\n=====================Gestor Almacenamiento=====================\n");

        GestorArchivos gestorLocal = new GestorArchivos(new AlmacenamientoLocal());
        gestorLocal.subirArchivo("informe.pdf");
        gestorLocal.descargarArchivo("informe.pdf");

        System.out.println("\n---------------------------------------------------------------\n");

        GestorArchivos gestorNube = new GestorArchivos(new AlmacenamientoNube());
        gestorNube.subirArchivo("foto.jpg");
        gestorNube.descargarArchivo("foto.jpg");
    }
}