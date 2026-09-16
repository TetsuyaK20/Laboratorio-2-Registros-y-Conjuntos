import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear primer estudiante
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del primer estudiante: ");
        estudiante1.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del primer estudiante: "));
        estudiante1.carrera = JOptionPane.showInputDialog(null, "Ingrese la carrera del primer estudiante: ");
        estudiante1.promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el promedio del primer estudiante: "));

        // Crear segundo estudiante
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del segundo estudiante: ");
        estudiante2.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del segundo estudiante: "));
        estudiante2.carrera = JOptionPane.showInputDialog(null, "Ingrese la carrera del segundo estudiante: ");
        estudiante2.promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el promedio del segundo estudiante: "));

        // Verificar si aprobaron
        String estado1, estado2;

        if (estudiante1.promedio >= 71) {
            estado1 = "APROBÓ";
        } else {
            estado1 = "NO APROBÓ";
        }

        if (estudiante2.promedio >= 71) {
            estado2 = "APROBÓ";
        } else {
            estado2 = "NO APROBÓ";
        }

        // Mostrar información del primer estudiante
        JOptionPane.showMessageDialog(null, "DATOS DEL ESTUDIANTE 1\n\n" + "Nombre: " + estudiante1.nombre + "\nEdad: " + estudiante1.edad + "\nCarrera: " + estudiante1.carrera + "\nPromedio: " + estudiante1.promedio + "\nEstado: " + estado1, "Estudiante 1", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar información del segundo estudiante
        JOptionPane.showMessageDialog(null, "DATOS DEL ESTUDIANTE 2\n\n" + "Nombre: "+ estudiante2.nombre + "\nEdad: " + estudiante2.edad + "\nCarrera: " + estudiante2.carrera + "\nPromedio: " + estudiante2.promedio + "\nEstado: " + estado2, "Estudiante 2", JOptionPane.INFORMATION_MESSAGE);
    }
}