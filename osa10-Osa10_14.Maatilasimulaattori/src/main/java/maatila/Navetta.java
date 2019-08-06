/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.List;

/**
 *
 * @author jukka
 */
public class Navetta {
    private final Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;

    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }

    public Maitosailio getMaitosailio() {
        return maitosailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobotti = lypsyrobotti;
        lypsyrobotti.setMaitosailio(maitosailio);
    }

    public void hoida(Lehma lehma) {
        try {
            lypsyrobotti.lypsa(lehma);
        } catch (Exception e) {
            throw new IllegalStateException("Lypsyrottia ei ole asennrttu");
        }
    }

    public void hoida(List<Lehma> lehmat) {
        lehmat.forEach(l -> lypsyrobotti.lypsa(l));
    }

    @Override
    public String toString() {
        return maitosailio.toString();
    }
    
}
