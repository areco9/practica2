package prog2.model;

import prog2.model.AccessDesnivell;
import prog2.model.Via;

public class Escala extends AccessDesnivell {
    public Escala(String nom, String accessibilitat, boolean estatAcces, int numVies, float height) {
        super(nom, accessibilitat, estatAcces, numVies, height);
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