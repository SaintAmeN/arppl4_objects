package pl.sda.arp4.objects.daty;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Standardowa Biblioteka Javy = Java SE (Standard Edition)
        Date data = new Date();
        System.out.println(data);

        // joda time
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // stworzenie formattera
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); // M - Month , m = minute
//        System.out.println(formatter.format(localDate)); // exception // Unsupported field: HourOfDay
//        System.out.println(formatter.format(localTime)); // exception // Unsupported field: YearOfEra
        System.out.println(formatter.format(localDateTime));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz date i godzine 1:");
        String dataOdUzytkownika1 = scanner.nextLine();

        LocalDateTime datetime1 = LocalDateTime.parse(dataOdUzytkownika1, formatter);
        System.out.println("Wprowadziłeś: " + datetime1);
        System.out.println("Wprowadziłeś: " + formatter.format(datetime1));
//        LocalDate.parse(dataOdUzytkownika, formatter);
//        LocalTime.parse(dataOdUzytkownika, formatter);
        // formatter.parse(dataOdUzytkownika); // to wymaga dużo pracy z rzutowaniem obiektów
        System.out.println("Date in 5 days: " + datetime1.plusDays(5));
        System.out.println("Date in 5 days: " + datetime1.plusDays(5));

        System.out.println("Wprowadz date i godzine 2:");
        String dataOdUzytkownika2 = scanner.nextLine();
        LocalDateTime datetime2 = LocalDateTime.parse(dataOdUzytkownika2, formatter);

        // Duration pozwala obliczać różnicę między data/czas i podać wynik z większą precyzją (sekundy, milisekundy itd.)
        System.out.println("Od daty 1 do daty 2 minelo: " + Duration.between(datetime1, datetime2).getSeconds());

        // Period pozwala obliczać różnicę między datami (odległe czasy) - wynik w latach, dniach, miesiącach.
        Period period = Period.between(datetime1.toLocalDate(), datetime2.toLocalDate());
        System.out.println("Od daty 1 do daty 2 minelo: " + period);
        System.out.println("Od daty 1 do daty 2 minelo: " + period.getYears() + " lat " + period.getMonths() + " miesiecy " + period.getDays() + " dni");
    }
}
