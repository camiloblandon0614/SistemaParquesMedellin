package com.example;

public class MuseoDeAntioquia implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("Lugar: Museo de Antioquia");
        System.out.println("Horario: 10:00 AM - 5:30 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Boleta pagada";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Admirando obras de Fernando Botero...");
        System.out.println("----------------------------");
    }
}