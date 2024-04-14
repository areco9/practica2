package prog2.model;

import prog2.vista.*;
import prog2.model.*;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EstacioTren{
    private String nomEstacio;
    private LlistaAccessos llistaAccessos_;
    private LlistaVies llistaVies_;
    private LlistaIncidencies llistaIncidencies_;

    public EstacioTren(String nom){
        llistaAccessos_ = new LlistaAccessos();
        llistaVies_ = new LlistaVies();
        llistaIncidencies_ =new LlistaIncidencies();
        this.nomEstacio = nom;
    }

    // Recuperar la vía con el nombre dado, invocar el método afegirIncidencia del objeto de tipo LlistaIncidencies y
    // por último actualiza el estado de todos los accessos mediante el método actualitzaEstacioAccessos de la clase
    // LlistaAccessos
    public void afegirIncidencia(int num, String tipus, String nomVia, String data) throws ExcepcioEstacio{
        Via via = llistaVies_.getVia(nomVia);
        if(via!=null){
            llistaIncidencies_.afegirIncidencia(num, tipus, via, data);
            llistaAccessos_.actualitzaEstatAccessos();
        }
        else{
            throw new ExcepcioEstacio();
        }
    }
    // Recuperar la incidencia con el número dado, invoca el método para eliminarInciidencia del objecto de tipo
    // LlistaIncidencies y actualiza el estado de todos los accesos mediante el método actualitzaEstatAccess de la clase
    // LlistaAccessos
    public void eliminarIncidencia(int num) throws ExcepcioEstacio {
        Incidencia incidencia = llistaIncidencies_.getIncidencia(num);
        if(incidencia!=null){
            llistaIncidencies_.eliminarIncidencia(incidencia);
            llistaAccessos_.actualitzaEstatAccessos();
        }
        else{
            throw new ExcepcioEstacio();
        }
    }




    // GETTERS & SETTERS //
    public LlistaIncidencies getLlistaIncidencies() {
        return llistaIncidencies_;
    }

    public void setLlistaIncidencies(LlistaIncidencies llistaIncidencies) {
        this.llistaIncidencies_ = llistaIncidencies;
    }

    public LlistaVies getLlistaVies() {
        return llistaVies_;
    }

    public void setLlistaVies(LlistaVies llistaVies) {
        this.llistaVies_ = llistaVies;
    }

    public LlistaAccessos getLlistaAccessos() {
        return llistaAccessos_;
    }

    public void setLlistaAccessos(LlistaAccessos llistaAccessos) {
        this.llistaAccessos_ = llistaAccessos;
    }

    public void inicialitzaDadesEstacioTren() {

        llistaAccessos_.buidar();

        float desnivell = 9;

        float pes = 200;

        Access Acc1 = new Ascensor(500, 30, "A1", true);
        try {
            llistaAccessos_.afegirAcces(Acc1);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }


        String marca = "Schindler";
        Access Acc2 = new EscalaMecanica("Apple", 15, "A2", true);
        try {
            llistaAccessos_.afegirAcces(Acc2);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        float longitud = 30;
        Access Acc3 = new Passadis(75, "A3", true);
        try {
            llistaAccessos_.afegirAcces(Acc3);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        float vel = 0.3f;
        Access Acc4 = new CintaTransportadora(5, 45, "A4", true);
        try {
            llistaAccessos_.afegirAcces(Acc4);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        desnivell = 7;
        pes = 300;
        Access Acc5 = new Ascensor(500, 20, "A5", true);
        try {
            llistaAccessos_.afegirAcces(Acc5);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        Access Acc6 = new Escala(25, "A6", true);
        try {
            llistaAccessos_.afegirAcces(Acc6);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        desnivell = 8.5f;
        pes = 250;
        Access Acc7 = new Ascensor(300, 10, "A7", true);
        try {
            llistaAccessos_.afegirAcces(Acc7);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        Access Acc8 = new Escala(12, "A8", true);
        try {
            llistaAccessos_.afegirAcces(Acc8);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        longitud = 25;
        Access Acc9 = new Passadis(60, "A9", true);
        try {
            llistaAccessos_.afegirAcces(Acc9);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        vel = 0.4f;
        Access Acc10 = new CintaTransportadora(6, 75, "A10", true);
        try {
            llistaAccessos_.afegirAcces(Acc10);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        desnivell = 8;
        marca = "Otis";
        Access Acc11 = new EscalaMecanica("Samsung", 30, "A11", true);
        try {
            llistaAccessos_.afegirAcces(Acc11);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }


        longitud = 20;
        Access Acc12 = new Passadis(70, "A12", true);
        try {
            llistaAccessos_.afegirAcces(Acc12);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }


        desnivell = 20;
        Access Acc13 = new Escala(19, "A13", true);
        try {
            llistaAccessos_.afegirAcces(Acc13);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }


        pes = 350;
        Access Acc14 = new Ascensor(350, 21, "A14", true);
        try {
            llistaAccessos_.afegirAcces(Acc14);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }


        /* Pistes */
        llistaVies_.buidar();

        Via V1 = new Via("V1", "Iberica", 2, true, "100%");
        try {
            llistaVies_.afegirVia(V1);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }
        Via V2 = new Via("V2", "Iberica", 2, true, "100%");
        try {
            llistaVies_.afegirVia(V2);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }
        Via V3 = new Via("V3", "Internacional", 2, true, "100%");
        try {
            llistaVies_.afegirVia(V3);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        Via V4 = new Via("V4", "Iberica", 1, true, "100%");
        try {
            llistaVies_.afegirVia(V4);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        Via V5 = new Via("V5", "Iberica", 1, true, "100%");
        try {
            llistaVies_.afegirVia(V5);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        Via V6 = new Via("V6", "Estreta", 1, true, "100%");
        try {
            llistaVies_.afegirVia(V6);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }

        Via V7 = new Via("V7", "Estreta", 1, true, "100%");
        try {
            llistaVies_.afegirVia(V7);
        } catch (ExcepcioEstacio e) {
            throw new RuntimeException(e);
        }


        /* Accés */
        Acc1.afegirVia(V1);
        Acc2.afegirVia(V1);
        Acc3.afegirVia(V2);
        Acc4.afegirVia(V2);
        Acc5.afegirVia(V3);
        Acc6.afegirVia(V3);
        Acc7.afegirVia(V4);
        Acc7.afegirVia(V6);
        Acc8.afegirVia(V4);
        Acc8.afegirVia(V6);
        Acc9.afegirVia(V5);
        Acc9.afegirVia(V7);
        Acc10.afegirVia(V5);
        Acc10.afegirVia(V7);
        Acc11.afegirVia(V6);
        Acc12.afegirVia(V6);
        Acc13.afegirVia(V7);
        Acc14.afegirVia(V7);


        try {
            afegirIncidencia(1, "Reparacio", "V4", "10/01/2010");
            afegirIncidencia(2, "Objecte", "V4", "11/03/2015");

        } catch (ExcepcioEstacio e){
            throw new RuntimeException(e);
        }
    }

    public String getNomEstacio() {
        return nomEstacio;
    }

    public void setNomEstacio(String nomEstacio) {
        this.nomEstacio = nomEstacio;
    }


    public void guardar(String camiDesti) throws IOException {
        try (FileOutputStream fout = new FileOutputStream(camiDesti);
             ObjectOutputStream oos = new ObjectOutputStream(fout)) {
            oos.writeObject(this);
        }
    }

    public static EstacioTren carregar(String camiOrigen) throws IOException, ClassNotFoundException {
        try (FileInputStream fin = new FileInputStream(camiOrigen);
             ObjectInputStream ois = new ObjectInputStream(fin)) {
            return (EstacioTren) ois.readObject();
        }
    }


    public void guardarEstacio() {
        System.out.print("Introduce la ruta del archivo donde guardar la estación: ");
        Scanner scanner = new Scanner(System.in);
        String rutaArchivo = scanner.nextLine();

        try {
            guardar(rutaArchivo);
            System.out.println("Estación guardada exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar la estación: " + e.getMessage());
        }
    }

    public void recuperarEstacio() {
        System.out.print("Introduce la ruta del archivo desde donde cargar la estación: ");
        Scanner scanner = new Scanner(System.in);
        String rutaArchivo = scanner.nextLine();

        try {
            EstacioTren estacioTren2 = new EstacioTren("Nueva Estacio");
            estacioTren2 = carregar(rutaArchivo);
            System.out.println("Estación cargada exitosamente desde " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al cargar la estación: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
