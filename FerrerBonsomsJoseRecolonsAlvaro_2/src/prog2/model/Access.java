package prog2.model;

import java.util.ArrayList;

public abstract class Access implements InAcces{
    private String nom;
    private String accessibilitat;
    private boolean estatAcces;
    private ArrayList<Via> accesVies;

    public Access(String nom, String accessibilitat, boolean estatAcces, ArrayList<Via> accesVies) {
        this.nom = nom;
        this.accessibilitat = accessibilitat;
        this.estatAcces = estatAcces;
        this.accesVies = accesVies;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAccessibilitat() {
        return accessibilitat;
    }

    public void setAccessibilitat(String accessibilitat) {
        this.accessibilitat = accessibilitat;
    }

    public boolean isEstatAcces() {
        return estatAcces;
    }

    public void setEstatAcces(boolean estat) {
        this.estatAcces = estat;
    }


    public ArrayList<Via> getAccesVies() {
        return accesVies;
    }

    public void setAccesVies(ArrayList<Via> accesVies) {
        this.accesVies = accesVies;
    }
}
