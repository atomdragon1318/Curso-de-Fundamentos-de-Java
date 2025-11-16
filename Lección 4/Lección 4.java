import java.util.ArrayList;
import java.util.Scanner;

// =========================
// Clase MascotaAvanzada
// =========================

class MascotaAvanzada {
    private String nombre;
    private String tipo;
    private int edad;
    private int nivelHambre;
    private int nivelDiversion;
    private int nivelEnergia;
    
    public MascotaAvanzada(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.nivelHambre = 50;
        this.nivelDiversion = 50;
        this.nivelEnergia = 100;
    }
    
    public void alimentar() {
        if (nivelHambre > 0) {
            nivelHambre -= 30;
            nivelEnergia += 20;
            if (nivelHambre < 0) nivelHambre = 0;
            if (nivelEnergia > 100) nivelEnergia = 100;
            
            System.out.println(nombre + " esta comiendo.");
            System.out.println("Hambre: " + nivelHambre + ", Energia: " + nivelEnergia);
        } else {
            System.out.println(nombre + " no tiene hambre ahora");
        }
    }
    
    public void jugar() {
        if (nivelEnergia > 20) {
            nivelDiversion += 25;
            nivelEnergia -= 15;
            nivelHambre += 10;
            
            if (nivelDiversion > 100) nivelDiversion = 100;
            if (nivelEnergia < 0) nivelEnergia = 0;
            
            System.out.println(nombre + " esta jugando.");
            System.out.println("Diversion: " + nivelDiversion + ", Energia: " + nivelEnergia);
        } else {
            System.out.println(nombre + " esta muy cansado para jugar");
        }
    }
    
    public void mostrarEstado() {
        System.out.println(nombre + " (" + tipo + ", " + edad + " anos)");
        System.out.println("   Hambre: " + nivelHambre + "/100");
        System.out.println("   Diversion: " + nivelDiversion + "/100");
        System.out.println("   Energia: " + nivelEnergia + "/100");
    }
}

// =========================
// Clase principal Main
// =========================

public class Main {
    
    private static ArrayList<MascotaAvanzada> mascotas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("SIMULADOR DE MASCOTAS VIRTUALES");
        System.out.println("==============================");
        
        boolean ejecutando = true;
        
        while (ejecutando) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    crearMascota();
                    break;
                case 2:
                    listarMascotas();
                    break;
                case 3:
                    alimentarMascota();
                    break;
                case 4:
                    jugarConMascota();
                    break;
                case 5:
                    System.out.println("Gracias por usar el simulador.");
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Crear nueva mascota");
        System.out.println("2. Ver todas las mascotas");
        System.out.println("3. Alimentar mascota");
        System.out.println("4. Jugar con mascota");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion: ");
    }
    
    public static void crearMascota() {
        System.out.println("\n--- CREAR NUEVA MASCOTA ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Tipo (Perro/Gato/Pajaro): ");
        String tipo = scanner.nextLine();
        
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        MascotaAvanzada nuevaMascota = new MascotaAvanzada(nombre, tipo, edad);
        mascotas.add(nuevaMascota);
        
        System.out.println("Mascota creada exitosamente.");
    }
    
    public static void listarMascotas() {
        System.out.println("\n--- MIS MASCOTAS ---");
        if (mascotas.isEmpty()) {
            System.out.println("No tienes mascotas aun.");
            return;
        }
        
        for (int i = 0; i < mascotas.size(); i++) {
            System.out.print((i + 1) + ". ");
            mascotas.get(i).mostrarEstado();
        }
    }
    
    public static void alimentarMascota() {
        if (mascotas.isEmpty()) {
            System.out.println("No tienes mascotas para alimentar.");
            return;
        }
        
        listarMascotas();
        System.out.print("Elige el numero de la mascota: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if (indice >= 0 && indice < mascotas.size()) {
            mascotas.get(indice).alimentar();
        } else {
            System.out.println("Numero no valido.");
        }
    }
    
    public static void jugarConMascota() {
        if (mascotas.isEmpty()) {
            System.out.println("No tienes mascotas para jugar.");
            return;
        }
        
        listarMascotas();
        System.out.print("Elige el numero de la mascota: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if (indice >= 0 && indice < mascotas.size()) {
            mascotas.get(indice).jugar();
        } else {
            System.out.println("Numero no valido.");
        }
    }
}
