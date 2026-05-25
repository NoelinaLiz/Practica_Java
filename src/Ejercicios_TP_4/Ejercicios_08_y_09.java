package Ejercicios_TP_4;

public class Ejercicios_08_y_09 {
    public static void main(String[] args) {

        // Se crea un arreglo para almacenar 10 profesores
        Profesor[] listaProfesores = new Profesor[10];

        //Ejercicio 08: instanciar 10 objetos de la clase:
        listaProfesores[0] = new Profesor(1, 11111111, "García", "Carlos", 45, "Masculino", 80.0, 1.75, "Alvarado 100", "Matemáticas", 15);
        listaProfesores[1] = new Profesor(2, 22222222, "Pérez", "Laura", 38, "Femenino", 62.0, 1.65, "Belgrano 250", "Historia", 8);
        listaProfesores[2] = new Profesor(3, 33333333, "López", "Jorge", 50, "Masculino", 88.5, 1.80, "Mitre 500", "Física", 12);
        listaProfesores[3] = new Profesor(4, 44444444, "Martínez", "Ana", 29, "Femenino", 55.0, 1.60, "Zuviría 30", "Química", 6);
        listaProfesores[4] = new Profesor(5, 55555555, "Rodríguez", "Luis", 42, "Masculino", 75.0, 1.70, "España 800", "Programación", 20);
        listaProfesores[5] = new Profesor(6, 66666666, "Sánchez", "Elena", 35, "Femenino", 58.5, 1.68, "Balcarce 150", "Inglés", 10);
        listaProfesores[6] = new Profesor(7, 77777777, "Gómez", "Andrés", 55, "Masculino", 90.0, 1.78, "Caseros 950", "Sistemas", 16);
        listaProfesores[7] = new Profesor(8, 88888888, "Fernández", "Marta", 48, "Femenino", 64.0, 1.62, "Lerma 420", "Álgebra", 4);
        listaProfesores[8] = new Profesor(9, 99999999, "Díaz", "Ricardo", 61, "Masculino", 82.3, 1.73, "Dean Funes 60", "Base de Datos", 18);
        listaProfesores[9] = new Profesor(10, 12345678, "Álvarez", "Sofía", 31, "Femenino", 53.0, 1.59, "Mitre 1200", "Estadística", 12);

        //Ejercicio 09:
        System.out.println("=== PROFESORES CON CARGA HORARIA MAYOR A 10 HORAS ===");
        for (int i = 0; i < listaProfesores.length; i++) {
            if (listaProfesores[i].getCargaHoraria() > 10) {
                listaProfesores[i].mostrarDatosProfesor();
            }
        }
    }
}