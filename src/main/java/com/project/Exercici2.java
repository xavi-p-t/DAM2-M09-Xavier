package com.project;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;


public class Exercici2 {
    public static void main(String[] args) {
       
        ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("validando los datos");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            return "Datos validados";
        }, executor)

        .thenApplyAsync(result -> {
            System.out.println("Procesando los datos");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            return result + " i Calculados";
        },executor)

        .thenAcceptAsync(result -> {
            System.out.println("El resultado Final: " + result);
        },executor);

        future.join();

        executor.shutdown();
       
    }
}
