package prog2.model;

import java.util.ArrayList;

public abstract class Access implements InAcces{
    private String nom;
    private boolean accessibilitat;
    private boolean estatAcces;
    private ArrayList<Via> accesVies;

    public Access(String nom, boolean accessibilitat) {
        this.nom = nom;
        this.accessibilitat = accessibilitat;
        accesVies = new ArrayList<Via>();
        estatAcces = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract boolean isAccessibilitat();

    public void setAccessibilitat(boolean accessibilitat) {
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

    // Añade una via recibida como parámetro a la lista de vías del acceso
    public void afegirVia(Via via){
        accesVies.add(via);
    }

    // Cambia el estado de un acceso a cerrado
    public void tancarAcces(){
        this.setEstatAcces(false);
    }

    // Cambia el estado de un acceso a abierto
    public void obrirAcces(){
        this.setEstatAcces(true);
    }

    public String toString() {
        return "Nom=" + getNom() + '\'' +
                ", estatAcces=" + isEstatAcces() + '\'' +
                ", accesibilidad=" + isAccessibilitat() + '\'' +
                ", acceso a vías=" + getAccesVies() + '\'' +
                '}';
    }

}
