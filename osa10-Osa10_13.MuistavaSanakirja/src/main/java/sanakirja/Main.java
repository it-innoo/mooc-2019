package sanakirja;

public class Main {
    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        MuistavaSanakirja sanakirja = new MuistavaSanakirja("sanat.txt");
        boolean onnistui = sanakirja.lataa();

        if (onnistui) {
            System.out.println("sanakirjan lataaminen onnistui");
        }

        sanakirja.lisaa("apina", "monkey");
        sanakirja.lisaa("banaani", "banana");
        sanakirja.lisaa("apina", "apfe");
        sanakirja.lisaa("tietokone", "computer");
        sanakirja.lisaa("computer", "tietokone");
        

        System.out.println(sanakirja.kaanna("apina"));
        System.out.println(sanakirja.kaanna("monkey"));
        System.out.println(sanakirja.kaanna("ohjelmointi"));
        System.out.println(sanakirja.kaanna("banana"));
        System.out.println(sanakirja.kaanna("ohjelmointi"));
        System.out.println(sanakirja.kaanna("alla oleva"));

        sanakirja.tallenna();
    }
}
