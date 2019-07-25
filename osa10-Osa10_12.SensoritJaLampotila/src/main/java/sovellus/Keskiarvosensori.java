/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jukka
 */
public final class Keskiarvosensori implements Sensori {
    private final Collection<Sensori> sensorit;
    private final Collection<Integer> mittaukset;

    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
        this.paalle();
    }
    
    @Override
    public boolean onPaalla() {
        return sensorit.stream().noneMatch((sensori) -> (!sensori.onPaalla()));
    }

    @Override
    public void paalle() {
        sensorit.forEach((sensori) -> { sensori.paalle(); });
    }

    @Override
    public void poisPaalta() {
        sensorit.forEach((sensori) -> { sensori.poisPaalta();});
    }

    @Override
    public int mittaa() {
        if (sensorit.isEmpty()) {
            throw new IllegalStateException("Ei määriteltyjä sensoreita");
        }
        if (!onPaalla()) {
            throw new IllegalStateException("Sensori ei ole päällä");
        }

        int keskiarvo = (int) sensorit
                .stream()
                .mapToInt(sensori -> sensori.mittaa())
                .average()
                .getAsDouble();
        mittaukset.add(keskiarvo);

        return keskiarvo;
    }

    public void lisaaSensori(Sensori lisattava) {
        sensorit.add(lisattava);
    }

    public List<Integer> mittaukset() {
        return mittaukset.stream().collect(Collectors.toList());
    }
}
