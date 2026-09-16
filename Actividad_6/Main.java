import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static class Estudiante {
        String nombre;
        int edad;
        String carrera;
        double promedio;
    }

    static Scanner sc = new Scanner(System.in);
    static Estudiante[] estudiantes = new Estudiante[50];
    static HashSet<String> carreras = new HashSet<>();
    static int total = 0;

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n--- GESTOR DE ESTUDIANTES ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Registrar carrera");
            System.out.println("5. Mostrar carreras");
            System.out.println("6. Cantidad de carreras");
            System.out.println("7. Eliminar carrera");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    estudiantes[total] = new Estudiante();

                    System.out.print("Nombre: ");
                    estudiantes[total].nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    estudiantes[total].edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Carrera: ");
                    estudiantes[total].carrera = sc.nextLine();

                    System.out.print("Promedio: ");
                    estudiantes[total].promedio = sc.nextDouble();
                    sc.nextLine();

                    carreras.add(estudiantes[total].carrera);
                    total++;

                    System.out.println("Estudiante registrado.");
                    break;

                case 2:
                    System.out.println("\n--- ESTUDIANTES ---");

                    for (int i = 0; i < total; i++) {
                        System.out.println("Nombre: " + estudiantes[i].nombre);
                        System.out.println("Edad: " + estudiantes[i].edad);
                        System.out.println("Carrera: " + estudiantes[i].carrera);
                        System.out.println("Promedio: " + estudiantes[i].promedio);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombre = sc.nextLine();

                    for (int i = 0; i < total; i++) {
                        if (estudiantes[i].nombre.equals(nombre)) {
                            System.out.println("Nombre: " + estudiantes[i].nombre);
                            System.out.println("Edad: " + estudiantes[i].edad);
                            System.out.println("Carrera: " + estudiantes[i].carrera);
                            System.out.println("Promedio: " + estudiantes[i].promedio);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Ingrese una carrera: ");
                    String carrera = sc.nextLine();

                    carreras.add(carrera);

                    System.out.println("Carrera agregada.");
                    break;

                case 5:
                    System.out.println("\n--- CARRERAS ---");

                    for (String carrera2 : carreras) {
                        System.out.println(carrera2);
                    }
                    break;

                case 6:
                    System.out.println("Cantidad de carreras: " + carreras.size());
                    break;

                case 7:
                    System.out.print("Ingrese la carrera que desea eliminar: ");
                    String eliminar = sc.nextLine();

                    carreras.remove(eliminar);

                    System.out.println("Carrera eliminada.");
                    break;

                case 8:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 8);

        sc.close();
    }
}