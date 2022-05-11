package pl.sda.arp4.objects.kalkulator;

import java.util.Scanner;

public class MainKalkulatorIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        int wynik;

        System.out.println("Podaj liczbę pierwszą:");
        int liczbaPierwsza = scanner.nextInt();
        System.out.println("Podaj liczbę drugą:");
        int liczbaDruga = scanner.nextInt();

        System.out.println("Podaj działanie matematyczne (dodaj/odejmij/pomnoz/podziel):");
        String dzialanie =  scanner.next();

        if ("dodaj".equals(dzialanie)) {
            wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);
        } else if ("odejmij".equals(dzialanie)) {
            wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);
        } else if ("pomnoz".equals(dzialanie)) {
            wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);
        } else if ("podziel".equals(dzialanie)) {
            try {
                // try -> blok kodu w którym może wystąpić błąd
                wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);

                System.out.println("Wynik = " + wynik);
            } catch (ArithmeticException nazwaZmiennejWyjatku) {
                // catch -> blok który wywoła się tylko jeśli wystąpi błąd
                //          i go złapiemy
                System.out.println("Nie można dzielić przez zero!");
            }
        } else {
            System.out.println("Niepoprawna komenda!");
        }
    }
}
