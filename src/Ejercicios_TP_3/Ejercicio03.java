package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 03
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Ingrese la BASE del triángulo (en cm): ");
            String entrada1 = reader.readLine();
            double base = Double.parseDouble(entrada1);

            System.out.print("Ingrese la ALTURA del triángulo (en cm): ");
            String entrada2 = reader.readLine();
            double altura = Double.parseDouble(entrada2);

            double area = (base * altura ) / 2;
            System.out.println("El área del triangulo es de " + String.format("%.2f", area) + " cm cuadrados");
        } catch(NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número válido.");
        }
    }
}
