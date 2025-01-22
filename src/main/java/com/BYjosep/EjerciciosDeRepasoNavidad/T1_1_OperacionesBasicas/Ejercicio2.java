package com.BYjosep.EjerciciosDeRepasoNavidad.T1_1_OperacionesBasicas;

import com.BYjosep.EjerciciosDeRepasoNavidad.MiniLib;

public class Ejercicio2 {
    public static void main(String[] args) {
        float a, b;

        a = MiniLib.IngresaUnFloat("Ingrese el numero decimal");
        b = MiniLib.IngresaUnFloat("Ingrese el numero decimal");

        System.out.println("La suma de los numeros " + a + " y de " + b + " es: " + (a + b));
        System.out.println("La resta de los numeros " + a + " y de " + b + " es: " + (a - b));
        System.out.println("La multiplication de los numeros " + a + " y de " + b + " es: " + (a * b));
        System.out.println("La division de los numeros " + a + " y de " + b + " es: " + (a / b));
        System.out.println("El resto de los numeros " + a + " y de " + b + " es: " + (a % b));

    }
}
