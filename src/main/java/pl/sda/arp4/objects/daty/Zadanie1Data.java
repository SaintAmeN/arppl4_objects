package pl.sda.arp4.objects.daty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Zadanie1Data {
    public static void main(String[] args) {
        /**
         * Stwórz aplikację która w pętli przyjmuje polecenie:
         *         - wpisanie ‘date’ wypisuje obecny LocalDate
         *         - wpisanie ‘time’ wypisuje obecny LocalTime
         *         - wpisanie ‘datetime’ wypisuje obecny LocalDateTime
         *         (W wybranym przez Ciebie formacie)
         *     Jeśli użytkownik wpisze 'quit' to zakoncz program.
         */
        Scanner scanner = new Scanner(System.in);

        String wpisane;
        do {
            System.out.println("Wpisz jedno ze słów (date, time datetime):");
            wpisane = scanner.next();

            if (wpisane.equals("date")) {
                LocalDate date = LocalDate.now();
                System.out.println("date: " + date);
            } else if (wpisane.equals("time")) {
                LocalTime time = LocalTime.now();
                System.out.println("time: " + time);
            } else if (wpisane.equals("datetime")) {
                LocalDateTime dateTime = LocalDateTime.now();
                System.out.println("datetime: " + dateTime);
            }
            // dopóki nie wpisano quit
        } while (!wpisane.equals("quit"));
    }
}
