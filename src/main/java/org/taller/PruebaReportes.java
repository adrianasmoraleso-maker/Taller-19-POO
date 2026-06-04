package org.taller;

public class PruebaReportes {
    public static void main(String[] args) {

        System.out.println("\n=======================Gestión Reportes=======================\n");

        GestorReportes gestorPDF = new GestorReportes(new ReportePDF());
        gestorPDF.producirReporte("Ventas Q1 2024");

        System.out.println("\n--------------------------------------------------------------\n");

        GestorReportes gestorExcel = new GestorReportes(new ReporteExcel());
        gestorExcel.producirReporte("Inventario Marzo 2024");

        System.out.println("\n==============================================================\n");
    }
}