package prog2.model;

import java.util.ArrayList;

public abstract class AccessDesnivell extends Access {
    private float height;

    public AccessDesnivell(String nom, boolean accessibilitat, float height) {
        super(nom, accessibilitat);
        this.height = height;
    }

    public float getHeight() { return height; }

    public void setHeight(float height){ this.height = height; }

    public String toString() {
        return "AccessDesnivell{" +
                "height=" + height +
                ", nom='" + getNom() + '\'' +
                ", accessibilitat='" + isAccessibilitat() + '\'' +
                ", estat=" + isEstatAcces() +
                ", numVies=" + getAccesVies() +
                '}';
    }
}
