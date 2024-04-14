package prog2.vista;
import prog2.model.*;

import java.util.Scanner;


public class VistaEstacioTren {
    private EstacioTren estacioTren;

    private enum OpcionesMenuEstacion {OPCION1, OPCION2, OPCION3, OPCION4, OPCION5, OPCION6, OPCION7, OPCION8, OPCION9, OPCION10, OPCION11, OPCION12, SALIR};

    private String[] descMenuEstacion = {"Listar la información de las vías",
            "Listar la información de las vías abiertas",
            "Listar la información de las vías abiertas",
            "Listar la información de los accesos abiertos",
            "Listar la información de los accesos cerrados",
            "Listar la información de las incidencias actuales",
            "Añadir una incidencia",
            "Eliminar una incidencia",
            "Caluclar y mostrar el número total de accesos que proporcionan accesibilidad",
            "Caluclar y mostrar el número total de metros de longitud de accesos de nivel",
            "Guardar la estación",
            "Recuperar la estación",
            "Salir de la estación"};


    public VistaEstacioTren (String nom) {
        estacioTren = new EstacioTren(nom);
        estacioTren.inicialitzaDadesEstacioTren();
    }
    public EstacioTren getEstacioTren() {
        return estacioTren;
    }

    public void setEstacioTren(EstacioTren estacioTren) {
        this.estacioTren = estacioTren;
    }
    public void gestioEstacioTren() {
        // Creamos el objeto para el menú. Pasamos como primer parámetro el nombre del menú
        Menu<OpcionesMenuEstacion> menu = new Menu<>("Menú de la Estación " + estacioTren.getNomEstacio(), OpcionesMenuEstacion.values());

        // Asignamos la descripción de las opciones
        menu.setDescripcions(descMenuEstacion);

        // Obtenemos una opción del menú y realizamos las acciones pertinentes
        OpcionesMenuEstacion opcion = null;
        do {
            // Mostramos las opciones del menú
            menu.mostrarMenu();

            // Pedimos una opción
            Scanner sc = new Scanner(System.in);
            opcion = menu.getOpcio(sc);

            // Realizamos las acciones necesarias
            switch (opcion) {
                case OPCION1:
                    LlistaVies llistaVies1 = estacioTren.getLlistaVies();
                    try {
                        System.out.println("Las vías actuales son: \n" + llistaVies1.llistarVies(true) + llistaVies1.llistarVies(false));
                    } catch (ExcepcioEstacio e){
                        throw new RuntimeException(e);
                    }
                    break;

                case OPCION2:
                    llistaVies1 = estacioTren.getLlistaVies();
                    try {
                        System.out.println("Las vías abiertas actualmente son: \n" + llistaVies1.llistarVies(true));
                    } catch (ExcepcioEstacio e){
                        throw new RuntimeException(e);
                    }
                    break;



                case OPCION3:
                    llistaVies1 = estacioTren.getLlistaVies();
                    try {
                        System.out.println("Las vías cerradas actualmente son: \n" + llistaVies1.llistarVies(false));
                    } catch (ExcepcioEstacio e){
                        throw new RuntimeException(e);
                    }
                    break;

                case OPCION4:
                    LlistaAccessos llistaAccessos1 = estacioTren.getLlistaAccessos();
                    try{
                        System.out.println("Los accesos abiertos actualmente son: \n" + llistaAccessos1.llistarAccessos(true));
                    } catch(ExcepcioEstacio e){
                        throw new RuntimeException(e);
                    }
                    break;

                case OPCION5:
                    llistaAccessos1 = estacioTren.getLlistaAccessos();
                    try{
                        System.out.println("Los accesos abiertos actualmente son: \n" + llistaAccessos1.llistarAccessos(false));
                    } catch(ExcepcioEstacio e){
                        throw new RuntimeException(e);
                    }
                    break;

                case OPCION6:
                    LlistaIncidencies llistaIncidencies1 = estacioTren.getLlistaIncidencies();
                    try{
                        System.out.println("Las incidencias actuales son: \n" + llistaIncidencies1.llistarIncidencies());
                    } catch(ExcepcioEstacio e){
                        throw new RuntimeException(e);
                    }
                    break;

                case OPCION7:
                    System.out.print("Número de incidencia: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo de incidencia (Reparacio/Objecte/Tancament): ");
                    String tipus = sc.nextLine();
                    System.out.print("Nombre de la vía: ");
                    String nomVia = sc.nextLine();
                    System.out.print("Fecha (DD/MM/AAAA): ");
                    String data = sc.nextLine();

                    try {
                        Via via = estacioTren.getLlistaVies().getVia(nomVia);
                    }catch (ExcepcioEstacio e){
                        throw new RuntimeException("La vía que has puesto no existe");
                    }

                    try {
                        estacioTren.afegirIncidencia(num, tipus, nomVia, data);
                        System.out.println("Incidencia añadida exitosamente.");
                    } catch (ExcepcioEstacio e) {
                        System.err.println("Error: No se pudo añadir la incidencia.");
                    }
                    break;

                case OPCION8:
                    System.out.print("Número de incidencia que quieres eliminar: ");
                    num = sc.nextInt();
                    try{
                        estacioTren.eliminarIncidencia(num);
                    } catch(ExcepcioEstacio e){
                        throw new RuntimeException("Error: No se pudo añadir la incidencia.");
                    }
                    break;

                case OPCION9:
                    try {
                        System.out.println("La cantidad de accesos con accesibilidad es: " + estacioTren.getLlistaAccessos().calculaAccessosAccessibles());
                    }catch (ExcepcioEstacio e){
                        throw new RuntimeException(e);
                    }
                    break;

                case OPCION10:
                    try {
                        System.out.println("La longitud total de accesos de nivel es: " + estacioTren.getLlistaAccessos().calculaLongitudAccessosNivell());
                    }catch (ExcepcioEstacio e){
                        throw new RuntimeException(e);
                    }
                    break;

                case OPCION11:
                    estacioTren.guardarEstacio();
                    break;

                case OPCION12:
                    estacioTren.recuperarEstacio();
                    break;

                case SALIR:
                    System.out.println("¡Hasta luego!");
                    break;
            }
        } while (opcion != OpcionesMenuEstacion.SALIR);
    }
}

