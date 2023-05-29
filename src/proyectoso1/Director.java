/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abril
 */
public class Director extends Thread{
    private String name;
    private float salary;
    private float accSalary;
    private long dayDurationInMs;
    private String modo;
    private VehiclePlant plant;

    public Director(float salary, long dayDurationInMs, VehiclePlant plant) {
        this.name = "Director";
        this.salary = salary;
        this.accSalary = 0;
        this.dayDurationInMs = dayDurationInMs;
        this.modo = "work";
        this.plant = plant;
    }
    
    @Override
    public void run(){
        
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (true){
            payCheck();
            boolean checkDone = checkCounterDays();
            if (checkDone){
                deliverCars();
            }else{
                keepWorking();
            }
            }
        }
    
    public void payCheck(){
        this.accSalary += (this.salary * 24); 
    }
    
    public boolean checkCounterDays(){
        try {
            this.plant.getMutex().acquire();
            if (this.plant.getWareHouse().getCounterDaysDelivery() <= 0) {
                this.plant.getMutex().release();
                return true;
            }
            this.plant.getMutex().release();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void deliverCars(){
        this.modo = "Entregando Carros";
        try {
            this.plant.getMutex().acquire();
            this.plant.getWareHouse().updateCounterDays(this.name);
            this.plant.getMutex().release();
            sleep(this.dayDurationInMs);
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void keepWorking(){
        Random random = new Random();
        int firstTimeChange = (int) random.nextInt((this.dayDurationInMs - (this.dayDurationInMs * 5 /(12*24))));
        int secondTimeChange = (int) (this.dayDurationInMs - (firstTimeChange + (this.dayDurationInMs * 5 /12)));
        try {
            this.modo = "Working";
            sleep(firstTimeChange);
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.modo = "Watching Manager";
            sleep(this.dayDurationInMs * 5 /(12*24));//dormir por 25 min
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.modo = "Working";
            sleep(secondTimeChange);//dormir por 25 min
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void penaltyManager(){
        float accSalary = this.plant.getManager().getAccSalary();
        int countFaults = this.plant.getManager().getCountFaults();
        float penalty = this.plant.getManager().getPenalty();
        this.plant.getManager().setAccSalary(accSalary - 50);
        this.plant.getManager().setCountFaults(countFaults + 1);
        this.plant.getManager().setPenalty(penalty + 50);
    }

    public String getModo() {
        return modo;
    }
    
    
}
