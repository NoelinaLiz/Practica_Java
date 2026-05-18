package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 02
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Ingrese el primer número: ");
            String entrada1 = reader.readLine();
            int numero1 = Integer.parseInt(entrada1);

            System.out.print("Ingrese el segundo número: ");
            String entrada2 = reader.readLine();
            int numero2 = Integer.parseInt(entrada2);

            double promedio = (double) (numero1 + numero2) / 2;
            System.out.print("El promedio de los números ingresados es: " + promedio);
        } catch (NumberFormatException e) {
            System.out.print("Error: El valor ingresado no es un número válido.");
        }

    }
}
