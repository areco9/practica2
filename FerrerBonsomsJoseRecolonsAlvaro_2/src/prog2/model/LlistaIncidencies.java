package prog2.model;

import prog2.vista.ExcepcioEstacio;

import java.util.ArrayList;

public class LlistaIncidencies implements InLlistaIncidencies{

    private ArrayList<Incidencia> llistaIncidencies;

    // CONSTRUCTOR//
    public LlistaIncidencies(ArrayList<Incidencia> llistaIncidencies) {
        this.llistaIncidencies = llistaIncidencies;
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
        StringBuilder datosIncidencias = new StringBuilder();
        if (llistaIncidencies.isEmpty()) throw new ExcepcioEstacio();
        else {
            for (Incidencia incidencia : llistaIncidencies){
                    datosIncidencias.append(incidencia.toString());
            }
        }
        return datosIncidencias.toString();
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
