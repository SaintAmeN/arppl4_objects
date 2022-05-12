package pl.sda.arp4.objects.domowe;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Zadanie domowe:
 *
 * Stwórz enum RodzajBiletu.:
 *  Rodzaje biletów:
 *      - NORMLANY_GODZINA,  		- cena 1.70
 *      - ULGOWY_STUDENCKI, 		- cena 0.90
 *      - NORMALNY_CALODNIOWY. 	    - cena 5.30
 *      - ULGOWY_EMERYT,			- cena 0.30
 * Stwórz aplikację w rodzaju formularza.
 * Zapytaj użytkownika o rodzaj biletu i po wpisaniu
 * odpowiedniej wartości wyświetl mu cenę.
 * Następnie zapytaj użytkownika o ilość biletów i
 * wypisz na ekran cenę podanej ilości wybranych biletów.
 */
public class Zadanie1Bilet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RodzajBiletu rodzaj = null;
        do{
//            Podaj rodzaj biletu (dostępne rodzaje: NORMLANY_GODZINA, ULGOWY_STUDENCKI, NORMALNY_CALODNIOWY):
//            System.out.println("Podaj rodzaj biletu (dostępne rodzaje: " + Arrays.toString(RodzajBiletu.values()) + "):");
            System.out.print("Podaj rodzaj biletu (dostępne rodzaje: " );
            for (RodzajBiletu rodzajBiletu : RodzajBiletu.values()) {
                System.out.print(rodzajBiletu + " ");
            }
            System.out.println("):");

            String wpisaneSlowo = scanner.next();
            try{
                rodzaj = RodzajBiletu.valueOf(wpisaneSlowo);
            }catch (IllegalArgumentException iae){
                System.err.println("Nie ma takiej opcji.");
            }

        }while (rodzaj == null);

        double cena = 0.0 ;
        switch (rodzaj){
            case ULGOWY_EMERYT:
                System.out.println("Cena to: " + 0.3d);
                cena = 0.3;
                break;
            case NORMLANY_GODZINA:
                System.out.println("Cena to: " + 1.7d);
                cena = 1.7;
                break;
            case ULGOWY_STUDENCKI:
                System.out.println("Cena to: " + 0.9d);
                cena = 0.9;
                break;
            case NORMALNY_CALODNIOWY:
                System.out.println("Cena to: " + 5.3d);
                cena = 5.3;
                break;
        }

        System.out.println("Podaj ilość biletów które chcesz kupić:");
        int iloscBiletow = scanner.nextInt();

        System.out.println("Cena biletów to: " + (iloscBiletow*cena));
    }
}
