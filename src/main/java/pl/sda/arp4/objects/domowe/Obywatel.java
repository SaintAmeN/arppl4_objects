package pl.sda.arp4.objects.domowe;

public class Obywatel {
    private String imie;
    private String nazwisko;
    private String pesel;
    private Plec plec;

    public Obywatel(String imie, String nazwisko, String pesel, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.plec = plec;
    }

    public void przedstawSie(){
        System.out.println("Nazywam sie " + imie + " " + nazwisko + " urodziłem się roku pańskiego " + pesel.substring(0, 2));
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", plec=" + plec +
                '}';
    }
}
