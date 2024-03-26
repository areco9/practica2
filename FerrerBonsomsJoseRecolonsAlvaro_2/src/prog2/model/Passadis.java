package prog2.model;

import java.util.ArrayList;

public class Passadis extends AccessNivell{
    public Passadis(String nom, String accessibilitat, boolean estatAcces, ArrayList<Via> accesVies, float longitud) {
        super(nom, accessibilitat, estatAcces, accesVies, longitud); // Llama al constructor de la clase padre con los parámetros requeridos
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