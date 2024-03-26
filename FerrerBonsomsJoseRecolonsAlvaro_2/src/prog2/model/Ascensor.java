package prog2.model;

import java.util.ArrayList;

public class Ascensor extends AccessDesnivell {

    private float carrega;

    public Ascensor(String nom, String accessibilitat, boolean estatAcces, ArrayList<Via> accesVies, float height, float carrega) {
        super(nom, accessibilitat, estatAcces, accesVies, height);
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
        return false;
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
                ", accessibilitat='" + getAccessibilitat() + '\'' +
                ", estat=" + isEstatAcces() +
                ", numVies=" + getAccesVies() +
                '}';
    }
}
