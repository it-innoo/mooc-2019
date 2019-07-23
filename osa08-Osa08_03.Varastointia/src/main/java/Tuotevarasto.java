/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Tuotevarasto extends Varasto {

    private String nimi;
    
    /**
     *
     * @param tuotenimi
     * @param tilavuus
     */
    public Tuotevarasto(String tuotenimi, double tilavuus) {
        super(tilavuus);
        this.nimi = tuotenimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return nimi +": " + super.toString();
    }
    
}
