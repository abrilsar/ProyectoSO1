/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Abril
 */
public class VehiclePlant {
    private String name;
    private int maxWorkerQty;
    private Worker[] workers;
    private long dayDuration;
    public WareHouse wareHouse;
    public Semaphore mutex;
    public Director director;
    public Manager manager;
    public Semaphore mutexCounter;
    public int counterDaysDelivery;
    
    public VehiclePlant(String name, int maxWorkerQty, long dayDuration) {
        this.name = name;
        this.maxWorkerQty = maxWorkerQty;
        this.workers = new Worker[maxWorkerQty];
        this.dayDuration = dayDuration;
        this.wareHouse = new WareHouse(Values.maxPerCategory, defineTypeCar(), betweenTypeCar());
        this.counterDaysDelivery = Main.initial.deadLine;
        this.mutex = new Semaphore(1);
        this.mutexCounter = new Semaphore(1);
        this.director = new Director(Values.salarys[6],this.dayDuration, this);
        this.director.start();
        this.manager = new Manager(Values.salarys[7], this.dayDuration, this);
        this.manager.start();
        initializeWorkers();
        
    }
    
    public void initializeWorkers(){
        int[] listQtyWorker = defineTypeWorker();
        double[] listProductionPerDay = defineTypeProduction();
        for(int i = 0; i < listQtyWorker.length; i++){
            for (int j = 0; j < listQtyWorker[i]; j++) {
                Worker worker = new Worker((float) listProductionPerDay[i], Values.salarys[i], this.dayDuration, Values.types[i], this);
                worker.start();
                this.workers[i] = worker;
            }
            
        }
    }
    
    public int[] defineTypeWorker(){
        int[] list;
        if(name.equals("Lamborghini")){
            list = Main.initial.workersLG;
        }else{
            list =  Main.initial.workersRR;
        }
        return list;
    }
    
    public double[] defineTypeProduction(){
        double[] list;
        if(name.equals("Lamborghini")){
            list = Values.productionPerDayLG;
        }else{
            list = Values.productionPerDayRR;
        }
        return list;
        
        
    }
    
    public int[] defineTypeCar(){
        int[] vehicle;
        if(name.equals("Lamborghini")){
            vehicle = Values.vehicleLG;
        }else{
            vehicle = Values.vehicleRR;
        }
        return vehicle;
    }
    
    public int betweenTypeCar(){
        int num;
        if(name.equals("Lamborghini")){
            num = Values.carRangeLG;
        }else{
            num = Values.carRangeRR;
        }
        return num;
    }

    public String getName() {
        return name;
    }

    public int getMaxWorkerQty() {
        return maxWorkerQty;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public long getDayDuration() {
        return dayDuration;
    }

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public Director getDirector() {
        return director;
    }

    public Manager getManager() {
        return manager;
    }

    public Semaphore getMutexCounter() {
        return mutexCounter;
    }

    public int getCounterDaysDelivery() {
        return counterDaysDelivery;
    }

    public void setCounterDaysDelivery(int counterDaysDelivery) {
        this.counterDaysDelivery = counterDaysDelivery;
    }
    
    
    
    
}
