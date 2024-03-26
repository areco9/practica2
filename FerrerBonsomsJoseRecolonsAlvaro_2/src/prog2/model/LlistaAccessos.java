package prog2.model;

import prog2.vista.ExcepcioEstacio;

import java.util.ArrayList;

public class LlistaAccessos implements InLlistaAccessos {

    private ArrayList<Access> llistaAccessos;

    // CONSTRUCTOR //
    public LlistaAccessos(ArrayList<Access> llistaAccessos) {
        this.llistaAccessos = llistaAccessos;
    }

    // GETTERS & SETTERS //
    public ArrayList<Access> getLlistaAccessos() {
        return llistaAccessos;
    }
    public void setLlistaAccessos(ArrayList<Access> llistaAccessos) {
        this.llistaAccessos = llistaAccessos;
    }

    // MÉTODOS //

    // Añade un nuevo acceso a la lista de accesos. En caso que ya esté, lanza una excepción
    @Override
    public void afegirAcces(Access acc) throws ExcepcioEstacio {
        if(!llistaAccessos.contains((acc))){
            llistaAccessos.add(acc);
        }
        throw new ExcepcioEstacio();
    }

    // Vacia la lista de accesos
    @Override
    public void buidar() {
        llistaAccessos.clear();
    }

    // Devuelve un string que contiene toda la información de los accesos que tienen el mismo estado que el dado
    @Override
    public String llistarAccessos(boolean estat) throws ExcepcioEstacio {
        return null;
    }

    // Recorre toda la lista de accesos y los cierra. Solo decidirá abrir cda uno de ellos si permite el acceso a alguna vía abierta
    @Override
    public void actualitzaEstatAccessos() throws ExcepcioEstacio {
        for (Access access : llistaAccessos){
            for( Via via : access.getAccesVies()){
                access.setEstatAcces(via.isEstatVia());
            }
        }
    }



    // Itera sobre la lista de accesos y devuelve el número de accesos con accesibilidad
    @Override
    public int calculaAccessosAccessibles() throws ExcepcioEstacio {
        int contador = 0;
        for (Access access : llistaAccessos){
            if (access.isAccessibilitat()){
                contador++;
            }
        }
        if (contador==0) throw new ExcepcioEstacio();

        return contador;
    }

    // Itera sobre la lista de accesos, y por los accesos a nivell suma la longitud y la devuelve
    @Override
    public float calculaLongitudAccessosNivell() throws ExcepcioEstacio {
        float longitudTotal=0;
        for(Access access : llistaAccessos){
            if(access instanceof AccessNivell){
                longitudTotal += ((AccessNivell) access).getLongitud();
            }
        }
        if (longitudTotal==0) throw new ExcepcioEstacio();

        return longitudTotal;
    }
}
