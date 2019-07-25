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
public class PalveluMenu implements Kayttoliittyma {
    private final Lentohallinta lentohallinta;
    private final Input input;
    private final String menu =
            "Valitse toiminto:\n" +
            "[1] Tulosta lentokoneet\n" +
            "[2] Tulosta lennot\n" +
            "[3] Tulosta lentokoneen tiedot\n" +
            "[x] Lopeta\n";


    public PalveluMenu(Lentohallinta lh, Scanner lukija) {
        this.lentohallinta = lh;
        this.input = new Input(lukija);
    }

    @Override
    public void paivita() {
        System.out.println("Lentopalvelu");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println(menu);

            String valinta = input.vastaus(">");
            if (valinta.equals("1")) {
                tulostaLentokoneet();
            } else if (valinta.equals("2")) {
                tulostaLennot();
            } else if (valinta.equals("3")) {
                tulostaLentokone();
            } else if (valinta.equals("x")) {
                break;
            }
        }
    }

    private void tulostaLentokoneet() {
        lentohallinta.getLentokoneet().stream().forEach(lentokone -> System.out.println(lentokone));
    }

    private void tulostaLennot() {
        lentohallinta.getLennot().stream().forEach(lento -> System.out.println(lento));
    }

    private void tulostaLentokone() {
        Lentokone lentokone = kysyLentokone();
        System.out.println(lentokone);
        System.out.println();
    }

    private Lentokone kysyLentokone() {
        Lentokone lentokone = null;
        while (lentokone == null) {
            String tunnus = input.vastaus("Mikä kone:");
            lentokone = lentohallinta.haeLentokone(tunnus);

            if (lentokone == null) {
                System.out.println("Tunnuksella " + tunnus + " ei ole lentokonetta.");
            }
        }

        return lentokone;
    }
}
