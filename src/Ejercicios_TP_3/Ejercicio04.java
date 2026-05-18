package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 04
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese su edad: ");
            String entrada1 = reader.readLine();
            int edad = Integer.parseInt(entrada1);

            if (edad >= 18) {
                System.out.print("Eres mayor de edad.");
            } else {
                System.out.print("No eres mayor de edad.");
            }
        } catch (NumberFormatException e) {
            System.out.println("La edad ingresada no es válida.");
        }
    }
}
