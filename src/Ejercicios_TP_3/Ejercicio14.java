package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 14
 */

public class Ejercicio14 {
    public static void main(String[] args){
        System.out.println("Múltiplos de 5");
        for (int i = 1; i <=100; i++) {
            float modulo = i % 5;
            if (modulo == 0){
                System.out.println(i);
            }
        }
        System.out.println("¡Ejecución finalizada!");
    }
}
