/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paola
 */
public class Worker extends Thread{

    private final float productionPerDay;
    private final float salary;
    private float accSalary;
    private final long dayDurationInMs;
    private final String type;
    private float productionCounter;
    private final VehiclePlant plant;
  
    
    
    public Worker(float productionPerDay, float salary, long dayDurationInMs, String type, VehiclePlant plant) {
        this.productionPerDay = productionPerDay;
        this.salary = salary;
        this.dayDurationInMs = dayDurationInMs;
        this.type = type;
        this.plant = plant;
        this.accSalary = 0;
        this.productionCounter = 0;
        
    }
    
    
    
    @Override
    public void run(){
        
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (true){
            try {
                payCheck();
                produceForTheDay();
                sleep(this.dayDurationInMs);
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    
    public void payCheck(){
        this.accSalary += (this.salary * 24);
        this.plant.calculateExpenses((int) this.salary * 24);
        this.plant.calculateUtility();

    }
    
    public void produceForTheDay(){
        this.productionCounter += this.productionPerDay;
        if (this.productionCounter >= 1){
            try {
                plant.mutex.acquire();
                plant.wareHouse.updateStorage(this.type, (int) this.productionCounter);
                plant.mutex.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.productionCounter = 0;
        }
    }

    public float getAccSalary() {
        return accSalary;
    }
    
    
}
    

