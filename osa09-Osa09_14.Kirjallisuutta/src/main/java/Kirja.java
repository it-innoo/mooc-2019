/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Kirja {
    private final String nimi;
    private final int kohdeIka;

    public Kirja(String nimi, int kohdeIka) {
        this.nimi = nimi;
        this.kohdeIka = kohdeIka;
    }

    @Override
    public String toString() {
        return nimi + " (" + kohdeIka + " vuotiaille ja vanhemmille)";
    }

    public int getKohdeIka() {
        return kohdeIka;
    }

    public String getNimi() {
        return nimi;
    }
}
