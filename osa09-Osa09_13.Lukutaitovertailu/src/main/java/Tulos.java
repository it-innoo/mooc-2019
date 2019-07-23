/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Tulos {
    private String sukupuoli;
    private String maa;
    private int vuosi;
    private double lukutaitoprosentti;

    public Tulos(String maa, String sukupuoli, int vuosi, double lukutaitoprosentti) {
        this.maa = maa;
        this.sukupuoli = sukupuoli;
        this.vuosi = vuosi;
        this.lukutaitoprosentti = lukutaitoprosentti;
    }

    public double getLukutaitoprosentti() {
        return lukutaitoprosentti;
    }

    @Override
    public String toString() {
        return this.maa + " (" + this.vuosi + "), " + this.sukupuoli + ", " + this.lukutaitoprosentti;
    }
}
