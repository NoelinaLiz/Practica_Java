package Ejercicios_TP_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Arreglo para almacenar las 3 personas
        Persona[] personas = new Persona[3];

        try {
            // El usuario ingresa los datos de 3 personas
            for (int i = 0; i < 3; i++) {
                System.out.println("\n--- Ingrese los datos de la Persona " + (i + 1) + " ---");

                System.out.print("ID Persona: ");
                int id = Integer.parseInt(reader.readLine());

                System.out.print("DNI: ");
                int dni = Integer.parseInt(reader.readLine());

                System.out.print("Apellido: ");
                String apellido = reader.readLine();

                System.out.print("Nombre: ");
                String nombre = reader.readLine();

                System.out.print("Edad: ");
                int edad = Integer.parseInt(reader.readLine());

                System.out.print("Género: ");
                String genero = reader.readLine();

                System.out.print("Peso (en kg): ");
                double peso = Double.parseDouble(reader.readLine());

                System.out.print("Altura (en metros, ej: 1.75): ");
                double altura = Double.parseDouble(reader.readLine());

                System.out.print("Domicilio: ");
                String domicilio = reader.readLine();

                // se crea el objeto con los datos ingresados y se almacena en el arreglo.
                personas[i] = new Persona(id, dni, apellido, nombre, edad, genero, peso, altura, domicilio);
            }

            // Resultados
            System.out.println("=== RESULTADOS ===");

            for (int i = 0; i < personas.length; i++) {
                System.out.println("\n---------------------------------------------");
                System.out.println("Resultados para la Persona " + (i + 1) + ":");
                System.out.println(personas[i].info());
                System.out.print("IMC: ");
                personas[i].imc();
                if (personas[i].esMayorDeEdad()) {
                    System.out.println("Es MAYOR de edad.");
                } else {
                    System.out.println("Es MENOR de edad.");
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("\nError: el formato del número no es válido. Intente nuevamente.");
        }
    }
}
