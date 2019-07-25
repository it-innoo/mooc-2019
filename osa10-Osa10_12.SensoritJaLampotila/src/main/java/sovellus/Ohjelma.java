package sovellus;

public class Ohjelma {

    public static void main(String[] args) {
        // voit testata luokkiasi täällä
        Vakiosensori kymppi = new Vakiosensori(10);
        Vakiosensori miinusViis = new Vakiosensori(-5);

        System.out.println(kymppi.mittaa());
        System.out.println(miinusViis.mittaa());

        System.out.println(kymppi.onPaalla());
        kymppi.poisPaalta();
        System.out.println(kymppi.onPaalla());

        System.out.println();
        System.out.println("=====");
        System.out.println();

        Sensori kumpula = new Lampomittari();
        kumpula.paalle();
        System.out.println("lämpötila Kumpulassa " + kumpula.mittaa() + " astetta");

        Sensori kaisaniemi = new Lampomittari();
        Sensori helsinkiVantaa = new Lampomittari();

        Keskiarvosensori paakaupunki = new Keskiarvosensori();
        paakaupunki.lisaaSensori(kumpula);
        paakaupunki.lisaaSensori(kaisaniemi);
        paakaupunki.lisaaSensori(helsinkiVantaa);

        paakaupunki.paalle();
        System.out.println("lämpötila Pääkaupunkiseudulla " + paakaupunki.mittaa() + " astetta");
    }

}
