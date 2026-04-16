package com.example;

public class ParqueExplora implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("Lugar: Parque Explora");
        System.out.println("Horario: 8:00 AM - 5:00 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Documento original";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Experimentos interactivos");
        System.out.println("-------------------------------");
    }
}