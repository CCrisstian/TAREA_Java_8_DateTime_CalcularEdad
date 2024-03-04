<h1 align="center">Tarea: Calcular edad</h1>
<p>Calcular edad ingresando la fecha de nacimiento de una persona con java 8 <b>'date time'</b>.</p>
<p>Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo LocalDate y calcular la edad de la persona de acuerdo a la fecha actual.</p>

<h2>Respuestas del profesor</h2>
<h3>Forma 1:</h3>

```java
package com.mycompany.detalledefactura;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramaCalculoEdadJava8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, actual);
        System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
```
<h3>Forma 1:</h3>

```java
package com.mycompany.detalledefactura;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ProgramaCalculoEdadJava82 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        long anios = ChronoUnit.YEARS.between(fechaNacimiento, actual);
        System.out.printf("Tu edad es: %s años", anios);
    }
}
```
