
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {

    @Override
    public int compare(Kortti t, Kortti t1) {
        if (t.getMaa() == t1.getMaa()) {
            return t.getArvo() - t1.getArvo();
        }
        return t.getMaa().compareTo(t1.getMaa());
    }
    
}
