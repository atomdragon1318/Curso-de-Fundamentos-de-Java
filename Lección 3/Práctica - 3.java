import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota("Max", "Perro", 3);
        Mascota mascota2 = new Mascota("Luna", "Gato", 2);
        
        System.out.println("--- MIS MASCOTAS ---");
        mascota1.mostrarInfo();  // El objeto mascota1 ejecuta el método
        mascota2.mostrarInfo();  // El objeto mascota2 ejecuta el mismo método
        
        Mascota mascota3 = new Mascota("Piolín", "Pájaro", 1);
        mascota3.mostrarInfo();
        System.out.println(mascota3.getEdad());
        
    }
}

class Mascota {
    private String nombre;  // El nombre de la mascota
    private String tipo;    // El tipo: perro, gato, etc.
    private int edad;       // La edad en años
    
    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;  // 'this.nombre' es el atributo de la clase
        this.tipo = tipo;      // 'nombre' (solo) es el parámetro que llega
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("🐾 " + nombre + " - " + tipo + " - " + edad + " años");
    }


    // GETTER para el nombre: nos permite obtener el valor
    public String getNombre() {
        return nombre; // Devuelve el valor del atributo nombre
    }
    
    // GETTER para la edad
    public int getEdad() {
        return edad;
    }
    
    // SETTER para la edad: nos permite modificar el atributo
    public void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0) { // Validamos que la edad sea positiva
            this.edad = nuevaEdad; // Actualizamos el atributo
        }
    }
    
    // SETTER para el nombre
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
}