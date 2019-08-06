/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author jukka
 */
public class MuistavaSanakirja {
    private Map<String, String> sanakirja;
    private String tiedosto;

    public MuistavaSanakirja() {
        sanakirja = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto) {
        this();
        this.tiedosto = tiedosto;
    }

    public void lisaa(String sana, String kaannos) {
        sanakirja.putIfAbsent(sana, kaannos);
    }
 
    public void poista(String sana) {
        sanakirja.keySet().removeIf(key -> key.equals(sana));
        sanakirja.values().removeIf(value -> value.equals(sana));
    }

    public String kaanna(String sana) {
        String kaannos = sanakirja.get(sana);
        if (kaannos != null) {
            return kaannos;
        }

        kaannos = sanakirja
                .entrySet()
                .stream()
                .filter(k -> sana.equals(k.getValue()))
                .map(k->k.getKey())
                .collect(Collectors.joining());
        
        return kaannos.isEmpty() ? null : kaannos;
    }

    public boolean lataa() {
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");
                lisaa(osat[0], osat[1]);
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean tallenna() {
        try (PrintWriter kirjoittaja = new PrintWriter(tiedosto)) {
            String rivit = sanakirja.entrySet().stream()
                    .map(e -> e.getKey() + ":" + e.getValue())
                    .collect((Collectors.joining("\n")));
            /*
            ArrayList<String> kaannokset = new ArrayList<>();
            sanakirja.keySet().forEach((sana) -> {
                kaannokset.add(sana + ":" + sanakirja.get(sana));
            });
*/

            kirjoittaja.println(rivit);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
