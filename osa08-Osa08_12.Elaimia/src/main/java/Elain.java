/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public abstract class Elain {
    private String nimi;

    public Elain(String nimi) {
        this.nimi = nimi;
    }
    
    public void syo() {
        System.out.println(nimi + " syo");
    }
    
    public void nuku() {
        System.out.println(nimi + " nukkuu");
    }

    public String getNimi() {
        return nimi;
    }
    
}
