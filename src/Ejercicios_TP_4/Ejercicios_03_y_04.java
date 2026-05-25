package Ejercicios_TP_4;

public class Ejercicios_03_y_04 {
    public static void main(String[] args) {

        // Creo el arreglo con 10 espacios.
        Persona[] listaPersonas = new Persona[10];

        // Instanciar 10 objetos en cada espacio del arreglo
        listaPersonas[0] = new Persona(1, 38123456, "Gómez", "Juan", 28, "Masculino", 75.4, 1.75, "Av. Belgrano 450");
        listaPersonas[1] = new Persona(2, 42987654, "López", "María", 21, "Femenino", 60.2, 1.63, "Mitre 1230");
        listaPersonas[2] = new Persona(3, 30456123, "Martínez", "Carlos", 40, "Masculino", 85.0, 1.82, "San Martín 890");
        listaPersonas[3] = new Persona(4, 45123987, "Rodríguez", "Ana", 19, "Femenino", 54.8, 1.59, "Alvarado 2100");
        listaPersonas[4] = new Persona(5, 35765432, "Fernández", "Luis", 33, "Masculino", 70.1, 1.70, "Zuviría 15");
        listaPersonas[5] = new Persona(6, 39123851, "Díaz", "Lucía", 25, "Femenino", 62.5, 1.68, "España 412");
        listaPersonas[6] = new Persona(7, 36159234, "Álvarez", "Diego", 30, "Masculino", 80.3, 1.78, "Lerma 750");
        listaPersonas[7] = new Persona(8, 41234567, "Ruiz", "Florencia", 29, "Femenino", 58.0, 1.65, "Deán Funes 1120");
        listaPersonas[8] = new Persona(9, 29456789, "Benítez", "Andrés", 45, "Masculino", 92.1, 1.85, "Caseros 340");
        listaPersonas[9] = new Persona(10, 44123456, "Herrera", "Sofía", 22, "Femenino", 51.2, 1.60, "Balcarce 85");

        System.out.println("=== Personas añadidas al arreglo ===");

        //Bucle for. Ejercicio 4
        for (int i = 0; i < listaPersonas.length; i++) {
            System.out.print("Posición [" + i + "] -> ");
            listaPersonas[i].mostrarDatos();
        }
    }
}
