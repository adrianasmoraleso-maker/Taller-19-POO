package org.taller;

public class PruebaAutenticacion {
    public static void main(String[] args) {

        System.out.println("\n==============Sistema de autenticación usuarios==============\n");

        // Inyectamos AutenticacionLocal
        GestorAutenticacion gestorLocal = new GestorAutenticacion(new AutenticacionLocal());
        gestorLocal.iniciarSesion("admin", "1234");

        System.out.println("\n-------------------------------------------------------------\n");

        // Inyectamos AutenticacionOAuth — sin cambiar GestorAutenticacion
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(new AutenticacionOAuth());
        gestorOAuth.iniciarSesion("adriana", "oauth123");
    }
}