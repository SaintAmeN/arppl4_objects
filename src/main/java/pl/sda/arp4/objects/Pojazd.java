package pl.sda.arp4.objects;

public class Pojazd {
    private String numerRejestracyjny;
    private RodzajPojazdu rodzajPojazdu;

    public Pojazd(String numerRejestracyjny, RodzajPojazdu rodzajPojazdu) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.rodzajPojazdu = rodzajPojazdu;
    }
}
