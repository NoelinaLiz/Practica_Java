package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 18
 */

public class Ejercicio18 {
    public static void main(String[] args){
        System.out.println("Números impares del 60 al 30 con WHILE");
        for (int i = 59; i >= 30; i=i-2) {
            System.out.println("Número: " + i);
        }
        int contador = 59;
        while (contador >= 30) {
            System.out.println("Número: " + contador);
            contador = contador -2;
        }
        System.out.println("¡Bucle terminado!");
    }
}
