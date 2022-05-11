package pl.sda.arp4.objects.modele;

public class MainMis {
    public static void main(String[] args) {
        Mis mis1 = new Mis("Koala", 23);
        Mis mis2 = new Mis("Niedzwiadek", 25);

        System.out.println(mis1);
        System.out.println(mis2);

        // \n -> new line (nowa linia)
        System.out.println(mis1 + "\n" + mis2);
        System.out.println("Byl sobie mis o imieniu " + mis1.getImie() + " ktory mial " + mis1.getWiek() + " lat");
    }
}
