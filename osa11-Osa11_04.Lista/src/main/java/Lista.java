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
public class Lista<T> {
    private T[] lista;
    private int alkiot;

    public Lista() {
        this.lista = (T[]) new Object[10];
        this.alkiot = 0;
    }

    public void lisaa(T arvo) {
        kasvata();
        lista[alkiot++] = arvo;
    }

    public boolean sisaltaa(T arvo) {
        for (int i = 0; i < alkiot; i++) {
            if (lista[i].equals(arvo)) {
                return true;
            }
        }
        return false;
    }

    public int koko() {
        return this.alkiot;
    }

    private void kasvata() {
        if (alkiot < lista.length) {
            return;
        }

        int uusiKoko = lista.length + lista.length / 2;
        T[] uusiLista = (T[]) new Object[uusiKoko];
        System.arraycopy(lista, 0, uusiLista, 0, lista.length);

        lista = uusiLista;
    }
}
