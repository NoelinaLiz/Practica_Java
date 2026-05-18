package Ejercicios_TP_3;

/*
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 01
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresá un número: ");
        String entrada1 = reader.readLine();
        int numero1 = Integer.parseInt(entrada1);

        System.out.println("Ingresa otro número: ");
        String entrada2 = reader.readLine();
        int numero2 = Integer.parseInt(entrada2);

        int suma = numero1 + numero2;
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
