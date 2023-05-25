/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

/**
 *
 * @author Abril
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hilo hilo1 = new Hilo("Holis 1");
        Hilo hilo2 = new Hilo("Holis 2");
        
        hilo1.start();
        hilo2.start();
    }
    
}
