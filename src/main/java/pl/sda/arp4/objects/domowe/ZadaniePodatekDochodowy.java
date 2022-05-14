package pl.sda.arp4.objects.domowe;

import java.util.Scanner;

public class ZadaniePodatekDochodowy {
    public static void main(String[] args) {
        /**
         * Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych.
         *
         * W programie zdefiniuj wartość dochód (double) na pewną wartość i po obliczeniu wypisywać
         * na ekranie należny podatek.
         *
         * Podatek obliczany jest wg. następujących reguł:
         *  -- do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
         *  -- od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
         */

        final double PROG_PODATKOWY = 85528;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę dochodu:");
        double dochod = scanner.nextDouble();

        double podatek;
        if (dochod <= PROG_PODATKOWY) {
            podatek = dochod * 0.18 - 556.02;
        } else {
            double nadwyzka = dochod - PROG_PODATKOWY;
            podatek = 14839.02 + (nadwyzka * 0.32);
        }

        System.out.println(String.format("Podatek wynosi: %.2f", podatek));
    }
}
