package com.project;

public class Task1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Ejecutando la primera tarea, Registrando eventos del sistema");
        try {
            int numRandom = (int)(Math.random() * (3000 - 1000 + 1)) + 1000;
            Thread.sleep(numRandom);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Ejecutando la primera tarea, Evento registrado");
    }
    
}
