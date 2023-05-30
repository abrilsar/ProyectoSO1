/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;
import java.io.Serializable;
/**
 *
 * @author paola
 */
public class Initial implements Serializable{
    public int dayDuration;
    public int deadLine;
    public int[] workersRR;
    public int[] workersLG;

    public Initial(int dayDuration, int deadLine) {
        this.dayDuration = dayDuration;
        this.deadLine = deadLine;
        this.workersRR = new int[6];
        this.workersLG = new int[6];
    }
    
    public void createArray(String label, String chasis, String body, String engine, String wheels, String acc, String assembler){
        if (label.equals("workersRR")){
            this.workersRR[0] = Integer.parseInt(chasis);
            this.workersRR[1] = Integer.parseInt(body);
            this.workersRR[2] = Integer.parseInt(engine);
            this.workersRR[3] = Integer.parseInt(wheels);
            this.workersRR[4] = Integer.parseInt(acc);
            this.workersRR[5] = Integer.parseInt(assembler);

        }else if (label.equals("workersLG")){
            this.workersLG[0] = Integer.parseInt(chasis);
            this.workersLG[1] = Integer.parseInt(body);
            this.workersLG[2] = Integer.parseInt(engine);
            this.workersLG[3] = Integer.parseInt(wheels);
            this.workersLG[4] = Integer.parseInt(acc);
            this.workersLG[5] = Integer.parseInt(assembler);
        }
        
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public int getDeadLine() {
        return deadLine;
    }

    public int[] getWorkersRR() {
        return workersRR;
    }

    public int[] getWorkersLG() {
        return workersLG;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public void setDeadLine(int deadLine) {
        this.deadLine = deadLine;
    }

    public void setWorkersRR(int[] workersRR) {
        this.workersRR = workersRR;
    }

    public void setWorkersLG(int[] workersLG) {
        this.workersLG = workersLG;
    }

    
}
