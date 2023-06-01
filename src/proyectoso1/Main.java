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
    public static VehiclePlant RRPlant;
    public static Initial initial;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        initial = Txt.readData();
        Global.startForm(); 
        LGPlant = new VehiclePlant("Lamborghini", Values.maxEmployeesLG, initial.dayDuration);
        RRPlant = new VehiclePlant("Rolls Royce", Values.maxEmployeesRR, initial.dayDuration);
    }
    
}