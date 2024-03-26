package prog2.model;

import java.util.ArrayList;

public abstract class AccessNivell extends Access {
    private float longitud;

    public AccessNivell(String nom, String accessibilitat, boolean estatAcces, ArrayList<Via> accesVies, float height) {
        super(nom, accessibilitat, estatAcces, accesVies);
        this.longitud = longitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "AccessNivell{" +
                "longitud=" + longitud +
                ", nom='" + getNom() + '\'' +
                ", accessibilitat='" + isAccessibilitat() + '\'' +
                ", estat=" + isEstatAcces() +
                ", numVies=" + getAccesVies() +
                '}';
    }
}