package com.BYjosep.EjerciciosDeRepasoNavidad;

import java.util.Scanner;

public class MiniLib {
    public static Scanner scanner = new Scanner(System.in);

    public static int IngresaUnInt(String texto) {
        int numero;
        System.out.println(texto);
        numero = Integer.parseInt(scanner.nextLine());
        return numero;
    }

    public static int IngresaUnInt(String texto, int min, int max) {
        int numero;
        do {
            numero = IngresaUnInt(texto);
        } while (numero < min || numero > max);

        return numero;
    }

    public static float IngresaUnFloat(String texto) {
        float numero;
        System.out.println(texto);
        numero = Float.parseFloat(scanner.nextLine());
        return numero;
    }

    public static char IngreseUnChar() {
        char caracter;

        System.out.println("Ingrese un caracter");
        caracter = scanner.nextLine().charAt(0);

        return caracter;
    }
}
