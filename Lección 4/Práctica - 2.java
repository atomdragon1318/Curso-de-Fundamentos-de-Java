import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main { 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ahora ingresa tu nombre: ");
        String nombre = scanner.next(); 
        
        saludar(nombre, edad);
        
        scanner.close(); 
    }

    public static void saludar(String nombre, int edad) {
        System.out.println("===============================");
        System.out.println("¡Hola, " + nombre + "!");
        System.out.println("Veo que tienes " + edad + " años.");
        System.out.println("¡Bienvenido/a al sistema!");
        System.out.println("===============================");
    }

}