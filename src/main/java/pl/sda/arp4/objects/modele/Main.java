package pl.sda.arp4.objects.modele;

public class Main {
    public static void main(String[] args) {
//        String tekst;
        // zmienna typu Pies o nazwie pies1
        Pies pies1 = new Pies();
//        pies1.imie = "Burek";
        pies1.setImie("Burek");
        System.out.println(pies1.getImie());
        System.out.println(pies1);

        Pies pies2 = new Pies("Wacław");
//        pies2.imie = "Wacław";
        System.out.println(pies2);

        Student student1 = new Student("Paweł");
//        student1.imie = "Paweł";
//        student1.nazwisko = "Gaweł";
        System.out.println(student1);
        System.out.println("Ten student ma na imie: " + student1.getImie());

        student1.przedstawSie();
    }
}
