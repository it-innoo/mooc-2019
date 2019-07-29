/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author jukka
 */
public class Maitosailio {
    private double tilavuus;
    private double saldo;

    public Maitosailio() {
        tilavuus = 2000;
    }

    public Maitosailio(double tilavuus) {
        this();
        this.tilavuus = tilavuus;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getSaldo() {
        return saldo;
    }

    public double paljonkoTilaaJaljella() {
        return tilavuus - saldo;
    }

    public void lisaaSailioon(double maara) {
        saldo += maara;
        if (saldo > tilavuus) {
            saldo = tilavuus;
        }
    }

    public double otaSailiosta(double maara) {
        if (saldo >= maara) {
            saldo -= maara;
            return maara;
        } else {
            double left = saldo;
            saldo = 0;
            return left;
        } 
    }

    @Override
    public String toString() {
        return Math.ceil(saldo) + "/" + Math.ceil(tilavuus);
    }
    
}
