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
    private int vehicleQty;
    
    private int maxChasisQty;
    private int maxWheelsQty;
    private int maxEnginesQty;
    private int maxBodiesQty;
    private int maxAccessoriesQty;

    public WareHouse(int maxChasisQty, int maxWheelsQty, int maxEnginesQty, int maxBodiesQty, int maxAccessoriesQty) {
        this.maxChasisQty = maxChasisQty;
        this.maxWheelsQty = maxWheelsQty;
        this.maxEnginesQty = maxEnginesQty;
        this.maxBodiesQty = maxBodiesQty;
        this.maxAccessoriesQty = maxAccessoriesQty;
        
        this.wheelsQty = 0;
        this.chasisQty = 0;
        this.enginesQty = 0;
        this.bodiesQty = 0;
        this.vehicleQty =0;
        this.accessoriesQty = 0;
        
    }

    public void updateStorage(String workerType, int finishedPart){
        switch (workerType){
            case "chasis" :
                if(this.chasisQty < this.maxChasisQty){
                    this.chasisQty += finishedPart;
                    System.out.println("Chasis agregado");
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
           
            default:
                break;
        }
    }
}   
