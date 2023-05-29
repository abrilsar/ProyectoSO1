/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

/**
 *
 * @author paola
 */
public class Values {
    static public int maxEmployeesRR;
    static public int maxEmployeesLG;
    static public String[] types;
    static public String[] modos;
    static public int[] vehicleRR;
    static public int[] vehicleLG;
    static public int[] salarys;
    static public int[] salePriceRR;
    static public int[] salePriceLG;
    static public int carRangeRR;
    static public int carRangeLG;  
    static public double[] productionPerDayRR;     
    static public double[] productionPerDayLG;     
    static public int penaltyMoney;    

    public Values() {
        this.maxEmployeesRR = 12;
        this.maxEmployeesLG = 16;
        this.types = new String[]{"Chasis", "Body", "Engine", "Wheels", "Accessories", "Assembler", "Director", "Manager"};
        this.modos = new String[]{"Watching Race","Working", "Watching Manager", "Delivering Cars"};
        this.vehicleLG = new int[]{2,1,6,5,1};
        this.vehicleRR = new int[]{3,2,4,6,5};
        this.salarys = new int[]{10,13,20,8,17,25,20,30};
        this.salePriceRR = new int[]{450,900};
        this.salePriceLG = new int[]{400,750};
        this.carRangeLG = 3;
        this.carRangeRR = 6;
        this.productionPerDayRR = new double[]{0.5,0.5,3,3,(1/3),0.5};
        this.productionPerDayLG = new double[]{0.25,0.25,1,5,0.5,0.5};
        this.penaltyMoney = 50;
    }
    
    
}
