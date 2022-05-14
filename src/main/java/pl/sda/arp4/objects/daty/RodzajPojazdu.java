package pl.sda.arp4.objects.daty;

public enum RodzajPojazdu {
    OSOBOWY  (3.2),
    CIEZAROWY(5.9),
    JEDNOSLAD(1.1);

    private final double cena;

    RodzajPojazdu(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }
}
