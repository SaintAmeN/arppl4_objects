package pl.sda.arp4.objects.modele;

public class Pies {
    // enkapsulacja / zamykanie dostępu
    // modyfikatory dostępu (słowa określające dostęp do rzeczy):
    // - private
    // - '' (default aka niejawny aka 'package protected')
    // - protected
    // - public

    private String imie;

    // konstruktor domyślny wygenerowany istnieje
    //      !!! jeśli nie istnieje żaden inny konstruktor
    // konstruktor domyślny = wygenerowany
    // konstruktor bezparametrowy
    public Pies() {
    }

    public Pies(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String toString() {
        return "Pies{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
