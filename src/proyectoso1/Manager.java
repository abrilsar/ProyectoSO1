/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abril
 */
public class Manager extends Thread{
    private String name;
    private float salary;
    private float accSalary;
    private long dayDurationInMs;
    private String modo;
    private VehiclePlant plant;
    private float penalty;
    private int countFaults;
    private boolean work;

    public Manager(float salary, long dayDurationInMs, VehiclePlant plant) {
        this.name = "Manager";
        this.salary = salary;
        this.accSalary = 0;
        this.dayDurationInMs = dayDurationInMs;
        this.work = true;
        this.plant = plant;
        this.penalty = 0;
        this.countFaults = 0;
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
            firstPartDay();
            updateCounter();
        }
    }
    
    public void payCheck(){
        this.accSalary += (this.salary * 24);   
    }
    
    public void firstPartDay(){
        for (int i = 0; i < 32; i++) {
            if(work){
                this.modo = "Working";
            }else{
                this.modo = "Watching Race";
                Director director = this.plant.getDirector();
                if(director.getModo().equals("Watching Manager")){
                    director.penaltyManager();
                }
            }
            try {
                sleep(this.dayDurationInMs/48);// 30 min
            } catch (InterruptedException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            work = !work;
        }
 
        
        
    }
    
    public void updateCounter(){
        try {
            plant.getMutex().acquire();
            plant.getWareHouse().updateCounterDays(this.name);
            plant.mutex.release();
            sleep(this.dayDurationInMs/3); //8 horas
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    public float getAccSalary() {
        return accSalary;
    }

    public float getPenalty() {
        return penalty;
    }

    public int getCountFaults() {
        return countFaults;
    }

    public void setAccSalary(float accSalary) {
        this.accSalary = accSalary;
    }

    public void setPenalty(float penalty) {
        this.penalty = penalty;
    }

    public void setCountFaults(int countFaults) {
        this.countFaults = countFaults;
    }
    
    
}