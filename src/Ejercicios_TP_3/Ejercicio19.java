package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 19
 */

public class Ejercicio19 {
    public static void main(String[] args){
        System.out.println("Tabla de multiplicar del 6 con WHILE");
        int tabla = 1;
        while (tabla <= 10) {
            int multiplo = 6 * tabla;
            System.out.println("6 * " + tabla + " = " + multiplo);
            tabla++;
        }
        System.out.println("¡Ejecución finalizada!");
    }
}
