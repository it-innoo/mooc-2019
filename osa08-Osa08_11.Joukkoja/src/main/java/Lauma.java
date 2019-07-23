
import java.util.ArrayList;
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
public class Lauma implements Siirrettava {
    private List<Siirrettava> lauma;

    public Lauma() {
        lauma = new ArrayList<>();
    }

    public void lisaaLaumaan(Siirrettava siirrettava) {
        lauma.add(siirrettava);
    }
    
    @Override
    public void siirra(int dx, int dy) {
        lauma.forEach(e -> e.siirra(dx, dy));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n");

        this.lauma.forEach((otus) -> {
            sb.append(otus.toString()).append("\n");
        });
        
        return sb.toString();
    }
    
}
