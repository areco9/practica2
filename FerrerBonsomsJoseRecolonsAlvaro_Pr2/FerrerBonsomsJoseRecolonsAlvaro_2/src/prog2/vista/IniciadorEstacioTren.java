package prog2.vista;

import prog2.model.*;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author lauraigual
 */
public class IniciadorEstacioTren {
    
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // Definim el nom de l'estació de tren
        String nomEstacio = "Green";

        // Creem un objecte de la vista i li passem el nom de l'estació
        VistaEstacioTren vistaEstacioTren = new VistaEstacioTren(nomEstacio);

        // Inicialitzem l'execució de la vista
        vistaEstacioTren.gestioEstacioTren();
    }
}
