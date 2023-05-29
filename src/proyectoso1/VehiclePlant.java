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
    
    
    public VehiclePlant(String name, int maxWorkerQty, long dayDuration) {
        this.name = name;
        this.maxWorkerQty = maxWorkerQty;
        this.workers = new Worker[maxWorkerQty];
        this.dayDuration = dayDuration;
        this.wareHouse = new WareHouse(5,3,4,5,6,defineTypeCar(), 6);
        this.mutex = new Semaphore(1);
        this.director = new Director(20,this.dayDuration, this);
        this.manager = new Manager(30, this.dayDuration, this);
        initializeWorkers();
        
    }
    
    public void initializeWorkers(){
        for(int i = 0; i < this.maxWorkerQty; i++){
            Worker worker = new Worker(0.34f, 20, this.dayDuration, "chasis", this);
            worker.start();
            this.workers[i] = worker;
        }
    }
    
    public Vehicle defineTypeCar(){
        Vehicle vehicle;
        if(name.equals("Lamborghini")){
            vehicle = new Vehicle(2,5,6,1,1,3,400000,750000);
        }else{
            vehicle = new Vehicle(3,6,4,2,5,6,450000,900000);
        }
        return vehicle;
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
    
    
}
