package prog2.model;

public abstract class Access implements InAcces{
    private String nom;
    private String accessibilitat;
    private boolean estatAcces;
    private int numVies;

    public Access(String nom, String accessibilitat, boolean estatAcces, int numVies) {
        this.nom = nom;
        this.accessibilitat = accessibilitat;
        this.estatAcces = estatAcces;
        this.numVies = numVies;
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

    public int getNumVies() {
        return numVies;
    }

    public void setNumVies(int numVies) {
        this.numVies = numVies;
    }

}
