import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear primer estudiante
        Estudiante[] estudiantes = new Estudiante[5];
        
        // Ingresar los datos de los 5 estudiantes
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();
            estudiantes[i].nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante "+ (i + 1) + ":");
            estudiantes[i].edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del estudiante: " + (i + 1) + ":"));
            estudiantes[i].carrera = JOptionPane.showInputDialog(null, "Ingrese la carrera del estudiante " + (i + 1) + ":");
            estudiantes[i].promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el promedio del estudiante " + (i + 1) + ":"));
        }

        // Variables para los resultados
        String datos = "";
        double suma = 0;
        Estudiante mayor = estudiantes[0];

        // Recorrer el arreglo
        for (int i = 0; i < estudiantes.length; i++) {
            datos += "Índice: " + (i + 1) + "\nNombre: " + estudiantes[i].nombre + "\nCarrera: " + estudiantes[i].carrera + "\nPromedio: " + estudiantes[i].promedio + "\n\n";
            suma += estudiantes[i].promedio;

            if (estudiantes[i].promedio > mayor.promedio) {
                mayor = estudiantes[i];
            }
        }

        // Calcular promedio general
        double promedioGeneral = suma / estudiantes.length;

        // Mostrar todos los estudiantes
        JOptionPane.showMessageDialog(null, datos, "Lista de estudiantes", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar estudiante con mayor promedio
        JOptionPane.showMessageDialog(null, "ESTUDIANTE CON MAYOR PROMEDIO\n\n" + "Nombre: " + mayor.nombre + "\nCarrera: " + mayor.carrera + "\nPromedio: " + mayor.promedio, "Mayor Promedio", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar promedio general
        JOptionPane.showMessageDialog(null, "Promedio general del grupo: " + promedioGeneral, "Promedio General", JOptionPane.INFORMATION_MESSAGE);
    }
}