package prog2.model;

import java.util.ArrayList;

public class CintaTransportadora extends AccessNivell{

    private float velocitat;

    public CintaTransportadora(float velocitat, float longitud, String nom, boolean accessibilitat) {
        super(nom, accessibilitat, longitud);
        this.velocitat = velocitat;
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


    public float getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(float velocitat) {
        this.velocitat = velocitat;
    }

    @Override
    public String toString() {
        return "CintaTransportadora{" +
                "longitud=" + getLongitud() +
                ", nom='" + getNom() + '\'' +
                ", accessibilitat='" + isAccessibilitat() + '\'' +
                ", estat=" + isEstatAcces() +
                ", numVies=" + getAccesVies() +
                "velocitat=" + velocitat +
                '}';
    }
}
