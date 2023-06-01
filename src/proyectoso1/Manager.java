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
    private final String name;
    private final float salary;
    private float accSalary;
    private long dayDurationInMs;
    private String modo;
    private final VehiclePlant plant;
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
    
    public void setForm(){
        if (this.plant.getName().equals("Lamborghini")){
            Global.getForm().getManagerIsLG().setText(this.modo);
        }else{
//             Global.getForm().getDirectorIsRR().setText(this.modo);
        }
    }
    
    public void payCheck(){
        this.accSalary += (this.salary * 24);
        this.plant.calculateExpenses((int) this.salary * 24);
        this.plant.calculateUtility();

    }
    
    public void firstPartDay(){
        for (int i = 0; i < 32; i++) {
            if(work){
                this.modo = Values.modos[1];
                setForm();
            }else{
                this.modo = Values.modos[0];
                setForm();
                Director director = this.plant.getDirector();
                if(director.getModo().equals(Values.modos[2])){
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
        this.modo = "Working";
        setForm();
    }
    
    public void updateCounter(){
        try {
            plant.getMutexCounter().acquire();
            decreasecount();
            plant.getMutexCounter().release();
            sleep(this.dayDurationInMs/3); //8 horas
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    
    public void decreasecount(){
        int counter = this.plant.getCounterDaysDelivery();
        this.plant.setCounterDaysDelivery(counter - 1000);
        if (this.plant.getName().equals("Lamborghini")){
            Global.getForm().getDaysLeftLG().setText(String.valueOf(this.plant.getCounterDaysDelivery()/1000));
        }else{
//             Global.getForm().getDirectorIsRR().setText(String.valueOf(this.plant.getCounterDaysDelivery()/1000));
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

    public long getDayDurationInMs() {
        return dayDurationInMs;
    }

    public void setDayDurationInMs(long dayDurationInMs) {
        this.dayDurationInMs = dayDurationInMs;
    }  
    
    
}
