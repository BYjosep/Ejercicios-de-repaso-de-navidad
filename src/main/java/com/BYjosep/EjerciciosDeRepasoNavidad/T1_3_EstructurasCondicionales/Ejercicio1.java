package com.BYjosep.EjerciciosDeRepasoNavidad.T1_3_EstructurasCondicionales;

import com.BYjosep.EjerciciosDeRepasoNavidad.MiniLib;

public class Ejercicio1 {

    public static void main(String[] args) {
        int hora;
        hora = MiniLib.IngresaUnInt("Ingrese una hora del dia (Solo la hora)", 0, 23);
        if (hora >= 7 && hora <= 20) {
            System.out.println("Es de dia");
        } else {
            System.out.println("Es de noche");
        }
    }
}
