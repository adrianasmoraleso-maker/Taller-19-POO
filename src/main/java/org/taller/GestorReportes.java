package org.taller;

public class GestorReportes {
    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void producirReporte(String datos) {
        System.out.println("Preparando datos para el reporte...");
        generador.generarReporte(datos);
    }
}