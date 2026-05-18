package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 15
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            float suma = 0;
            float producto = 1;
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ingrese un número: ");
                String numero_string = reader.readLine();
                float numero = Float.parseFloat(numero_string);
                suma = suma + numero;
                producto = producto * numero;
            }
            System.out.println("La SUMA de los números ingresados es: " + suma );
            System.out.println("El PRODUCTO de los números ingresados es: " + producto );
        } catch (NumberFormatException e) {
            System.out.print("Ingrese un número valido.");
        }
    }
}
