import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) {
        mostrarBienvenida();
    }

    
    public static void mostrarBienvenida() {
        System.out.println("=== BIENVENIDO AL SISTEMA ===");
        System.out.println("Curso de Java para Principiantes");
        System.out.println("===============================");
    }
    
    public static void saludar(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años");
    }
    
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;  // La palabra 'return' envía el resultado de vuelta
    }

    

}