
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Varasto {
    
    private final Map<String, Integer> hinnat;
    private final Map<String, Integer> varastosaldot;

    public Varasto() {
        hinnat = new HashMap<>();
        varastosaldot = new HashMap<>();
    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        hinnat.put(tuote, hinta);
        varastosaldot.put(tuote, saldo);
    }
    
    public int hinta(String tuote) {
        return hinnat.containsKey(tuote)
                ? hinnat.get(tuote)
                : -99;
    }
    
    public int saldo(String tuote) {
        return varastosaldot.containsKey(tuote)
                ? varastosaldot.get(tuote)
                : 0;
    }
    
    public boolean ota(String tuote) {
        if (varastosaldot.containsKey(tuote)) {
            if (varastosaldot.get(tuote) == 0) {
                varastosaldot.remove(tuote);
                return false;
            }
            varastosaldot.put(tuote, varastosaldot.get(tuote) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> tuotteet() {
        return hinnat.keySet();
    }
}
