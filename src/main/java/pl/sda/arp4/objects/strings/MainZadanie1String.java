package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadanie1String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź linię tekstu:");
        String tekst = scanner.nextLine();

        //a. sprawdź czy w tekście występuje słowo “ania” - contains
        if (tekst.contains("ania")) {
            System.out.println("contains: tekst zawiera słowo");
        }else{
            System.out.println("contains: tekst nie zawiera słowa");
        }

        //sprawdź czy tekst zaczyna się od słowa “ania” - startsWith
        System.out.println("startsWith: " + tekst.startsWith("ania"));
        //sprawdź czy tekst kończy się słowem “ania” - endsWith
        System.out.println("endsWith: " + tekst.endsWith("ania"));
        //sprawdź czy tekst równa się słowu “ania” - equals
        System.out.println("equals: " + tekst.equals("ania"));
        //sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania” - toLowerCase + contains
        System.out.println("toLowerCase contains: " + tekst.toLowerCase().contains("ania"));
        //zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście - indexOf
        int indeks = tekst.indexOf("ania");
        System.out.println("indexOf: " + indeks);

        //'to jest ania, i ma dwa buty ' -> 8
        // 012345678
    }
}
