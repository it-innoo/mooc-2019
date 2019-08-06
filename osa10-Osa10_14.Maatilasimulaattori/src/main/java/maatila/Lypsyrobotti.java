/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author jukka
 */
public class Lypsyrobotti {
    private Maitosailio maitosailio;

    public Lypsyrobotti() {
    }

    public Maitosailio getMaitosailio() {
        return maitosailio;
    }

    public void setMaitosailio(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }

    public void lypsa(Lypsava lypsava) {
        if (maitosailio == null) {
            System.out.println("Maidot menevät hukkaan");
            return;
        }
        maitosailio.lisaaSailioon(lypsava.lypsa());
    }
}
