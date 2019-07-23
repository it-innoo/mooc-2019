
import java.util.ArrayList;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Laatikko implements Talletettava {
    private double kapasiteetti;
    private Collection<Talletettava> tavarat;

    public Laatikko(double kapasiteetti) {
        this.kapasiteetti = kapasiteetti;
        this.tavarat = new ArrayList<>();
    }

    public void lisaa(Talletettava tavara) {
        if (kapasiteetti >= paino() + tavara.paino()) {
            this.tavarat.add(tavara);
        }
    }

    @Override
    public double paino() {
        return tavarat
                .stream()
                .map(t -> t.paino())
                .reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        return "Laatikko: " + tavarat.size() + " esinettä, paino yhteensä " + paino() + " kiloa";
    }
    
}
