package com.BYjosep.EjerciciosDeRepasoNavidad.T1_2_ConversionDeTipos;

import com.BYjosep.EjerciciosDeRepasoNavidad.MiniLib;

public class Ejercicio4 {
    public static void main(String[] args) {
        int posicionAscii;
        char caracter;
        posicionAscii = MiniLib.IngresaUnInt("Ingrese un numer del 0 al 127", 0, 127);
        caracter = (char) posicionAscii;
        System.out.println("El caracter es: " + caracter);
    }
}
