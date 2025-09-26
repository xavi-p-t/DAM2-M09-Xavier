package com.project;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercici1 {
    public static void main(String[] args) {
       ConcurrentHashMap<String, Integer> dataMap = new ConcurrentHashMap<>();

       ExecutorService executor = Executors.newFixedThreadPool(3);

       executor.submit(new iniciarDatos(dataMap));
       executor.submit(new modificar(dataMap));

       Future<Integer> resultado = executor.submit(new resultado(dataMap));

       try{
        Integer resultadoFinal = resultado.get();
        System.out.println("Saldo final: "+resultadoFinal);
       } catch (InterruptedException|ExecutionException e){
        e.printStackTrace();
       } finally {
        executor.shutdown();
       }
    }
    
}
