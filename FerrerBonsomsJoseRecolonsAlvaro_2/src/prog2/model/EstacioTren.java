//package prog2.model;
//
//public class EstacioTren {
//    private String nom;
//
//    public void inicialitzaDadesEstacioTren() {
//
//        llistaAccessos.buidar();
//
//        float desnivell = 9;
//
//        float pes = 200;
//        Access Acc1 = new Ascensor(pes, desnivell, "A1", true);
//        llistaAccessos.afegirAcces(Acc1);
//
//
//        String marca = "Schindler";
//
//        Access Acc2 = new EscalaMecanica(marca, desnivell, "A2", true);
//
//        llistaAccessos.afegirAcces(Acc2);
//
//        float longitud = 30;
//        Access Acc3 = new Passadis(longitud, "A3", true);
//        llistaAccessos.afegirAcces(Acc3);
//
//
//        float vel = 0.3f;
//        Access Acc4 = new CintaTransportadora(vel, longitud, "A4", true);
//        llistaAccessos.afegirAcces(Acc4);
//
//        desnivell = 7;
//        pes = 300;
//        Access Acc5 = new Ascensor(pes, desnivell, "A5", true);
//        llistaAccessos.afegirAcces(Acc5);
//
//        Access Acc6 = new Escala(desnivell, "A6", true);
//        llistaAccessos.afegirAcces(Acc6);
//
//        desnivell = 8.5f;
//        pes = 250;
//        Access Acc7 = new Ascensor(pes, desnivell, "A7", true);
//        llistaAccessos.afegirAcces(Acc7);
//
//        Access Acc8 = new Escala(desnivell, "A8", true);
//        llistaAccessos.afegirAcces(Acc8);
//
//        longitud = 25;
//        Access Acc9 = new Passadis(longitud, "A9", true);
//        llistaAccessos.afegirAcces(Acc9);
//
//        vel = 0.4f;
//        Access Acc10 = new CintaTransportadora(vel, longitud, "A10", true);
//        llistaAccessos.afegirAcces(Acc10);
//
//        desnivell = 8;
//        marca = "Otis";
//        Access Acc11 = new EscalaMecanica(marca, desnivell, "A11", true);
//        llistaAccessos.afegirAcces(Acc11);
//
//        longitud = 20;
//        Access Acc12 = new Passadis(longitud, "A12", true);
//        llistaAccessos.afegirAcces(Acc12);
//
//        desnivell = 20;
//        Access Acc13 = new Escala(desnivell, "A13", true);
//        llistaAccessos.afegirAcces(Acc13);
//
//        pes = 350;
//        Access Acc14 = new Ascensor(pes, desnivell, "A14", true);
//        llistaAccessos.afegirAcces(Acc14);
//
//        /* Pistes */
//        llistaVies.buidar();
//        Via V1  = new Via("V1",  "Iberica", 2, true, "100%"); llistaVies.afegirVia(V1);
//        Via V2  = new Via("V2",  "Iberica", 2, true, "100%"); llistaVies.afegirVia(V2);
//        Via V3  = new Via("V3",  "Internacional", 2, true, "100%");  llistaVies.afegirVia(V3);
//        Via V4  = new Via("V4", "Iberica", 1, true, "100%"); llistaVies.afegirVia(V4);
//        Via V5  = new Via("V5", "Iberica", 1, true, "100%");  llistaVies.afegirVia(V5);
//        Via V6  = new Via("V6",  "Estreta", 1, true, "100%");  llistaVies.afegirVia(V6);
//        Via V7  = new Via("V7",  "Estreta", 1, true, "100%");  llistaVies.afegirVia(V7);
//
//        /* Accés */
//        Acc1.afegirVia(V1);
//        Acc2.afegirVia(V1);
//        Acc3.afegirVia(V2);
//        Acc4.afegirVia(V2);
//        Acc5.afegirVia(V3);
//        Acc6.afegirVia(V3);
//        Acc7.afegirVia(V4); Acc7.afegirVia(V6);
//        Acc8.afegirVia(V4); Acc8.afegirVia(V6);
//        Acc9.afegirVia(V5); Acc9.afegirVia(V7);
//        Acc10.afegirVia(V5); Acc10.afegirVia(V7);
//        Acc11.afegirVia(V6);
//        Acc12.afegirVia(V6);
//        Acc13.afegirVia(V7);
//        Acc14.afegirVia(V7);
//
//    }
//    public void afegirIncidencia(int num, String tipus, String nomVia, String data)
//            throws ExcepcioEstacio;
//
//    public void eliminarIncidencia(int num) throws ExcepcioEstacio;
//
//}
