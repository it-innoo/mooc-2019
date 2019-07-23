
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
public class MaksimipainollinenLaatikko extends Laatikko {

    private final int maksimipaino;
    private final Collection<Tavara> tavarat;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.tavarat = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }
    
    @Override
    public void lisaa(Tavara tavara) {
        if ((tavara.getPaino() + getPaino()) <= maksimipaino) {
            tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return tavarat.contains(tavara);
    }
    
    private int getPaino() {
        int paino =
                tavarat
                    .stream()
                    .map((tavara) -> tavara.getPaino())
                    .reduce(0, Integer::sum);

        return paino;
    }
}
