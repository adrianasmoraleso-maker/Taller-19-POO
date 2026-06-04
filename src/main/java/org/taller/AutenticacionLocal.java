package org.taller;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Simulación de validación local
        System.out.println("Autenticando localmente al usuario: " + usuario);
        return usuario.equals("admin") && contrasena.equals("1234");
    }
}