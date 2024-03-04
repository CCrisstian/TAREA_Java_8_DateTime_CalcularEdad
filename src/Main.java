import javax.swing.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        int year_Ingresado, month_Ingresado, day_Ingresado;
        LocalDate fecha_Ingresada;
        LocalDate fecha_Actual = LocalDate.now();
        long edad;
        boolean entradaInvalida = true;

        while (entradaInvalida) {
            try {
                String input = JOptionPane.showInputDialog("Ingresa tu año de nacimiento");
                year_Ingresado = Integer.parseInt(input);
                input = JOptionPane.showInputDialog("Ingresa tu mes de nacimiento");
                month_Ingresado = Integer.parseInt(input);
                input = JOptionPane.showInputDialog("Ingresa tu dia de nacimiento");
                day_Ingresado = Integer.parseInt(input);
                fecha_Ingresada = LocalDate.of(year_Ingresado, month_Ingresado, day_Ingresado);

                edad = ChronoUnit.YEARS.between(fecha_Ingresada, fecha_Actual);
                StringBuilder mensaje = new StringBuilder("Tu edad es: ").append(edad);
                JOptionPane.showMessageDialog(null, mensaje, "Tarea: Calcular edad", JOptionPane.INFORMATION_MESSAGE);

                entradaInvalida = false; // Si llega aquí, la conversión fue exitosa
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error. Debes ingresar un número entero.");
            }
        }
    }
}