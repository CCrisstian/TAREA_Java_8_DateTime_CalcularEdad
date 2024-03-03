import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int year_Ingresado, month_Ingresado, day_Ingresado;
        LocalDate fecha_Ingresada;
        LocalDate fecha_Actual = LocalDate.now();
        int edad;
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

                edad = fecha_Actual.getYear() - fecha_Ingresada.getYear();
                fecha_Ingresada = fecha_Ingresada.withYear(fecha_Actual.getYear());
                StringBuilder mensaje = new StringBuilder("Tu edad es: ");

                if (fecha_Actual.isBefore(fecha_Ingresada)){
                    mensaje.append(edad-1);
                    JOptionPane.showMessageDialog(null, mensaje, "Tarea: Calcular edad", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    mensaje.append(edad);
                    JOptionPane.showMessageDialog(null, mensaje, "Tarea: Calcular edad", JOptionPane.INFORMATION_MESSAGE);
                }

                entradaInvalida = false; // Si llega aquí, la conversión fue exitosa
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error. Debes ingresar un número entero.");
            }
        }
    }
}