package com.project;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercici0 {
    public static void main(String[] args) {
       ExecutorService executor = Executors.newFixedThreadPool(2);

       executor.submit(new Task1());
       executor.submit(new Task2());

       executor.shutdown();
       
    }
}
