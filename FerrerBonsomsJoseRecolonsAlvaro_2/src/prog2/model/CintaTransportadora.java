package prog2.model;

public class CintaTransportadora extends AccessNivell{

    private float velocitat;

    public CintaTransportadora(String nom, String accessibilitat, boolean estatAcces, int numVies, float longitud, float velocitat) {
        super(nom, accessibilitat, estatAcces, numVies, longitud);
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
                ", accessibilitat='" + getAccessibilitat() + '\'' +
                ", estat=" + isEstatAcces() +
                ", numVies=" + getNumVies() +
                "velocitat=" + velocitat +
                '}';
    }
}
