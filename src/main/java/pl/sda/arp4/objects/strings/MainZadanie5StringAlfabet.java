package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadanie5StringAlfabet {
    public static void main(String[] args) {
        /**
         * 5. Napisz program który zlicza wystąpienia liter w tekście.
         * Posłuż się do tego pętlami for/while. (spróbuj zaimplementować na dwa sposoby).
         * sposób 1 ->  wskazówka 1: wykorzystaj kody ascii liter i iteruj tekst tyle razy,
         *              ile mamy liter w alfabecie i porównuj litery z kodami ascii
         * sposób 2 -> wskazówka 2: wykorzystaj do zliczania dodatkową tablicę.
         */
        // ala
        // a = 2
        // l = 1
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();

        char[] znaki = tekst.toCharArray();
        // iteruję alfabet
        for (char znak = 'a'; znak <= 'z'; znak++) {  // 25         // 25
            int licznik = 0;

            for (int i = 0; i < znaki.length; i++) {  // 10         // 50
                char literkai = znaki[i];             // 250        // 1250

                if (znak == literkai) {
                    licznik = licznik + 1;
                }
            }
            // wypisz tylko jeśli licznik != 0
            // będzie = 0 jeśli obecna litera jest powtórzona.
            if (licznik != 0) {
                System.out.println(znak + " ->" + licznik);
            }

        }
    }
}
