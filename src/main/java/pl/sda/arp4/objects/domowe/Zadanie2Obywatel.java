package pl.sda.arp4.objects.domowe;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Stwórz enum Płeć która posiada wartości: KOBIETA, MĘŻCZYZNA
 * Stwórz klasę Obywatel która posiada pola:
 * Płeć
 * Imie
 * Nazwisko
 * Pesel
 * Stwórz Maina w formie 'formularza' w którym zadajemy użytkownikowi pytania o jego dane
 * (imie, nazwisko, pesel, płeć).
 * Zaimplementuj w klasie Obywatel metodę toString.
 * Stwórz main’a, w mainie stwórz obiekt Obywatel (Użytkownik podaje informacje o sobie i po podaniu wszystkich wartości tworzymy nowy obiekt typu "Obywatel".) i pozwól użytkownikowi wpisać wszystkie dane (przemyśl jak zrobić pytanie o płeć).
 * stwórz metodę przedstawSię() w której wypisz metodą sout informacje o obywatelu. Użyj metody w main
 */
public class Zadanie2Obywatel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Plec plec = null;
        do {
            System.out.println("Podaj plec (" + Arrays.toString(Plec.values()) + "): ");
            String wpisaneSlowo = scanner.next();
            try {
                plec = Plec.valueOf(wpisaneSlowo.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Nie ma takiej opcji.");
            }
        } while (plec == null);

        System.out.println("Podaj swoje imie:");
        String wpisaneImie = scanner.next();

        System.out.println("Podaj swoje nazwisko:");
        String wpisaneNazwisko = scanner.next();

        System.out.println("Podaj swoje pesel:");
        String wpisanePesel = scanner.next();

        Obywatel obywatel = new Obywatel(wpisaneImie, wpisaneNazwisko, wpisanePesel, plec);
        obywatel.przedstawSie();
    }
}
