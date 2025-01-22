package com.BYjosep.EjerciciosDeRepasoNavidad.T1_3_EstructurasCondicionales;

import com.BYjosep.EjerciciosDeRepasoNavidad.MiniLib;

public class Ejercicio2 {
    public static void main(String[] args) {
        int personas, edad, precio = 0;
        do {
            personas = MiniLib.IngresaUnInt("Ingrese un numero de personas");
        } while (personas < 0);
        for (int i = 0; i < personas; i++) {
            do {
                edad = MiniLib.IngresaUnInt("Ingrese un edad");
            } while (edad < 0);

            if (edad < 5) {
                precio += 0;
            } else if (edad > 5 && edad <= 10) {
                precio += 3;
            } else if (edad >= 11 && edad <= 17) {
                precio += 5;
            } else {
                precio += 7;
            }
        }
        System.out.println("El total es: " + precio);
    }
}
