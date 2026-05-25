package Ejercicios_TP_4;

// Creación de los 5 objetos Persona

public class Ejercicio_02 {
    public static void main(String[] args) {

        Persona persona1 = new Persona(1, 38123456, "Gómez", "Juan", 28, "Masculino", 75.4, 1.75, "Av. Belgrano 450");
        Persona persona2 = new Persona(2, 42987654, "López", "María", 21, "Femenino", 60.2, 1.63, "Mitre 1230");
        Persona persona3 = new Persona(3, 30456123, "Martínez", "Carlos", 40, "Masculino", 85.0, 1.82, "San Martín 890");
        Persona persona4 = new Persona(4, 45123987, "Rodríguez", "Ana", 19, "Femenino", 54.8, 1.59, "Alvarado 2100");
        Persona persona5 = new Persona(5, 35765432, "Fernández", "Luis", 33, "Masculino", 70.1, 1.70, "Zuviría 15");

        // Mensaje para verificar en consola que el programa corre sin errores
        System.out.println("Los 5 objetos Persona fueron creados con éxito.");
    }
}
