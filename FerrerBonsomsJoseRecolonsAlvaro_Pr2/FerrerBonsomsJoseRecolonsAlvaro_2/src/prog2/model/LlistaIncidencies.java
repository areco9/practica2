package prog2.model;

import prog2.vista.ExcepcioEstacio;

import java.util.ArrayList;
import java.util.Iterator;

public class LlistaIncidencies implements InLlistaIncidencies{

    private ArrayList<Incidencia> llistaIncidencies;

    // CONSTRUCTOR//
    public LlistaIncidencies() {
        llistaIncidencies = new ArrayList<Incidencia>();
    }


    // GETTERS & SETTERS //
    public ArrayList<Incidencia> getLlistaIncidencies() {
        return llistaIncidencies;
    }
    public void setLlistaIncidencies(ArrayList<Incidencia> llistaIncidencies) {
        this.llistaIncidencies = llistaIncidencies;
    }

    // MÉTODOS //

    // Este método crea una incidéncia con la información pasada como parámetros: (número d'identificador, tipus, la via on s'ha produït i la data)
    // y lo añade a la lista.
    // Además, se ha de comprobar que esta vía no tiene ya una incidencia y si ya tiene una, se ha de lanzar una excepción.
     // Una vez creada la incidencia se ha de cerrar la via correspondiente.
    @Override
    public void afegirIncidencia(int num, String tipus, Via via, String data) throws ExcepcioEstacio {
        if (!via.isEstatVia()) {
            throw new ExcepcioEstacio();
        }
        else {
            if(tipus.equals("Reparacio")){
                Incidencia inc = new Incidencia(num, Incidencia.TipusIncidencia.Reparacio, via, data);
            }
            else if(tipus.equals("Objecte")){
                Incidencia inc = new Incidencia(num, Incidencia.TipusIncidencia.Objecte, via, data);
            }
            else if(tipus.equals("Tancament")){
                Incidencia inc = new Incidencia(num, Incidencia.TipusIncidencia.Tancament, via, data);
            } else {
                throw new ExcepcioEstacio();
            }
        }
    }

    // Este método elimina una incidencia de la lista y actualiza el estado de la via mediante el método obrirVia de la clase Via
    @Override
    public void eliminarIncidencia(Incidencia in) throws ExcepcioEstacio {
        if(!llistaIncidencies.contains(in)){
            throw new ExcepcioEstacio();
        }
        else {
            llistaIncidencies.remove(in);
        }
    }

    // Itera sobre la lista de incidencias y devuelve un String con la información de todas las incidencias.
    // En caso que no haya ninguna incidencia lanza una excepción
    @Override
    public String llistarIncidencies() throws ExcepcioEstacio {
        String s = "";
        Iterator<Incidencia> iterator = this.llistaIncidencies.iterator();
        if (llistaIncidencies==null){
            throw new ExcepcioEstacio();
        }

        while (iterator.hasNext()) {
            Incidencia incidencia;
            incidencia = iterator.next();
            s += incidencia.toString() + "\n";
        }
        return s;
    }


    // Busca la incidencia con el número recibido por el parámetro y la devuelve
    // En caso que no exista, lanza una excepción
    @Override
    public Incidencia getIncidencia(int num) throws ExcepcioEstacio {
        for (Incidencia incidencia : llistaIncidencies) {
            if (incidencia.getNum_()==num) {
                return incidencia;
            }
        }
        throw new ExcepcioEstacio();
    }
}
