package com.BYjosep.EjerciciosDeRepasoNavidad.T1_1_OperacionesBasicas;

import com.BYjosep.EjerciciosDeRepasoNavidad.MiniLib;

public class Ejercicio3 {
    public static void main(String[] args) {
        float precio, descuento, precioFinal;
        precio = MiniLib.IngresaUnFloat("Ingresa el precio del producto");
        descuento = MiniLib.IngresaUnFloat("Ingresa el porcentaje de descuento del producto");
        precioFinal = precio - ((precio * descuento) / 100);
        System.out.printf("El precio del producto: %.2f", precioFinal);
    }
}
