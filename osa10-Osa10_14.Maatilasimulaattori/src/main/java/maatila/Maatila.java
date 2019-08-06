/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jukka
 */
public class Maatila implements Eleleva {
    private final String omistaja;
    private final Navetta navetta;
    private final List<Lehma> lehmat;

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
    }

    public String getOmistaja() {
        return omistaja;
    }

    @Override
    public void eleleTunti() {
        lehmat.forEach(lehma -> lehma.eleleTunti());
    }

    public void lisaaLehma(Lehma lehma) {
        lehmat.add(lehma);
    }

    public void hoidaLehmat() {
        navetta.hoida(lehmat);
    }

    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        navetta.asennaLypsyrobotti(lypsyrobotti);
    }

    @Override
    public String toString() {
        String lauma = "";
        if (lehmat.isEmpty()) {
            lauma = "Ei lehmiä";
        } else {
            lauma = "Lehmät:\n";
            lauma = lehmat.stream().map((l) -> "    " + l +"\n").reduce(lauma, String::concat);
        }
        return "Maatilan omistaja: " + omistaja
                + "\nNavetan maitosäiliö: " + navetta
                + "\n" + lauma;
    }
    
}
