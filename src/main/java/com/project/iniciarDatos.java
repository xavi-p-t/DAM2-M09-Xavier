package com.project;

import java.util.concurrent.ConcurrentHashMap;

public class iniciarDatos implements Runnable{
    private ConcurrentHashMap<String,Integer> data;

    public iniciarDatos(ConcurrentHashMap<String,Integer> map){
        this.data = map;
    }

    @Override
    public void run() {
        System.out.println("Iniciado los datos");
        data.put("saldo", 1500);
        System.out.println("Iniciado, Saldo actual 1500");
    }
    
}
