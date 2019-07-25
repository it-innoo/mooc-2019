/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.ui;

import java.util.Scanner;
import lentokentta.logiikka.Lentohallinta;

/**
 *
 * @author jukka
 */
public class Tekstikayttoliittyma implements Kayttoliittyma {
    private final HallintaMenu hallinta;
    private final PalveluMenu palvelu;

    public Tekstikayttoliittyma(Lentohallinta lh, Scanner lukija) {
        this.hallinta = new HallintaMenu(lh, lukija);
        this.palvelu = new PalveluMenu(lh, lukija);
    }

    @Override
    public void paivita() {
        hallinta.paivita();
        System.out.println();
        palvelu.paivita();
        System.out.println();
    }
}
