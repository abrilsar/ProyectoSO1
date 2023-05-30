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
//    public static Form form;

        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Txt.leerTxt()
        initial = Txt.readData();
//        Main.form = Global.;
//        form.setVisible(true);
        Global.startForm(); 
        LGPlant = new VehiclePlant("Lamborghini", Values.maxEmployeesLG, 1000);
        RBPlant = new VehiclePlant("Rolls Royce", Values.maxEmployeesRR, 1000);
        
    }
    
}