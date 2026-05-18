package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 17
 */

public class Ejercicio17 {
    public static void main(String[] args){
        System.out.println("Números del 30 al 1 con WHILE");
        int contador = 30;
        while (contador >= 1) {
            System.out.println("Número: " + contador);
            contador--;
        }
        System.out.println("¡Bucle terminado!");
    }
}
