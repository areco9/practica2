package prog2.model;

import prog2.model.AccessDesnivell;
import prog2.model.Via;

import java.util.ArrayList;

public class Escala extends AccessDesnivell {
    public Escala(float height, String nom, boolean accessibilitat) {
        super(nom, accessibilitat, height);
    }

    @Override
    public void afegirVia(Via via) {

    }

    @Override
    public void tancarAcces() {

    }

    @Override
    public void obrirAcces() {

    }

    @Override
    public boolean isAccessibilitat() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}