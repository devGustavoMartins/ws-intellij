package application;



import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        /*
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-02-08");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-08T20:30:00");
        Instant d06 = Instant.parse("2023-02-08T20:30:00Z");
        Instant d07 = Instant.parse("2023-02-08T20:30:00-03:00");
        LocalDate d08 = LocalDate.of(2023, 02, 8);

        System.out.println("Data 1 -> " + d01);
        System.out.println("----------------");
        System.out.println("Data 2 -> " + d02);
        System.out.println("----------------");
        System.out.println("Data 3 -> " + d03);
        System.out.println("----------------");
        System.out.println("Data 4 -> " + d04);
        System.out.println("----------------");
        System.out.println("Data 5 -> " + d05);
        System.out.println("----------------");
        System.out.println("Data 6 -> " + d06);
        System.out.println("----------------");
        System.out.println("Data 7 -> " + d07);
        System.out.println("----------------");
        System.out.println("Data 8 -> " + d08);
        System.out.println("----------------");
         */
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.parse("2023-02-08");
        LocalDateTime d02 = LocalDateTime.parse("2023-02-08T20:30:00");
        Instant d03 = Instant.parse("2023-02-08T20:30:00Z");

        System.out.println("Data 1 -> " + d01.format(fmt1));
        System.out.println("Data 1 -> " + fmt1.format(d01));
        System.out.println("Data 1 -> " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("-----------------------");
        System.out.println("Data 2 -> " + d02.format(fmt2));
        System.out.println("----------------------------");
        System.out.println("Data 3 -> " + fmt3.format(d03));
    }
}
