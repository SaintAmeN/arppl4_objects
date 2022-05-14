package pl.sda.arp4.objects.daty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie1DataPlusMinus {
    public static void main(String[] args) {
        /**
         * 1. Napisz aplikację, która wyświetli datę (wpisaną ze scannera) sprzed 10 dni i datę za dziesięć dni.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz date w formacie yyyy-MM-dd:");
        String wpisanaData = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(wpisanaData, formatter);

        System.out.println("Data: " + data);
        System.out.println("Data +10dni: " + data.plusDays(10));
        System.out.println("Data -10dni: " + data.minusDays(10));

        // 00
    }
}
