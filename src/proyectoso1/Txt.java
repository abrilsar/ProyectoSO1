/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author paola
 */
public class Txt {

    
    public static Initial readData(){
        FileInputStream archivo = null;
        ObjectInputStream lector = null;
        Initial initial = null;
        
        try {
            archivo = new FileInputStream("data.txt");
            lector = new ObjectInputStream(archivo);
            initial = (Initial) lector.readObject();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Txt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Txt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Txt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }finally{
            try {
                archivo.close();
                lector.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Txt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        
        
        return initial;
        
    }
    
    public static void saveData(){
        FileOutputStream archivo = null;
        ObjectOutputStream escritor = null;
        try {
            archivo = new FileOutputStream("data.txt");
            escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(Main.initial);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Txt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Txt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }finally{
               try {
                   archivo.close();
                   escritor.close();
               } catch (IOException ex) {
                   java.util.logging.Logger.getLogger(Txt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
               }   
        }
    }
}
