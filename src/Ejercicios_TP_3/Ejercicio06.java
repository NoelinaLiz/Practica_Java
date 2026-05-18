package Ejercicios_TP_3;

/**
 * UCASAL - Programación I - TP 3
 * Autora: Noelia Lizárraga
 * ==================================
 * Ejercicio 06
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Inicio de sesión");
            System.out.print("Nombre de Usuario: ");
            String userName = reader.readLine();
            System.out.print("Contraseña: ");
            String password = reader.readLine();
            if (userName.equals("Franco") && password.equals("2022")) {
                System.out.print("¡Bienvenido, Franco! Inicio de sesión válido");
            } else if (userName.equals("Franco") && !password.equals("2022")) {
                System.out.print("Contraseña Incorrecta");
            } else if (!userName.equals("Franco") && password.equals("2022")){
                System.out.print("Nombre de usuario incorrecto");
            } else {
                System.out.print("¡Usuario Desconocido! ¡Fuera Hacker!");
            }

        } catch (Exception e) {
            System.out.print("Algo salió mal");
        }
    }
}
