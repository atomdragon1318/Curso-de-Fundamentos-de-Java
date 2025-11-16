public class Main {

    // EJEMPLO 1: Calculadora simple (sin Scanner)
    public static void calculadora() {
        System.out.println("=== CALCULADORA SIMPLE ===");

        // Valores fijos
        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Primer número: " + num1);
        System.out.println("Segundo número: " + num2);

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir por cero");
        }
    }

    // EJEMPLO 2: Juego de adivinanza (sin Scanner)
    public static void juegoAdivinanza() {
        int numeroSecreto = 42; // número fijo
        int intentos = 0;
        int maxIntentos = 7;

        // "Respuestas" fijas del usuario
        int[] intentosUsuario = {20, 60, 30, 42};

        System.out.println("\n=== JUEGO DE ADIVINANZA ===");
        System.out.println("He pensado un número entre 1 y 100");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinarlo");

        for (int i = 0; i < intentosUsuario.length && intentos < maxIntentos; i++) {
            int guess = intentosUsuario[i];
            intentos++;

            System.out.print("Intento #" + intentos + " (valor usado: " + guess + "): ");

            if (guess == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste en " + intentos + " intentos");
                return;
            } else if (guess < numeroSecreto) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }
        }

        if (intentos >= maxIntentos) {
            System.out.println("¡Se acabaron los intentos! El número era: " + numeroSecreto);
        }
    }

    // EJEMPLO 3: Gestor de estudiantes (igual que el tuyo)
    public static class Estudiante {
        private String nombre;
        private int edad;
        private double[] notas;

        public Estudiante(String nombre, int edad, double[] notas) {
            this.nombre = nombre;
            this.edad = edad;
            this.notas = notas;
        }

        public double calcularPromedio() {
            double suma = 0;
            for (double nota : notas) {
                suma += nota;
            }
            return suma / notas.length;
        }

        public void mostrarInformacion() {
            System.out.println("Estudiante: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Promedio: " + calcularPromedio());
            System.out.println("Estado: " + (calcularPromedio() >= 13 ? "Aprobado" : "Desaprobado"));
        }
    }

    public static void gestionEstudiantes() {
        System.out.println("\n=== GESTIÓN DE ESTUDIANTES ===");

        Estudiante[] estudiantes = {
            new Estudiante("Ana", 15, new double[]{15.5, 18.0, 16.5}),
            new Estudiante("Luis", 16, new double[]{12.0, 14.5, 13.0}),
            new Estudiante("Sofia", 14, new double[]{17.0, 19.5, 18.0})
        };

        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInformacion();
            System.out.println("------");
        }
    }

    // MÉTODO PRINCIPAL SIN Scanner ni menú
    public static void main(String[] args) {
        System.out.println("🎓 EJEMPLOS FINALES - CURSO DE JAVA 🎓");
        System.out.println("======================================");

        System.out.println("\n--- EJEMPLO 1: CALCULADORA SIMPLE ---");
        calculadora();

        System.out.println("\n--- EJEMPLO 2: JUEGO DE ADIVINANZA ---");
        juegoAdivinanza();

        System.out.println("\n--- EJEMPLO 3: GESTIÓN DE ESTUDIANTES ---");
        gestionEstudiantes();

        System.out.println("\n¡Gracias por completar el curso!");
        System.out.println("Recuerda practicar regularmente");
    }
}