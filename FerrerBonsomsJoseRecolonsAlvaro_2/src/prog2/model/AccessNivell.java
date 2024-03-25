package prog2.model;

public abstract class AccessNivell extends Access {
    private float longitud;

    public AccessNivell(String nom, String accessibilitat, boolean estatAcces, int numVies, float height) {
        super(nom, accessibilitat, estatAcces, numVies);
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
                ", accessibilitat='" + getAccessibilitat() + '\'' +
                ", estat=" + isEstatAcces() +
                ", numVies=" + getNumVies() +
                '}';
    }
}