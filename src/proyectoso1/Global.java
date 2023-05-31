/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

import form.Form;

/**
 *
 * @author paola
 */
public class Global {
    private static final Form form = new Form();
    
    public static void startForm(){
        form.setVisible(true);
    }

    public static Form getForm() {
        return form;
    }
}
