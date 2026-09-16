import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> cursos = new HashSet<>();

        // 1.
        String[] cursosIniciales = {"Java", "Python", "C++", "JavaScript", "Java"};

        System.out.println("=== Registrando cursos iniciales ===");
        for (String curso : cursosIniciales) {
            boolean agregado = cursos.add(curso); // add() retorna boolean
            if (agregado) {
                System.out.println("Curso \"" + curso + "\" agregado correctamente.");
            } else {
                System.out.println("Curso \"" + curso + "\" NO se agregó (ya existía en el conjunto).");
            }
        }

        // 2.
        System.out.println("\n=== Búsqueda de curso ===");
        System.out.print("Ingrese el nombre del curso a buscar: ");
        String cursoBuscar = sc.nextLine();

        if (cursos.contains(cursoBuscar)) {
            System.out.println("El curso \"" + cursoBuscar + "\" SÍ pertenece al conjunto.");
        } else {
            System.out.println("El curso \"" + cursoBuscar + "\" NO pertenece al conjunto.");
        }

        // 3.
        System.out.println("\n=== Eliminación de curso ===");
        System.out.print("Ingrese el nombre del curso a eliminar: ");
        String cursoEliminar = sc.nextLine();

        boolean eliminado = cursos.remove(cursoEliminar);
        if (eliminado) {
            System.out.println("Curso \"" + cursoEliminar + "\" eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar: el curso \"" + cursoEliminar + "\" no existe en el conjunto.");
        }

        // 4.
        System.out.println("\n=== Cantidad de cursos ===");
        System.out.println("El conjunto tiene actualmente " + cursos.size() + " curso(s).");

        // 5.
        System.out.println("\n=== Listado de cursos (for-each) ===");
        if (cursos.isEmpty()) {
            System.out.println("El conjunto está vacío.");
        } else {
            for (String curso : cursos) {
                System.out.println("- " + curso);
            }
        }

        // 6.
        System.out.println("\n=== Vaciar el conjunto ===");
        System.out.print("¿Desea eliminar todos los cursos? (S/N): ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("S")) {
            cursos.clear();
            System.out.println("Todos los cursos fueron eliminados.");
            System.out.println("Tamaño actual del conjunto: " + cursos.size());
        } else {
            System.out.println("El conjunto se mantiene sin cambios.");
        }

        sc.close();
    }
}
