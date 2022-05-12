package pl.sda.arp4.objects.domowe;

public enum RodzajBiletu {
    NORMLANY_GODZINA(0.3),           // oddzielny obiekt => a
    ULGOWY_STUDENCKI(1.7),           // oddzielny obiekt => b
    NORMALNY_CALODNIOWY(0.9),        // oddzielny obiekt => c
    ULGOWY_EMERYT(5.3);              // oddzielny obiekt => d
    // średnik na końcu listy rodzajów oznacza zakończenie listy i rozpoczęcie definicji typu

    // final -> zmienna która jest stała :)
    private final double cena;

    RodzajBiletu(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }
}
