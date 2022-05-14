package pl.sda.arp4.objects.daty;

import java.time.Duration;
import java.time.LocalDateTime;

// klasa
public class Pojazd {
    private String nrRejestracyjny;
    private RodzajPojazdu rodzajPojazdu;
    private LocalDateTime czasWjazdu;
    private LocalDateTime czasWyjazdu;

    // konstruktor
    public Pojazd(String nrRejestracyjny, RodzajPojazdu rodzajPojazdu) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.rodzajPojazdu = rodzajPojazdu;

        this.czasWjazdu = LocalDateTime.now();
        System.out.println("Pojazd " + nrRejestracyjny + " wjechał na autostradę o: " + czasWjazdu);
    }

    public void setCzasWyjazdu(LocalDateTime czasWyjazdu) {
        this.czasWyjazdu = czasWyjazdu;
    }

    public RodzajPojazdu getRodzajPojazdu() {
        return rodzajPojazdu;
    }

    public Duration obliczCzasPrzejazdu() {
        Duration czasPrzejazdu = Duration.between(czasWjazdu, czasWyjazdu);
        return czasPrzejazdu;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "nrRejestracyjny='" + nrRejestracyjny + '\'' +
                ", rodzajPojazdu=" + rodzajPojazdu +
                ", czasWjazdu=" + czasWjazdu +
                ", czasWyjazdu=" + czasWyjazdu +
                '}';
    }
}
