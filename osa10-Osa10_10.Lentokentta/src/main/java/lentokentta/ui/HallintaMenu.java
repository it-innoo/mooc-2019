/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.ui;

import java.util.Scanner;
import lentokentta.domain.Lentokone;
import lentokentta.logiikka.Lentohallinta;

/**
 *
 * @author jukka
 */
public class HallintaMenu implements Kayttoliittyma {
    private final Lentohallinta lentohallinta;
    private final Input input;
    private final String menu =
            "Valitse toiminto:\n" +
            "[1] Lisää lentokone\n" +
            "[2] Lisää lento\n" +
            "[x] Poistu hallintamoodista\n";

    HallintaMenu(Lentohallinta lh, Scanner lukija) {
        this.lentohallinta = lh;
        this.input = new Input(lukija);
    }

    @Override
    public void paivita() {
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println(menu);

            String valinta = input.vastaus(">");
            if (valinta.equals("1")) {
                lisaaLentokone();
            } else if (valinta.equals("2")) {
                lisaaLento();
            } else if (valinta.equals("x")) {
                break;
            }
        }
    }

    private void lisaaLentokone() {
        String tunnus = input.vastaus("Anna lentokoneen tunnus:");
        int kapasiteetti = Integer.valueOf(input.vastaus("Anna lentokoneen kapasiteetti:"));

        lentohallinta.lisaaLentokone(tunnus, kapasiteetti);
    }

    private void lisaaLento() {
        Lentokone lentokone = kysyLentokone();
        String lahtopaikka = input.vastaus("Anna lähtöpaikan tunnus:");
        String kohdepaikka = input.vastaus("Anna kohdepaikan tunnus:");

        lentohallinta.lisaaLento(lentokone, lahtopaikka, kohdepaikka);
    }

    private Lentokone kysyLentokone() {
        Lentokone lentokone = null;
        while (lentokone == null) {
            String tunnus = input.vastaus("Anna lentokoneen tunnus:");
            lentokone = lentohallinta.haeLentokone(tunnus);

            if (lentokone == null) {
                System.out.println("Tunnuksella " + tunnus + " ei ole lentokonetta.");
            }
        }

        return lentokone;
    }
}
