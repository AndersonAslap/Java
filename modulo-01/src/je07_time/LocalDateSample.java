package je07_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate myBirthDay = LocalDate.of(1998,12,29);
        System.out.println(myBirthDay);

        LocalDate myBirthDay2 = LocalDate.of(1998, Month.DECEMBER,29);
        System.out.println(myBirthDay2);

        String dataString = "2025-04-07";
        LocalDate dataConcreta = LocalDate.parse(dataString);
        System.out.println(dataConcreta);

        String brDataString = "07/04/2025";
        // existem vários patterns de formatação estudar
        String _pattern = "dd/MM/yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(_pattern);
        LocalDate dataConcreta2 = LocalDate.parse(brDataString, formatter);
        System.out.println(dataConcreta2);
        System.out.println(formatter.format(dataConcreta2));

        LocalDate myBirthDay3 = LocalDate.of(1998,12,29);
        LocalDate myBirthDay3WithPlus5Years = myBirthDay3.plusYears(5);
        System.out.println(myBirthDay3WithPlus5Years);

        LocalDate myBirthDay3WithMinus7Days = myBirthDay3.minusDays(7);
        System.out.println(myBirthDay3WithMinus7Days);

        System.out.println(myBirthDay3WithPlus5Years.isAfter(myBirthDay3WithMinus7Days));
        System.out.println(myBirthDay3WithPlus5Years.isBefore(myBirthDay3WithMinus7Days));
        System.out.println(myBirthDay3WithPlus5Years.isEqual(myBirthDay3WithMinus7Days));

        // Estilos de formatações
        System.out.println(currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.US)));

        // Dados Específicos
        System.out.println(currentDate.getDayOfMonth());
        System.out.println(currentDate.getYear());
        System.out.println(currentDate.getMonth());
        System.out.println(currentDate.getMonthValue());
    }
}
