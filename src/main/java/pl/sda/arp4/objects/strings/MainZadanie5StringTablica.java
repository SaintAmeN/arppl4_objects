package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadanie5StringTablica {
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
        int[] zliczeniaZnakow = new int[127];

        for (int i = 0; i < znaki.length; i++) {                    // 10 - liniowa
            char znak = znaki[i]; // 'a' -> 97
            zliczeniaZnakow[((int)znak)] = zliczeniaZnakow[znak] + 1; // ++ inkrementacja
        }

        for (int i = 0; i < zliczeniaZnakow.length; i++) {          // 127
            if(zliczeniaZnakow[i] > 0){
                System.out.println(i + " ->" + zliczeniaZnakow[i]);
            }
        }
    }
}
