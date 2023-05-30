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
public class Vehicle {
    private int chasis;
    private int wheels;
    private int engines;
    private int bodies;
    private int accessories;
    private int numStandar;
    private int priceStandar;
    private int priceNoStandar;
    
    
    public Vehicle(int chasis, int wheels, int engines, int bodies, int accessories, int numStandar,int priceStandar, int priceNoStandar) {
        this.chasis = chasis;
        this.wheels = wheels;
        this.engines = engines;
        this.bodies = bodies;
        this.accessories = accessories;
        this.numStandar = numStandar;
        this.priceStandar = priceStandar;
        this.priceNoStandar = priceNoStandar;
        
    }    

    public int getChasis() {
        return chasis;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngines() {
        return engines;
    }

    public int getBodies() {
        return bodies;
    }

    public int getAccessories() {
        return accessories;
    }

    public int getNumStandar() {
        return numStandar;
    }

    public int getPriceStandar() {
        return priceStandar;
    }

    public int getPriceNoStandar() {
        return priceNoStandar;
    }
    
    
  
}
