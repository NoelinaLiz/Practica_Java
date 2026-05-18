package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 05
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la nota del examen: ");
            String entrada1 = reader.readLine();
            int nota = Integer.parseInt(entrada1);
            if (nota <= 10 && nota >= 0) { //la nota no puede ser negativa ni mayor a 10
                if (nota >= 7 && nota <= 10) {
                    System.out.print("Promocionado");
                } else if(nota < 7 && nota >= 4) {
                    System.out.print("Regular");
                } else {
                    System.out.print("Libre");
                }
            } else {
                System.out.print("Ingrese una nota del 1 al 10.");
            }

        } catch (NumberFormatException e) {
            System.out.println("La nota ingresada no es válida.");
        }
    }
}
