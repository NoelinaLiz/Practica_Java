package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 07
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Bienvenid@ a 'Un Numero menos el 15%'");
            System.out.print("Ingrese un número: ");
            String numero_string = reader.readLine();
            double numero = Double.parseDouble(numero_string);
            numero = numero * 0.85;
            System.out.print("El número ingresado menos el 15% es " + String.format("%.2f", numero));
        } catch (NumberFormatException e) {
            System.out.print("Ingrese un número valido.");
        }
    }
}
