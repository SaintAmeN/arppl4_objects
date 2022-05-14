package pl.sda.arp4.objects.daty;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Zadanie5AutostradaBursztynowa {
    public static void main(String[] args) {
        /**
         * 5. Napisz program “AutostradaBursztynowa” do naliczania opłat za przejazd pojazdów.
         * - Stwórz klasę Pojazd, dodaj do niej:
         *      - pole identyfikujące jednoznacznie pojazd
         *          - String nrRejestracyjny
         *      - pola które będą potrzebne do obliczenia czasu przejazdu
         *          - LocalDateTime czasWjazdu;
         *          - LocalDateTime czasWyjazdu;
         *      - pole określające rodzaj pojazdu, na podstawie tego pola będziemy naliczali inną opłatę dla pojazdów osobowych, ciężarowych i jednośladów
         *          - Stworzyć enum
         *              - RodzajPojazdu
         *                  - OSOBOWY   - cena 3.2
         *                  - CIEZAROWY - cena 5.9
         *                  - JEDNOSLAD - cena 1.1
         * Stwórz klasę Main i w niej użytkownik wprowadza wszystkie dane pojazdu.
         * Po ich podaniu wypisz użytkownikowi informację: “Zarejestrowano wjazd”
         * Po tym odczytaj od użytkownika linię tekstu lub słowo.
         *
         * Jeśli użytkownik wpisze: “wyjazd” to program powinien obliczyć ile czasu minęło od
         * momentu zarejestrowania wjazdu do momentu wpisania “wyjazd” i obliczyć opłatę.
         *
         * Wypisz wynik obliczenia.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer rejestracyjny:");
        String numerRejestracyjny = scanner.nextLine();

        // Inicjalnie rodzajPojazdu nie posiada przypisanej wartości.
        //
        // Poniższa pętla będzie się wykonywać dopóki rodzajPojazdu
        // nie posiada przypisanej wartości (jest nullem)
        RodzajPojazdu rodzajPojazdu = null;
        do {
            // W każdym obiegu pętli użytkownik może wpisać linię tekstu w której
            // ma się znajdować słowo == rodzajPojazdu
            //
            // Jeśli użytkownik wprowadzi złe wejście, będzie musiał powtórzyć wpisanie
            System.out.println("Podaj rodzaj pojazdu:");
            String rodzajPojazduText = scanner.nextLine();

            try { // osoboWy -> OSOBOWY
                // Sprawdzamy czy wprowadzona opcja jest poprawna poprzez parsowanie.
                rodzajPojazdu = RodzajPojazdu.valueOf(rodzajPojazduText.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.out.println("Wprowadzono niepoprawny rodzaj pojazdu!");
            }
            // dopóki rodzajPojazdu == null
            // czyli dopóki nie został wczytany poprawny rodzaj pojazdu w linii 51
        } while (rodzajPojazdu == null);

        Pojazd pojazd = new Pojazd(numerRejestracyjny, rodzajPojazdu);

        String wpisaneSlowo;
        do { // wykonuj pętlę
            System.out.println("Wpisz 'wyjazd' aby opuścić autostradę:");
            wpisaneSlowo = scanner.nextLine();

            // dopóki wpisane słowo nie jest słowem 'wyjazd'
        } while (!wpisaneSlowo.equals("wyjazd"));

        // wczytaliśmy wyjazd.
        LocalDateTime czasWyjazdu = LocalDateTime.now();

        // ustawiamy 'czasWyjazdu' (pole w klasie Pojazd)
        pojazd.setCzasWyjazdu(czasWyjazdu);

        // obliczamy czas przejazdu
        Duration czasPrzejazdu = pojazd.obliczCzasPrzejazdu();

        // obliczamy kwotę do zapłaty. Kwota = cena * ilość minut spędzonych na autostradzie
        double kwotaDoZaplaty = (czasPrzejazdu.getSeconds() / 60.0) * pojazd.getRodzajPojazdu().getCena();

        // %d - decimal (liczba całkowita)
        // %f - floating (liczba 'po przecinku')
        //      .2 oznacza precyzję do dwóch miejsc po przecinku
        //      .6 oznacza precyzję do sześciu miejsc po przecinku
        // %s - string
        String komunikat = String.format("Kwota do zapłaty to: %.2f, czas spędzony na autostradzie to: %d s", kwotaDoZaplaty, czasPrzejazdu.getSeconds());
        System.out.println(komunikat);
    }
}
