
package it.room.cc2021;

/**
 * Simulazione Campionato di calcio anno 2021
 * @author ma
 */
public class Main {
    public static StudioClassi studioclassi;
    public static StudioForm studioForm;
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Simulazione campionato di calcio 2021");
        studioclassi = new StudioClassi();
        studioclassi.init();
        studioForm = new StudioForm();
        
    }
    
    
    
}
