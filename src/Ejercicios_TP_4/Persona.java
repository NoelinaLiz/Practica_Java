package Ejercicios_TP_4;

//Ejercicio 01
//Crear una clase "Persona" con atributos

public class Persona {
    //Definición de atributos:
    private int idPersona;
    private int dni;
    private String apellido;
    private String nombre;
    private int edad;
    private String genero;
    private double peso;
    private double altura;
    private String domicilio;

    //Constructor
    public Persona(int idPersona, int dni, String apellido, String nombre, int edad, String genero, double peso, double altura, String domicilio){
        this.idPersona = idPersona;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.domicilio = domicilio;
    };

    //MÉTODOS
    //Metodo para que la clase muestre los datos, necesario para ejercicio 04
    public void mostrarDatos() {
        System.out.println(
                "ID: " + this.idPersona + " | DNI: " + this.dni +
                " | Nombre: " + this.nombre + " " + this.apellido +
                " | Edad: " + this.edad + " | Género: " + this.genero +
                " | Peso: " + this.peso + "kg | Altura: " + this.altura + "m" +
                " | Domicilio: " + this.domicilio);
    };

    // Métodos ejercicio 05
    public String info() {
        return "DNI: " + this.dni + " - " + this.apellido + ", " + this.nombre + " - Domicilio: " + this.domicilio;
    }

    public void imc() {
        double resultadoIMC = this.peso / (this.altura * this.altura);

        if (resultadoIMC < 20) {
            System.out.println("Debajo de su peso ideal");
        } else if (resultadoIMC >= 20 && resultadoIMC <= 25) {
            System.out.println("Está en su peso ideal");
        } else {
            System.out.println("Sobrepeso");
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
};

