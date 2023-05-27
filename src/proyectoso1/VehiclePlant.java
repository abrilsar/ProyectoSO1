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

    public VehiclePlant(String name, int maxWorkerQty, long dayDuration) {
        this.name = name;
        this.maxWorkerQty = maxWorkerQty;
        this.workers = new Worker[maxWorkerQty];
        this.dayDuration = dayDuration;
        this.wareHouse = new WareHouse(5,3,4,5,6);
        this.mutex = new Semaphore(1);
        
        initializeWorkers();
    }
    
    private void initializeWorkers(){
        for(int i = 0; i < this.maxWorkerQty; i++){
            Worker worker = new Worker("hola");
            worker.start();
            workers[i] = worker;
        }
    }
    
    
}
