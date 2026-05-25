package Ejercicios_TP_4;

//Ejercicio 07
public class Profesor extends Persona {
    private String materia;
    private int cargaHoraria;

    //Constructor
    public Profesor(int idPersona, int dni, String apellido, String nombre, int edad,
                    String genero, double peso, double altura, String domicilio,
                    String materia, int cargaHoraria){
        super(idPersona, dni, apellido, nombre, edad, genero, peso, altura, domicilio);
        this.materia = materia;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    // Método para mostrar los datos completos del profesor
    public void mostrarDatosProfesor() {
        // para mostrar todos los datos, reutilizo el método info() de Persona
        System.out.println(info() + " | Materia: " + this.materia + " | Carga Horaria: " + this.cargaHoraria + " horas");
    }
}
