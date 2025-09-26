package com.project;

import java.util.concurrent.ConcurrentHashMap;

public class modificar implements Runnable{
    private ConcurrentHashMap<String,Integer> data;

    public modificar(ConcurrentHashMap<String,Integer> map){
        this.data = map;
    }

    @Override
    public void run() {
        System.out.println("modificando el saldo actual");

        Integer saldoActual = data.get("saldo");
        if (saldoActual != null) {
            data.put("saldo", saldoActual+500);
            System.out.println("se ha modificado el saldo a 2000");
        }
    }
    
}
