/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria historia;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus) {
        this(tuotenimi, tilavuus , 0);
    }

    /**
     *
     * @param tuotenimi
     * @param tilavuus
     * @param alkuSaldo
     */
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);

        this.historia = new Muutoshistoria();
        historia.lisaa(alkuSaldo);
        
    }

    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + getNimi());
        System.out.println("Historia: " + historia.toString());
        System.out.println("Suurin tuotemäärä: " + historia.maxArvo());
        System.out.println("Pienin tuotemäärä: " + historia.minArvo());
        System.out.println("Keskiarvo: " + historia.keskiarvo());
    }

    @Override
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara); //To change body of generated methods, choose Tools | Templates.
        historia.lisaa(getSaldo());
    }

    @Override
    public double otaVarastosta(double maara) {
        maara = super.otaVarastosta(maara);
        historia.lisaa(getSaldo());
        return maara;
    }
    
    public String historia() {
        return this.historia.toString();
    }
}
