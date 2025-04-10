package je07_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSimple {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);

        LocalTime horaMinutoSegundoEspecifico = LocalTime.of(21,5,0);
        System.out.println(horaMinutoSegundoEspecifico);

        LocalTime horaMinutoEspecifico = LocalTime.of(21,6);
        System.out.println(horaMinutoEspecifico);

        LocalTime horaDeUmaString = LocalTime.parse("21:07:00");
        System.out.println(horaDeUmaString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime horaDeUmaStringDespadronizada = LocalTime.parse("210910", formatter);
        System.out.println(horaDeUmaStringDespadronizada);
    }
}
