package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadanie8StringSlowa {
    public static void main(String[] args) {
        /**
         * 8. Napisz aplikację która przyjmuje od użytkownika tekst, a następnie dzieli go na poszczególne słowa.
         * Następnie aplikacja zlicza ilości wystąpień słów.
         *
         * Np. dla tekstu:
         * 		ala lubi koty, ale ala nie jest przez koty lubiana
         *
         *  ala - 2
         * 	lubi - 1
         * 	koty - 2
         * 	ale - 1
         * 	nie - 1
         * 	jest - 1
         * 	przez - 1
         * 	lubiana - 1
         */
        // substring & indexOf

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();

        // podmienianie znaku (replace / replaceAll)
        String tekstBezPrzecinkow = tekst.replaceAll(",", "");

        // split podzieli zdanie na poszczególne słowa
        String[] slowa = tekstBezPrzecinkow.split(" ");

        for (int i = 0; i < slowa.length; i++) {
            String slowoSzukane = slowa[i];

            int licznik = 0;
            for (int j = 0; j < slowa.length; j++) {
                String slowoPorownywane = slowa[j];

                boolean czyToSlowoJuzBylo = slowoSzukane.equals(slowoPorownywane) && j < i;
                if (czyToSlowoJuzBylo) {
                    break;
                }
                if (slowoSzukane.equals(slowoPorownywane)) {
                    licznik++;
                }
            }

            if (licznik != 0) {
                System.out.println("Slowo szukane: " + slowoSzukane + " wystapilo: " + licznik + " razy");
            }
        }

    }
}
