package com.BYjosep.EjerciciosDeRepasoNavidad.T1_2_ConversionDeTipos;

import com.BYjosep.EjerciciosDeRepasoNavidad.MiniLib;

public class Ejercicio2 {
    public static void main(String[] args) {
        float numero;
        int valorFinal;
        numero = MiniLib.IngresaUnFloat("Ingrese un valor numerico");
        valorFinal = (int) numero / 2;
        System.out.println("El resultado de la division es: " + valorFinal);
    }
}
