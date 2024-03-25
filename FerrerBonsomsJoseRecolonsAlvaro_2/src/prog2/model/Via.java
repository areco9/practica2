package prog2.model;

public class Via implements InVia {

    private String nom;
    private float ampladaVia;
    private int numTunels;
    private boolean estatVia;
    private boolean estatIluminacio;

    public Via(String nom, float ampladaVia, int numTunels, boolean estatVia, boolean estatIluminacio) {
        this.nom = nom;
        this.ampladaVia = ampladaVia;
        this.numTunels = numTunels;
        this.estatVia = estatVia;
        this.estatIluminacio = estatIluminacio;
    }

    @Override
    public void tancarVia(Incidencia in) {

    }

    @Override
    public void obrirVia() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getAmpladaVia() {
        return ampladaVia;
    }

    public void setAmpladaVia(float ampladaVia) {
        this.ampladaVia = ampladaVia;
    }

    public int getNumTunels() {
        return numTunels;
    }

    public void setNumTunels(int numTunels) {
        this.numTunels = numTunels;
    }

    public boolean isEstatVia() {
        return estatVia;
    }

    public void setEstatVia(boolean estatVia) {
        this.estatVia = estatVia;
    }

    public boolean isEstatIluminacio() {
        return estatIluminacio;
    }

    public void setEstatIluminacio(boolean estatIluminacio) {
        this.estatIluminacio = estatIluminacio;
    }

    public String toString() {
        return "AccessDesnivell{" +
                ", nom='" + getNom() + '\'' +
                ", ampladaVia='" + getAmpladaVia() + '\'' +
                ", estatVia=" + isEstatVia() +
                ", numTunels=" + getNumTunels() +
                ", estatIluminacio=" + isEstatIluminacio() +
                '}';
    }
}
