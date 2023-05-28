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
    private Vehicle vehicleType;
    
    private int maxChasisQty;
    private int maxWheelsQty;
    private int maxEnginesQty;
    private int maxBodiesQty;
    private int maxAccessoriesQty;

    public WareHouse(int maxChasisQty, int maxWheelsQty, int maxEnginesQty, int maxBodiesQty, int maxAccessoriesQty, Vehicle vehicleType) {
        this.maxChasisQty = maxChasisQty;
        this.maxWheelsQty = maxWheelsQty;
        this.maxEnginesQty = maxEnginesQty;
        this.maxBodiesQty = maxBodiesQty;
        this.maxAccessoriesQty = maxAccessoriesQty;
        
        this.wheelsQty = 0;
        this.chasisQty = 0;
        this.enginesQty = 0;
        this.bodiesQty = 0;
        this.standardVehicleQty = 0;
        this.accessoriesQty = 0;
        this.vehicleWithAccessoriesQty = 0;
        this.vehicleType = vehicleType; 
        
    }  
 
    public void updateStorage(String workerType, int finishedPart){
        switch (workerType){
            case "chasis" :
                if(this.chasisQty < this.maxChasisQty){
                    this.chasisQty += finishedPart;
                }
                break;
                
            case "bodies" :
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
        if(this.bodiesQty >= this.vehicleType.getBodies() && this.chasisQty >= this.vehicleType.getChasis() && this.wheelsQty >= this.vehicleType.getWheels()  && this.enginesQty >= this.vehicleType.getEngines()){   
            if(this.standardVehicleCounter <= this.vehicleType.getNumStandar()){
//                Aqui se crean los carros standar
                reduceValues();
                this.standardVehicleCounter += 1;
                this.standardVehicleQty += 1;
            }else{
//                
                if(this.accessoriesQty >= this.vehicleType.getAccessories()){
                    this.standardVehicleCounter = 0;
                    reduceValues();
                    this.accessoriesQty -= this.vehicleType.getAccessories();
                    this.vehicleWithAccessoriesQty += 1;
                }
            }
            
        }
    }
    
    public void reduceValues(){
        this.bodiesQty -= this.vehicleType.getBodies();
        this.chasisQty -= this.vehicleType.getChasis();
        this.wheelsQty -= this.vehicleType.getWheels();
        this.enginesQty -= this.vehicleType.getEngines();
    }

}   
