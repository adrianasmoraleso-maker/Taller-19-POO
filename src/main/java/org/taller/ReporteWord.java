package org.taller;

public class ReporteWord implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte en Word con datos: " + datos);
    }
}