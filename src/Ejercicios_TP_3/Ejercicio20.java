package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 20
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Bienvenid@ a 'Desde un número (N) hasta otro (P)'");
            System.out.print("Ingrese el primer número (N): ");
            String numeroN_string = reader.readLine();
            int numero_N = Integer.parseInt(numeroN_string);

            System.out.print("Ingrese el segundo número (P): ");
            String numeroP_string = reader.readLine();
            int numero_P = Integer.parseInt(numeroP_string);

            if (numero_P >= numero_N){
                //AQUI LA LOGICA
                while (numero_N <= numero_P){
                    System.out.println(numero_N);
                    numero_N++;
                }
            } else {
                System.out.println("El segundo número debe ser mayor que el primero");
            }
        } catch (NumberFormatException e) {
            System.out.print("Ingrese un número valido.");
        }
    }
}
