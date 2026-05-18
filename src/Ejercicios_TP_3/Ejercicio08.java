package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 08
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Bienvenid@ a '¿Es par o impar?'");
            System.out.print("Ingrese un número entero: ");
            String numero_string = reader.readLine();
            int numero = Integer.parseInt(numero_string);
            float modulo = numero % 2;
            if (modulo == 0){
                System.out.print("El número ingresado ES PAR");
            } else {
                System.out.print("El número ingresado ES IMPAR");
            }
        } catch (NumberFormatException e) {
            System.out.print("Ingrese un número valido.");
        }
    }
}
