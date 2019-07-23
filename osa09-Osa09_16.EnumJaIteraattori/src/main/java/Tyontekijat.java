
import java.util.ArrayList;
import java.util.Iterator;
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
public class Tyontekijat {
    private List<Henkilo> tyontekijat;

    public Tyontekijat() {
        tyontekijat = new ArrayList<>();
    }

    public void lisaa(Henkilo lisattava) {
        tyontekijat.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattavat) {
        tyontekijat.addAll(lisattavat);
    }
    
    public void tulosta() {
        Iterator<Henkilo> it = tyontekijat.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> it = tyontekijat.iterator();
        
        while (it.hasNext()) {
            Henkilo henkilo = it.next();
            if (koulutus == henkilo.getKoulutus()) {
                System.out.println(henkilo);
            }
        }
    }
    
    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> it = tyontekijat.iterator();

        while (it.hasNext()) {
            if (it.next().getKoulutus() == koulutus) {
                it.remove();
            }
        }
    }
}
