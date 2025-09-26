package com.project;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class resultado implements Callable<Integer>{
    private ConcurrentHashMap<String,Integer> data;

    public resultado(ConcurrentHashMap<String,Integer> map){
        this.data = map;
    }

    @Override
    public Integer call() throws Exception{
        System.out.println("Calculando el resultado");
        //Thread.sleep(1000);
        return data.getOrDefault("saldo", 0);
    }
}
