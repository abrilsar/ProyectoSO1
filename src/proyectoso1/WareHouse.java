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
    private final int[] vehicleType;
   
    
    private final int maxChasisQty;
    private final int maxWheelsQty;
    private final int maxEnginesQty;
    private final int maxBodiesQty;
    private final int maxAccessoriesQty;
    private final int betweenTypeCar;
    
    private final boolean isLG;

    public WareHouse(int[] maxCategory, int[] vehicleType, int betweenTypeCar, boolean isLG){    
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
        this.isLG = isLG;
        
    }  
 
    public void removeCars(){
        this.standardVehicleQty = 0;
        this.vehicleWithAccessoriesQty = 0;
        this.standardVehicleCounter = 0;
        if (isLG){
            Global.getForm().getVeLG().setText("0");
            Global.getForm().getVaLG().setText("0");
        }
    }
    
    public void updateStorage(String workerType, int finishedPart){
        switch (workerType){
            case "Chasis" :
                if(this.chasisQty < this.maxChasisQty){
                    this.chasisQty += finishedPart;
                    if(isLG){
                        Global.getForm().getPartsLG().getLabels()[0].setText(String.valueOf(chasisQty));
                    }else{
//                        Global.getForm().getPartsRR().getLabels()[0].setText(String.valueOf(chasisQty));
                    }
                }
                break;
                
            case "Body" :
                if(this.bodiesQty < this.maxBodiesQty){
                    this.bodiesQty += finishedPart;
                    if(isLG){
                        Global.getForm().getPartsLG().getLabels()[1].setText(String.valueOf(bodiesQty));
                    }else{
//                        Global.getForm().getPartsRR().getLabels()[1].setText(String.valueOf(bodiesQty));
                    }
                }
                
                break;
                
            case "Engine":
                if(this.enginesQty < this.maxEnginesQty){
                    this.enginesQty += finishedPart;
                    if(isLG){
                        Global.getForm().getPartsLG().getLabels()[2].setText(String.valueOf(enginesQty));
                    }else{
//                        Global.getForm().getPartsRR().getLabels()[2].setText(String.valueOf(enginesQty));
                    }
                }
                break;
                
            case "Wheels":
                if(this.wheelsQty < this.maxWheelsQty){
                    this.wheelsQty += finishedPart;
                    if(isLG){
                        Global.getForm().getPartsLG().getLabels()[3].setText(String.valueOf(wheelsQty));
                    }else{
//                        Global.getForm().getPartsRR().getLabels()[3].setText(String.valueOf(wheelsQty));
                    }
               }
               break;
                
            case "Accessories":
                if(this.accessoriesQty < this.maxAccessoriesQty){
                    this.accessoriesQty += finishedPart;
                    if(isLG){
                        Global.getForm().getPartsLG().getLabels()[4].setText(String.valueOf(accessoriesQty));
                    }else{
//                        Global.getForm().getPartsRR().getLabels()[4].setText(String.valueOf(accessoriesQty));
                    }
                }    
                break;
            
            case "Assembler":
                assembly();
                break;
                
            default:
                break;
        }
    }
    
    public void assembly(){
        if(this.chasisQty >= this.vehicleType[0] && this.bodiesQty >= this.vehicleType[1] &&  this.enginesQty >= this.vehicleType[2] && this.wheelsQty >= this.vehicleType[3]){   
            if(this.standardVehicleCounter < this.betweenTypeCar){
//                Aqui se crean los carros standar
                reduceValues();
                this.standardVehicleCounter += 1;
                this.standardVehicleQty += 1;
                if (isLG){
                    Global.getForm().getVeLG().setText(String.valueOf(this.standardVehicleQty));
//                    Global.getForm().getVeLG().setText("a");
                }else{
//                    Global.getForm().getVeRR().setText(String.valueOf(this.standardVehicleQty));
                }
            }else{
                if(this.accessoriesQty >= this.vehicleType[4]){
                    this.standardVehicleCounter = 0;
                    reduceValues();
                    this.accessoriesQty -= this.vehicleType[4];
                    this.vehicleWithAccessoriesQty += 1;
                    if (isLG){
                        Global.getForm().getVaLG().setText(String.valueOf(this.vehicleWithAccessoriesQty));
                    }else{
    //                    Global.getForm().getVaRR().setText(String.valueOf(this.standardVehicleQty));
                    }
                }
            }
        }
    }
    
    public void reduceValues(){
        this.chasisQty -= this.vehicleType[0];
        this.bodiesQty -= this.vehicleType[1];
        this.enginesQty -= this.vehicleType[2];
        this.wheelsQty -= this.vehicleType[3];
        if(isLG){
            Global.getForm().getPartsLG().getLabels()[0].setText(String.valueOf(chasisQty));
            Global.getForm().getPartsLG().getLabels()[1].setText(String.valueOf(bodiesQty));
            Global.getForm().getPartsLG().getLabels()[2].setText(String.valueOf(enginesQty));
            Global.getForm().getPartsLG().getLabels()[3].setText(String.valueOf(wheelsQty));
        }else{
//            Global.getForm().getPartsRR().getLabels()[0].setText(String.valueOf(chasisQty));
//            Global.getForm().getPartsRR().getLabels()[1].setText(String.valueOf(bodiesQty));
//            Global.getForm().getPartsRR().getLabels()[2].setText(String.valueOf(enginesQty));
//            Global.getForm().getPartsRR().getLabels()[3].setText(String.valueOf(wheelsQty));
        }

    }

    public int getStandardVehicleQty() {
        return standardVehicleQty;
    }

    public int getStandardVehicleCounter() {
        return standardVehicleCounter;
    }

}   
