/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.ui;

import java.util.Scanner;

/**
 *
 * @author jukka
 */
public class Input {
    private final Scanner lukija;

    public Input(Scanner lukija) {
        this.lukija = lukija;
    }

    public String vastaus(String label) {
        System.out.print(label + " ");
        return lukija.nextLine();
    }
}
