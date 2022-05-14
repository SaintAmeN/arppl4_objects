package pl.sda.arp4.objects.daty;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie3Data {
    public static void main(String[] args) {
        /**
         * 3. Pobierz od użytkownika dwie daty. Jedna w formacie:
         * yyyy::MM::dd
         oraz druga w formacie:
         MM::yyyy::dd

         Wypisz wynik różnicy dat w formacie:
         Minęło: X lat, Y miesięcy, Z dni.
         */
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        System.out.println("Wpisz date w formacie yyyy::MM::dd:");
        String wpisanaData1 = scanner.next();                                   // 2022::03::10
        LocalDate data1 = LocalDate.parse(wpisanaData1, formatter1);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM::yyyy::dd");
        System.out.println("Wpisz date w formacie MM::yyyy::dd:");
        String wpisanaData2 = scanner.next();                                   // 02::2021::05
        LocalDate data2 = LocalDate.parse(wpisanaData2, formatter2);


        // Math.abs(x) -> wartość bezwzględna z wartości zmiennej x
        Period period = Period.between(data1, data2);
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println("Minęło: " + years + " lat, " + months + " miesięcy, " + days + " dni.");
    }
}
