package pl.sda.arp4.objects.daty;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie2Data {
    public static void main(String[] args) {
        /**
         * 2. Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: , days: "
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz date w formacie yyyy-MM-dd:");
        String wpisanaData1 = scanner.next();                                   // 2022-03-10
        LocalDate data1 = LocalDate.parse(wpisanaData1, formatter);

        System.out.println("Wpisz date w formacie yyyy-MM-dd:");
        String wpisanaData2 = scanner.next();                                   // 2021-02-10
        LocalDate data2 = LocalDate.parse(wpisanaData2, formatter);

        Period period = Period.between(data1, data2);
        System.out.println("Period is: " + period);
        System.out.println("years: " + period.getYears() + " months: " + period.getMonths() + " days: " + period.getDays());

        // Math.abs(x) -> wartość bezwzględna z wartości zmiennej x
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println("years: " + years + " months: " + months + " days: " + days);
    }
}
