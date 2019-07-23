/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Ostos {
    private final String tuote;
    private int kpl;
    private final int yksikkohinta;

    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote = tuote;
        this.kpl = kpl;
        this.yksikkohinta = yksikkohinta;
    }
    
    public int hinta() {
        return kpl * yksikkohinta;
    }
    
    public void kasvataMaaraa() {
        kpl += 1;
    }

    @Override
    public String toString() {
        return tuote + ": " + kpl;
    }
    
}
