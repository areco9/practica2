package prog2.model;

import java.util.ArrayList;

public class EscalaMecanica extends AccessDesnivell {

    private String marca;
    public EscalaMecanica(String nom, String accessibilitat, boolean estatAcces, ArrayList<Via> accesVies, float height, String marca) {
        super(nom, accessibilitat, estatAcces, accesVies, height);
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "EscalaMecanica{" +
                "marca='" + marca + '\'' +
                ", height=" + getHeight() +
                ", nom='" + getNom() + '\'' +
                ", accessibilitat='" + getAccessibilitat() + '\'' +
                ", estat=" + isEstatAcces() +
                ", numVies=" + getAccesVies() +
                '}';
    }
}
