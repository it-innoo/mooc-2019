/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class YhdenTavaranLaatikko extends Laatikko {
    private Tavara tavara;

    public YhdenTavaranLaatikko() {
        tavara = null;
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavara == null) {
            this.tavara = tavara;
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return tavara.equals(this.tavara);
    }
    
}
