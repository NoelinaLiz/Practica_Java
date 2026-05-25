package Ejercicios_TP_4;
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args){
        // se crea el objeto Scanner asociado a la entrada de consola
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== Sistema de Notas ===");
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la nota del primer parcial: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Ingrese la nota del segundo parcial: ");
            double nota2 = scanner.nextDouble();

            // Cálculo del promedio
            double promedio = (nota1 + nota2) / 2;

            // Salida de resultados
            System.out.printf("%nEl alumno %s obtuvo un promedio final de: %.2f%n", nombre, promedio);

        } catch (Exception e) {
            System.out.println("Error: el formato de la nota ingresada no es válido.");
        } finally {
            // se cierra el objeto para liberar recursos de memoria.
            scanner.close();
        }
    }
}
