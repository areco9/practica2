package prog2.model;

import java.util.ArrayList;

public class Passadis extends AccessNivell{
    public Passadis(float longitud, String nom, boolean accessibilitat) {
        super(nom, accessibilitat, longitud); // Llama al constructor de la clase padre con los parámetros requeridos
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
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}