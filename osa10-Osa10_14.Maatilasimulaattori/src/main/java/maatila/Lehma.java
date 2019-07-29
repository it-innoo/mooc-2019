/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.Random;

/**
 *
 * @author jukka
 */
public class Lehma implements Eleleva, Lypsava {
    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    private final String nimi;
    private double saldo;
    private double tilavuus;
    
    public Lehma() {
        this(NIMIA[new Random().nextInt(NIMIA.length)]);
    }

    public Lehma(String nimi) {
        this.nimi = nimi;
        this.tilavuus = 15 + new Random().nextInt(26);
        this.saldo = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getMaara() {
        return saldo;
    }

    @Override
    public void eleleTunti() {
         saldo += 0.7 + (2 - 0.7) * new Random().nextDouble();
        if (saldo > tilavuus) {
            saldo = tilavuus;
        }
    }

    @Override
    public double lypsa() {
        double lypsetty = this.saldo;
        this.saldo = 0;
        return lypsetty;
    }

    @Override
    public String toString() {
        return nimi + " " + Math.ceil(saldo) + "/" + tilavuus;
    }
    
}
