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
public class WareHouse {
    private int chasisQty;
    private int wheelsQty;
    private int enginesQty;
    private int bodiesQty;
    private int accessoriesQty;
    private int standardVehicleQty;
    private int vehicleWithAccessoriesQty;
    private int standardVehicleCounter;
    private int[] vehicleType;
    private int counterDaysDelivery;
    private int maxChasisQty;
    private int maxWheelsQty;
    private int maxEnginesQty;
    private int maxBodiesQty;
    private int maxAccessoriesQty;
    private int betweenTypeCar;

//    public WareHouse(int maxChasisQty, int maxWheelsQty, int maxEnginesQty, int maxBodiesQty, int maxAccessoriesQty, Vehicle vehicleType, int deadLine) {
    public WareHouse(int[] maxCategory, int[] vehicleType, int betweenTypeCar){    
        this.maxChasisQty = maxCategory[0];
        this.maxWheelsQty = maxCategory[3];
        this.maxEnginesQty = maxCategory[2];
        this.maxBodiesQty = maxCategory[1];
        this.maxAccessoriesQty = maxCategory[4];
        this.wheelsQty = 0;
        this.chasisQty = 0;
        this.enginesQty = 0;
        this.bodiesQty = 0;
        this.standardVehicleQty = 0;
        this.accessoriesQty = 0;
        this.vehicleWithAccessoriesQty = 0;
        this.vehicleType = vehicleType; 
        this.betweenTypeCar = betweenTypeCar;
        this.counterDaysDelivery = Main.initial.deadLine;
        
    }  
 
    public void updateCounterDays(String workerName){
        switch(workerName){
            case "Director":
                this.counterDaysDelivery = Main.initial.deadLine;
                this.standardVehicleQty = 0;
                this.vehicleWithAccessoriesQty = 0;
                this.standardVehicleCounter = 0;
                break;
            case "Manager":
                this.counterDaysDelivery -= 1;
                break;
            default:
                break;
        }
    }
    
    public void updateStorage(String workerType, int finishedPart){
        switch (workerType){
            case "chasis" :
                if(this.chasisQty < this.maxChasisQty){
                    this.chasisQty += finishedPart;
                    System.out.println("Chasis agregado");
                }
                break;
                
            case "body" :
                if(this.bodiesQty < this.maxBodiesQty){
                   this.bodiesQty += finishedPart;
                }
                
                break;
                
            case "engine":
                if(this.enginesQty < this.maxEnginesQty){
                   this.enginesQty += finishedPart;
                }
                break;
                
            case "wheels":
                if(this.wheelsQty < this.maxWheelsQty){
                   this.wheelsQty += finishedPart;
               }
               break;
                
            case "accessories":
                if(this.accessoriesQty < this.maxAccessoriesQty){
                   this.accessoriesQty += finishedPart;
                }    
                break;
            
            case "assembler":
                assembly();
                break;
                
            default:
                break;
        }
    }
    
    public void assembly(){
        if(this.chasisQty >= this.vehicleType[0] && this.bodiesQty >= this.vehicleType[1] &&  this.enginesQty >= this.vehicleType[2] && this.wheelsQty >= this.vehicleType[3]){   
            if(this.standardVehicleCounter <= this.betweenTypeCar){
//                Aqui se crean los carros standar
                reduceValues();
                this.standardVehicleCounter += 1;
                this.standardVehicleQty += 1;
            }else{
//                
                if(this.accessoriesQty >= this.vehicleType[4]){
                    this.standardVehicleCounter = 0;
                    reduceValues();
                    this.accessoriesQty -= this.vehicleType[4];
                    this.vehicleWithAccessoriesQty += 1;
                }
            }
            
        }
    }
    
    public void reduceValues(){
        this.chasisQty -= this.vehicleType[0];
        this.bodiesQty -= this.vehicleType[1];
        this.enginesQty -= this.vehicleType[2];
        this.wheelsQty -= this.vehicleType[3];

    }

    public int getStandardVehicleQty() {
        return standardVehicleQty;
    }

    public int getStandardVehicleCounter() {
        return standardVehicleCounter;
    }

    public int getCounterDaysDelivery() {
        return counterDaysDelivery;
    }

    

    
}   
