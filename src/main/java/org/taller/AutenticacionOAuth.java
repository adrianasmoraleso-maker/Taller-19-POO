package org.taller;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Simulación de OAuth externo
        System.out.println("Autenticando via OAuth al usuario: " + usuario);
        return usuario.equals("adriana") && contrasena.equals("oauth123");
    }
}