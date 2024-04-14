package prog2.model;

public class Via implements InVia {

    private String nom;
    private String ampladaVia;
    private int numTunels;
    private boolean estatVia;
    private String estatIluminacio;

    public Via(String nom, String ampladaVia, int numTunels, boolean estatVia, String estatIluminacio) {
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
        via.setEstatVia(false);
        via.setEstatIluminacio(in.getIluminacioVia());
    }

    // Modifica el estado de la via a Abierta y la iluminación al 100%
    @Override
    public void obrirVia() {
        this.setEstatVia(true);
        this.setEstatIluminacio("100%");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAmpladaVia() {
        return ampladaVia;
    }

    public void setAmpladaVia(String ampladaVia) {
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

    public String getEstatIluminacio() {
        return estatIluminacio;
    }

    public void setEstatIluminacio(String estatIluminacio) {
        this.estatIluminacio = estatIluminacio;
    }

    public String toString() {
        return "Nom='" + getNom() + '\'' +
                ", ampladaVia='" + getAmpladaVia() + '\'' +
                ", estatVia=" + isEstatVia() +
                ", numTunels=" + getNumTunels() +
                ", estatIluminacio=" + getEstatIluminacio() +
                '}';
    }
}
