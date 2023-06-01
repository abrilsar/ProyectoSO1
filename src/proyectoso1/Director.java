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
    private final String name;
    private final float salary;
    private float accSalary;
    private long dayDurationInMs;
    private String modo;
    private final VehiclePlant plant;

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
    
    public void setForm(){
        if (this.plant.getName().equals("Lamborghini")){
            Global.getForm().getDirectorIsLG().setText(this.modo);
        }else{
             Global.getForm().getDirectorIsRR().setText(this.modo);
        }
    }
    
    public void payCheck(){
        this.accSalary += (this.salary * 24);
        this.plant.calculateExpenses((int) this.salary * 24);
        this.plant.calculateUtility();

    }
    
    public boolean checkCounterDays(){
        try {
            this.plant.getMutexCounter().acquire();
            if (this.plant.getCounterDaysDelivery() <= 0) {
                this.plant.getMutexCounter().release();
                return true;
            }
            this.plant.getMutexCounter().release();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void deliverCars(){
        this.modo = Values.modos[3];
        this.setForm();
        try {
            this.plant.getMutex().acquire();
            this.plant.getWareHouse().removeCars();
            this.plant.setCounterDaysDelivery(Main.initial.getDeadLine());
            this.plant.getMutex().release();
            sleep(this.dayDurationInMs);
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.plant.getMutexCounter().acquire();
            resetDays();
            this.plant.getMutexCounter().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void keepWorking(){
        Random random = new Random();
        int num = (int) this.dayDurationInMs - ((int) this.dayDurationInMs * 5 /(12*24));
        int firstTimeChange = random.nextInt(num);
        int aux = firstTimeChange + ((int) this.dayDurationInMs * 5 /(12*24));
        int secondTimeChange = (int) (this.dayDurationInMs - aux);


        try {
            this.modo = Values.modos[1];// Trabajando
            setForm();
            sleep(firstTimeChange);
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.modo = Values.modos[2];
            setForm();
            sleep(this.dayDurationInMs * 5 /(12*24));//dormir por 25 min
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.modo = Values.modos[1]; // Trabajando
            setForm();
            sleep(secondTimeChange);//dormir por 25 min
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void penaltyManager(){
        float accSalary = this.plant.getManager().getAccSalary();
        int countFaults = this.plant.getManager().getCountFaults();
        float penalty = this.plant.getManager().getPenalty();
        this.plant.getManager().setAccSalary(accSalary - Values.penaltyMoney);
        this.plant.getManager().setCountFaults(countFaults + 1);
        this.plant.getManager().setPenalty(penalty + Values.penaltyMoney);
        if (this.plant.getName().equals("Lamborghini")){
            Global.getForm().getFaultsLG().setText(String.valueOf(this.plant.getManager().getCountFaults()));
            Global.getForm().getPenaltyLG().setText(String.valueOf(this.plant.getManager().getPenalty()));
        }else{
            Global.getForm().getFaultsRR().setText(String.valueOf(this.plant.getManager().getCountFaults()));
            Global.getForm().getPenaltyRR().setText(String.valueOf(this.plant.getManager().getPenalty()));
        }
        
        this.plant.calculateExpenses(Values.penaltyMoney * -1);
        this.plant.calculateUtility();

    }

    public String getModo() {
        return modo;
    }
    
    public void resetDays(){
        this.plant.setCounterDaysDelivery(Main.initial.deadLine);
    }

    public long getDayDurationInMs() {
        return dayDurationInMs;
    }

    public void setDayDurationInMs(long dayDurationInMs) {
        this.dayDurationInMs = dayDurationInMs;
    }

    public float getAccSalary() {
        return accSalary;
    }
    
    
}
