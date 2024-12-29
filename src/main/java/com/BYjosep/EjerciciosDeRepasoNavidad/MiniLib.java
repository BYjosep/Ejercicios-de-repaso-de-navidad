package com.BYjosep.EjerciciosDeRepasoNavidad;

import java.util.Scanner;

public class MiniLib {
    public static Scanner scanner = new Scanner(System.in);

    public static int IngresaUnInt(){
        int numero;
        System.out.println("Ingrese el numero entero\n");
        numero=Integer.parseInt(scanner.nextLine());
        return numero;
    }

    public static float IngresaUnFloat(){
        float numero;
        System.out.println("Ingrese el numero decimal\n");
        numero=Float.parseFloat(scanner.nextLine());
        return numero;
    }
}
