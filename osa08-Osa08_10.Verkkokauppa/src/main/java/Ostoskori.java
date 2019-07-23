
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Ostoskori {
    private final Map<String, Ostos> kori;

    public Ostoskori() {
        kori = new HashMap<>();
    }
    
    public int hinta() {
        return kori
                .values()
                .stream()
                .mapToInt(o -> o.hinta())
                .reduce(0, Integer::sum);
    }
    
    public void lisaa(String tuote, int hinta) {
        if (kori.containsKey(tuote)) {
            kori.get(tuote).kasvataMaaraa();
            return;
        }
        kori.put(tuote, new Ostos(tuote, 1, hinta));
    }
    
    public void tulosta() {
        kori.forEach((t, m) -> System.out.println(t + ": " + m));
    }
}
