/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;
import form.Form;
/**
 *
 * @author Abril
 */
public class Main {

    public static VehiclePlant LGPlant;
    public static VehiclePlant RBPlant;
    public static Initial initial;
    public static Form mainPage;

        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Txt.leerTxt()
        initial = new Initial(1000, 6000);
        initial.createArray("workersRR", "1", "2", "3", "1", "2", "1");
        initial.createArray("workersLG", "1", "5", "4", "3", "2", "1");
        Main.mainPage = new Form();
        mainPage.setVisible(true);
//        LGPlant = new VehiclePlant("Lamborghini", 16, 1000);
//        RBPlant = new VehiclePlant("Rolls Royce", 12, 1000);
    }
    
}