package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadanie3StringDzialaWadliwie {
    public static void main(String[] args) {
//        3. Wczytaj od użytkownika jedną !linię tekstu! i przypisz ją do zmiennej text a
//        następnie wczytaj od użytkownika !słowo! i przypisz je do zmiennej searched.
//        Następnie przeszukaj tekst w poszukiwaniu słowa przypisanego do zmiennej searched.

        // searched -> słowo
        // text     -> linia tekstu

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj searched:");
        String searched = scanner.next();

        // sztuczne wczytanie linii aby zignorować wciśnięty enter.
//        scanner.nextLine();

//        Ponieważ zatwierdzenie wejścia przesyłamy klikając enter to znak nowej linii
//        interpretowany jest na poczet metody nextLine()
        System.out.println("Podaj linię tekstu:");
        String text = scanner.nextLine();

        System.out.println("Searched: '" + searched + "'");
        System.out.println("Tekst: '" + text + "'");

        System.out.println("Znaleziono: " + text.contains(searched));
    }
}
