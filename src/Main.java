import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String date = "01.02.2017";
        System.out.println(format(date));
        String time = "12:54";
        System.out.println(zad2(time));


        LocalDate data1 = LocalDate.of(1991, 4, 12);
        LocalDate data2 = LocalDate.of(1982, 2, 13);
        LocalDate data3 = LocalDate.of(1983, 4, 15);
        List<LocalDate> daty = Arrays.asList(data1, data2, data3);
        System.out.println(zad4(daty));

    }

    public static LocalDate format(String a) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate localDate = LocalDate.parse(a, dateTimeFormatter);
        return localDate;

    }

    public static LocalTime zad2(String a) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(a, dateTimeFormatter);

    }

    public static LocalDateTime zad3(LocalDate a, LocalTime b) {

        return LocalDateTime.of(a, b);
    }

    public static List<LocalDate> zad4(List<LocalDate> listad) {

        List<LocalDate> lista = listad.stream()
                .sorted()
               .collect(Collectors.toList());


        return lista;
    }


}
