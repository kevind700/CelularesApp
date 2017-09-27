package com.example.kevinariza.celularesapp;

import java.util.ArrayList;

/**
 * Created by Kevin Ariza on 26/09/2017.
 */

public class Data {
    private static ArrayList<Cellphone> cellphone = new ArrayList<>();

    public static void guardar(Cellphone c){
        cellphone.add(c);
    }

    public static ArrayList<Cellphone> obtener(){
        return cellphone;
    }
}
