package com.project;

public class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Ejecutando la segunda tarea, Comprobando estado de la red");
        try {
            int numRandom = (int)(Math.random() * (3000 - 1000 + 1)) + 1000;
            Thread.sleep(numRandom);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Ejecutando la Segunda tarea, Estado Comprobado");
    }
    
}
