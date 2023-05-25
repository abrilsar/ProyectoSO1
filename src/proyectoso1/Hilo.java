/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paola
 */
public class Hilo extends Thread{

    private String msg;
    
    public Hilo(String text) {
        this.msg = text;
    }
    
    @Override
    public void run(){
        while (true){
            try {
                System.out.println(msg);
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }
    

