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

    public static VehiclePlant LGPlant;
    public static VehiclePlant RBPlant;
    public static Initial initial;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        initial = Txt.readData();
//        initial = new Initial(1, 5);
//        initial.createArray("workersRR", "1", "2", "3", "1", "2", "1");
//        initial.createArray("workersLG", "1", "5", "4", "3", "2", "1");
        Global.startForm(); 
        LGPlant = new VehiclePlant("Lamborghini", Values.maxEmployeesLG, initial.dayDuration);
//        RBPlant = new VehiclePlant("Rolls Royce", Values.maxEmployeesRR, initial.dayDuration);
//        Global.getForm().getVeLG().setText("a");
    }
    
}