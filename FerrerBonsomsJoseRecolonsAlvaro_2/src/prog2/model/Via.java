package prog2.model;

public class Via implements InVia {

    private String nom;
    private float ampladaVia;
    private int numTunels;
    private String estatVia;
    private String estatIluminacio;

    public Via(String nom, float ampladaVia, int numTunels, String estatVia, String estatIluminacio) {
        this.nom = nom;
        this.ampladaVia = ampladaVia;
        this.numTunels = numTunels;
        this.estatVia = estatVia;
        this.estatIluminacio = estatIluminacio;
    }

    // Modifica el estado de la via a Cerrada y la iluminación dependiendo de la incidencia recibida como parámetro
    @Override
    public void tancarVia(Incidencia in) {
        Via via = in.getVia_();
        via.setEstatVia("Tancada");
        via.setEstatIluminacio(in.getIluminacioVia());
    }

    // Modifica el estado de la via a Abierta y la iluminación al 100%
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

    public String getEstatVia() {
        return estatVia;
    }

    public void setEstatVia(String estatVia) {
        this.estatVia = estatVia;
    }

    public String getEstatIluminacio() {
        return estatIluminacio;
    }

    public void setEstatIluminacio(String estatIluminacio) {
        this.estatIluminacio = estatIluminacio;
    }

    public String toString() {
        return "AccessDesnivell{" +
                ", nom='" + getNom() + '\'' +
                ", ampladaVia='" + getAmpladaVia() + '\'' +
                ", estatVia=" + getEstatVia() +
                ", numTunels=" + getNumTunels() +
                ", estatIluminacio=" + getEstatIluminacio() +
                '}';
    }
}
