/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukka
 */
public class Piilo<T> {
    private T piilo;

    public Piilo() {
    }

    public boolean onkoPiilossa() {
        return piilo != null;
    }

    public void laitaPiiloon(T piilotettava) {
        piilo = piilotettava;
    }

    public T otaPiilosta() {
        T t = piilo;
        piilo = null;
        return t;
    }
}
