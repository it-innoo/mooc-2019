
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Muutoshistoria {

    private final ArrayList<Double> historia;
    
    public Muutoshistoria() {
        this.historia = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        historia.add(tilanne);
    }
    
    public void nollaa() {
        historia.clear();
    }

    public double maxArvo() {
        return historia.isEmpty() ? 0 : Collections.max(historia);
    }

    public double minArvo() {
        return historia.isEmpty() ? 0 : Collections.min(historia);
    }
    
    public double keskiarvo() {
        return historia.isEmpty()
                ? 0 :
                historia
                        .stream()
                        .mapToDouble(a -> a)
                        .average()
                        .getAsDouble();
    }
    
    @Override
    public String toString() {
        return this.historia.toString();
    }
    
}
