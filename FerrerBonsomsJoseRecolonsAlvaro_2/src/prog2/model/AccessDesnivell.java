package prog2.model;

public abstract class AccessDesnivell extends Access {
    private float height;

    public AccessDesnivell(String nom, String accessibilitat, boolean estatAcces, int numVies, float height) {
        super(nom, accessibilitat, estatAcces, numVies);
        this.height = height;
    }

    public float getHeight() { return height; }

    public void setHeight(float height){ this.height = height; }

    public String toString() {
        return "AccessDesnivell{" +
                "height=" + height +
                ", nom='" + getNom() + '\'' +
                ", accessibilitat='" + getAccessibilitat() + '\'' +
                ", estat=" + isEstatAcces() +
                ", numVies=" + getNumVies() +
                '}';
    }
}
