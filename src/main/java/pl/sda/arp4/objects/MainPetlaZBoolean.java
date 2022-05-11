package pl.sda.arp4.objects;

import java.util.Scanner;

public class MainPetlaZBoolean {
    public static void main(String[] args) {
        // wypisanie wszystkich dostępnych opcji ENUM
        for (RodzajPojazdu rodzaj : RodzajPojazdu.values()) {
            System.out.println(rodzaj);
        }
        Scanner scanner = new Scanner(System.in);
        // użytkownik wpisuje coś do scannera
        // a w wyniku chcę otrzymać zmienną typu RodzajPojazdu
        RodzajPojazdu zmienna = null;

        boolean czyUstawiona = false;
        while (!czyUstawiona) {
            System.out.println("Podaj rodzaj pojazdu:");
            String rodzajString = scanner.next();

            try {
                // zamiast pisać if/else dla wszystkich rodzajów i porównywać
                // możemy zastosować metodę .valueOf która wygenerowana jest
                // dla każdego typu wyliczeniowego(enum)
                zmienna = RodzajPojazdu.valueOf(rodzajString.toUpperCase());

                czyUstawiona = true;
            } catch (IllegalArgumentException iae) {
                System.out.println("Wybrana opcja nie istnieje...");
            }
        }
        System.out.println(zmienna);

//        if (rodzajString.equalsIgnoreCase("osobowy")) {
//            zmienna = RodzajPojazdu.OSOBOWY;
//        } else if (rodzajString.equals("ciezarowy")) {
//            zmienna = RodzajPojazdu.CIEZAROWY;
//        } else if (rodzajString.equals("jednoslad")) {
//            zmienna = RodzajPojazdu.JEDNOSLAD;
//        }
//
//        if (rodzajString.equalsIgnoreCase("1")) {
//            zmienna = RodzajPojazdu.OSOBOWY;
//        } else if (rodzajString.equals("2")) {
//            zmienna = RodzajPojazdu.CIEZAROWY;
//        } else if (rodzajString.equals("3")) {
//            zmienna = RodzajPojazdu.JEDNOSLAD;
//        }

    }
}
