package com.BYjosep.EjerciciosDeRepasoNavidad.T1_2_ConversionDeTipos;

import com.BYjosep.EjerciciosDeRepasoNavidad.MiniLib;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        float doble;
        numero = MiniLib.IngresaUnInt("Ingrese un numero entero");
        doble = numero * 2f;
        System.out.println(doble);
    }
}
