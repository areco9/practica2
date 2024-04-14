package prog2.model;

import java.util.ArrayList;

public class Ascensor extends AccessDesnivell {

    private float carrega;

    public Ascensor(float height, float carrega, String nom, boolean accessibilitat) {
        super(nom, accessibilitat, height);
        this.carrega = carrega;
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

    public float getCarrega() {
        return carrega;
    }

    public void setCarrega(float carrega) {
        this.carrega = carrega;
    }

    @Override
    public String toString() {
        return "Ascensor{" +
                "carrega=" + carrega +
                ", height=" + getHeight() +
                ", nom='" + getNom() + '\'' +
                ", accessibilitat='" + isAccessibilitat() + '\'' +
                ", estat=" + isEstatAcces() +
                ", numVies=" + getAccesVies() +
                '}';
    }
}
