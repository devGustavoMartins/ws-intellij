package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program2 {
    public static void main(String[] args) {
        //LocalDate d02 = d01.plus(7, ChronoUnit.YEARS);

        LocalDate d01 = LocalDate.parse("2023-02-09");
        LocalDate pastWeekLocalDate = d01.minusWeeks(1);
        LocalDate nextWeekLocalDate = d01.plusWeeks(1);

        Instant d03 = Instant.parse("2023-02-08T20:30:00Z");
        Instant d04 = d03.plus(3, ChronoUnit.HOURS);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        System.out.println("Past week -> " + fmt1.format(pastWeekLocalDate));
        System.out.println("This day -> " + fmt1.format(d01));
        System.out.println("Next week -> " + fmt1.format(nextWeekLocalDate));
        System.out.println();
        System.out.println("Data 3 -> " + fmt2.format(d03));
        System.out.println("Data 4 -> " + fmt2.format(d04));

        System.out.println();
        Duration t1 = Duration.between(d03, d04);
        Duration t2 = Duration.between(d01.atStartOfDay(), nextWeekLocalDate.atStartOfDay());

        System.out.println(t1.toHours() + " horas de diferença");
        System.out.println(t2.toDays() + " dias de diferença");
    }
}
