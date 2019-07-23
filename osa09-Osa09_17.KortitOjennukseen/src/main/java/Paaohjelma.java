

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia

        Kortti eka = new Kortti(2, Maa.RUUTU);
        Kortti toka = new Kortti(14, Maa.PATA);
        Kortti kolmas = new Kortti(12, Maa.HERTTA);

        System.out.println(eka);
        System.out.println(toka);
        System.out.println(kolmas);

        System.out.println("");
        System.out.println("=====");
        System.out.println("");
        Kasi kasi = new Kasi();

        kasi.lisaa(new Kortti(2, Maa.RUUTU));
        kasi.lisaa(new Kortti(14, Maa.PATA));
        kasi.lisaa(new Kortti(12, Maa.HERTTA));
        kasi.lisaa(new Kortti(2, Maa.PATA));

        kasi.jarjesta();

        kasi.tulosta();
        
        System.out.println("");
        System.out.println("=====");
        System.out.println("");
        kasi.tyhjenna();

        kasi.lisaa(new Kortti(12, Maa.HERTTA));
        kasi.lisaa(new Kortti(4, Maa.PATA));
        kasi.lisaa(new Kortti(2, Maa.RUUTU));
        kasi.lisaa(new Kortti(14, Maa.PATA));
        kasi.lisaa(new Kortti(7, Maa.HERTTA));
        kasi.lisaa(new Kortti(2, Maa.PATA));

        kasi.jarjestaMaittain();

        kasi.tulosta();
    }
}
