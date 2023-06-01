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
    private final String name;
    private final int maxWorkerQty;
    private final Worker[] workers;
    private long dayDuration;
    public WareHouse wareHouse;
    public Semaphore mutex;
    public Director director;
    public Manager manager;
    public Semaphore mutexCounter;
    public int counterDaysDelivery;
    public int profit;
    public int expenses;
    public int utility;
    
    public VehiclePlant(String name, int maxWorkerQty, long dayDuration) {
        this.name = name;
        this.maxWorkerQty = maxWorkerQty;
        this.workers = new Worker[maxWorkerQty];
        this.dayDuration = dayDuration;
        this.wareHouse = new WareHouse(Values.maxPerCategory, defineTypeCar(), betweenTypeCar(), name.equals("Lamborghini"), this);
        this.counterDaysDelivery = Main.initial.deadLine;
        this.mutex = new Semaphore(1);
        this.mutexCounter = new Semaphore(1);
        initializeOther();
        initializeWorkers();
        this.profit = 0;
        this.expenses = 0;
        this.utility = 0;
        
    }
    
    public void initializeWorkers(){
        int[] listQtyWorker = defineTypeWorker();
        double[] listProductionPerDay = defineTypeProduction();
        for(int i = 0; i < listQtyWorker.length; i++){
            for (int j = 0; j < listQtyWorker[i]; j++) {
                Worker worker = new Worker((float) listProductionPerDay[i], Values.salarys[i], this.dayDuration, Values.types[i], this);
                this.workers[i] = worker;
                worker.start();
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
    
    public void setDayDuration(long dayDuration){
        this.dayDuration = dayDuration;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
    public void initializeOther(){
        this.director = new Director(Values.salarys[6],this.dayDuration, this);
        this.director.start();
        this.manager = new Manager(Values.salarys[7], this.dayDuration, this);
        this.manager.start();
    }
    
    public void calculateProfit(int price){
        this.profit += price;
        if(isLG()){
            
        }else{
            
        }
    }
    
    
    public void calculateExpenses(int qty){
        this.expenses += qty;
        if(isLG()){
            
        }else{

        }
    }
    
    public boolean isLG(){
        return this.name.equals("Lamborghini");
    }
    
    public void calculateUtility(){
        this.utility += (this.profit - this.expenses);
        if(isLG()){
            
        }else{
            
        }
    }
    
    
    public void calcrulateStatistics(){
        System.out.println("GANANCIA: " + this.profit);
        System.out.println("GASTOS: " + this.expenses);
        System.out.println("UTILIDAD: " + this.utility);
    }
}
