
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Kasi implements Comparable<Kasi> {
    private final List<Kortti> kasi;

    public Kasi() {
        this.kasi = new ArrayList<>();
    }

    public void tyhjenna() {
        kasi.clear();
    }
    public void lisaa(Kortti kortti) {
        kasi.add(kortti);
    }

    public void tulosta() {
        kasi.stream().forEach(k -> System.out.println(k));
    }

    public void jarjesta() {
        Collections.sort(kasi);
    }

    public void jarjestaMaittain() {
        Comparator<Kortti> comparator = Comparator
                .comparing(Kortti::getMaa)
                .thenComparing(Kortti::getArvo);
        Collections.sort(kasi, comparator);
        // Collections.sort(kasi, new SamatMaatVierekkainArvojarjestykseen());
    }
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Kasi o) {
        return this.getArvo() - o.getArvo();
    }

    private int getArvo() {
        return kasi.stream()
                .mapToInt(k -> k.getArvo())
                .sum();
    }
}
