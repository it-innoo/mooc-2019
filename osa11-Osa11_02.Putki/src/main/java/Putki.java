
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
 * @param <T>
 */
public class Putki<T> {
    private final List<T> putki;

    public Putki() {
        putki = new ArrayList<>();
    }

    public void lisaaPutkeen(T arvo) {
        putki.add(arvo);
    }

    public T otaPutkesta() {
        return putki.isEmpty() ? null : putki.remove(0);
    }

    public boolean onkoPutkessa() {
        return !putki.isEmpty();
    }
}
