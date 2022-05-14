package pl.sda.arp4.objects.daty;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie4Data {
    public static void main(String[] args) {
        /**
         * 4. Napisz aplikację, która obliczy twój wiek. Podaj wiek w formacie:
         * - Masz X lat, Y miesięcy, Z dni. (użyj Period)
         * - Masz XYZ sekund. (użyj Duration)
         */
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Wpisz date swojego urodzenia w formacie [yyyy-MM-dd HH:mm:ss] :");
        String wpisanaData1 = scanner.nextLine();                                   // 1999-01-02 13:02:21
        LocalDateTime data1 = LocalDateTime.parse(wpisanaData1, formatter1);

        LocalDateTime dataTeraz = LocalDateTime.now();
        System.out.println("Obecna data to: " + formatter1.format(dataTeraz));

        Period period = Period.between(data1.toLocalDate(), dataTeraz.toLocalDate());
        Duration duration = Duration.between(data1, dataTeraz);

        System.out.println("Masz " + period.getYears() + " lat, " + period.getMonths() + " miesięcy, " + period.getDays());
        System.out.println("Masz " + duration.getSeconds() + " sekund");
    }
}
