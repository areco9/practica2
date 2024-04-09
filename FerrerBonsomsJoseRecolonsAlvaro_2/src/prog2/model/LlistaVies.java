package prog2.model;

import prog2.vista.ExcepcioEstacio;

import java.util.ArrayList;
import java.util.Iterator;

public class LlistaVies implements InLlistaVies {
    private ArrayList<Via> llistaVies;

    // CONSTRUCTOR //
    public LlistaVies(ArrayList<Via> llistaVies) {
        this.llistaVies = llistaVies;
    }

    // GETTERS & SETTERS //
    public ArrayList<Via> getLlistaVies() {
        return llistaVies;
    }
    public void setLlistaVies(ArrayList<Via> llistaVies) {
        this.llistaVies = llistaVies;
    }


    // MÉTODOS //

    // Mira si la via que se quiere añadir está ya en la lista de Vias, si no lo está, la añade
    @Override
    public void afegirVia(Via via) throws ExcepcioEstacio {
        if (!llistaVies.contains(via)) {
            llistaVies.add(via);
        }
    }

    // Vacia la lista de Vias
    @Override
    public void buidar() {
        llistaVies.clear();
    }

    // Devuelve un string que contiene toda la información de las vías que tienen el mismo estado que el dado.
    @Override
    public String llistarVies(String estat) throws ExcepcioEstacio {
        String s = null;
        Iterator<Via> iterator = this.llistaVies.iterator();
        if (estat.equals("Totes")) {
            while (iterator.hasNext()) {
                Via via;
                via = iterator.next();
                s += via.toString() + '\n';
            }
        }
        else {
            while (iterator.hasNext()) {
                Via via;
                via = iterator.next();
                if (via.getEstatVia().equals(estat)) {
                    s += via.toString() + '\n';
                }
            }
        }
        return s;
    }

    // Mira si la lista de vias contiene alguna via abierta
    @Override
    public boolean containsViesObertes() {
        for(Via via : llistaVies){
            if(via.getEstatVia().equals("Tancada")){
                return true;
            }
        }
        return false;
    }

    // Mira si la lista de vias contiene la via recibida por parámetro y devuelve un booleano con la información
    @Override
    public boolean contains(Via via) {
        return llistaVies.contains(via);
    }

    // Busca la via con el nombre recibido por parámetro y la devuelve. En caso que no exista, lanza una excepción
    @Override
    public Via getVia(String nom) throws ExcepcioEstacio {
        for (Via via : llistaVies) {
            if (via.getNom().equals(nom)) {
                return via;
            }
        }
        throw new ExcepcioEstacio();
    }
}
