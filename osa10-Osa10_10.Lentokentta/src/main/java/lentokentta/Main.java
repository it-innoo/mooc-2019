package lentokentta;

import java.util.Scanner;
import lentokentta.logiikka.Lentohallinta;
import lentokentta.ui.Tekstikayttoliittyma;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Scanner lukija = new Scanner(System.in);
        Lentohallinta lh = new Lentohallinta();

        Tekstikayttoliittyma tk = new Tekstikayttoliittyma(lh, lukija);
        tk.paivita();
    }
}
