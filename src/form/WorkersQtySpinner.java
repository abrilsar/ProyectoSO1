/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import proyectoso1.Main;

/**
 *
 * @author paola
 */
public class WorkersQtySpinner extends javax.swing.JPanel {

    private final int maxWorkerQty;
    private final JSpinner[] spinners;
    private int availableQty;
    public final int[] valuesSpinners;
    private final String label;
    
    /**
     * Creates new form WorkersQty
     * @param maxWorkerQty
     * @param label
     */
    public WorkersQtySpinner(int maxWorkerQty, String label) {
        initComponents();
        this.jPanel1.setOpaque(false);
        this.setOpaque(false);
        this.maxWorkerQty = maxWorkerQty;
        this.availableQty = maxWorkerQty;
        this.spinners = new JSpinner[6];
        this.valuesSpinners = new int[6];
        this.label = label;
        initializeSpinners();
    }
    
    
    public int updateValuesSpinners(int value, JSpinner spinner){
        for (int i = 0; i < this.spinners.length; i++) {
            if (spinner == this.spinners[i]){
                if (value > this.valuesSpinners[i]){
                    this.valuesSpinners[i] = (int) this.spinners[i].getValue();
                    return -1;                                      
                }
                else{
                    this.valuesSpinners[i] = (int) this.spinners[i].getValue();
                    return 1;
                }
            }
        }
        return 0;
    }
    
    public void countAvailable(){
        for (JSpinner spinner : this.spinners) {
            this.availableQty -= (int) spinner.getValue();
        }
    }
    
    public void createListener(JSpinner spinner){
        spinner.addChangeListener((ChangeEvent e) -> {
            JSpinner source = (JSpinner) e.getSource();
            int value = (int) source.getValue();
            int aux = updateValuesSpinners(value, source);
            if ( aux != 0){
                this.availableQty += aux;
                availableLabel.setText(String.valueOf(this.availableQty));
                createModelSpinner(false);
            }
        });    
    }
    
    public final void initializeSpinners(){
        this.spinners[0] = this.chasisQTY;
        this.spinners[1] = this.bodiesQTY;
        this.spinners[2] = this.engineQTY;
        this.spinners[3] = this.wheelsQTY;
        this.spinners[4] = this.accesoriesQTY;
        this.spinners[5] = this.assemblersQTY;
        createModelSpinner(true);
        countAvailable();
        availableLabel.setText(String.valueOf(this.availableQty));
        for (JSpinner spinner : this.spinners) {
            int a = updateValuesSpinners((int) spinner.getValue(), spinner);
            createListener(spinner);
        }
        createModelSpinner(false);
    }
    

    public void createModelSpinner(boolean first){
        for (int i = 0; i < this.spinners.length; i++) {
            SpinnerNumberModel nm = new SpinnerNumberModel();
            nm.setMaximum(this.availableQty + (int) this.spinners[i].getValue());
            if (availableQty == 0){
                nm.setMaximum((int) this.spinners[i].getValue());
            }
            nm.setMinimum(1);
            if (first){
                if (this.label.equals("workersRR")){
                    nm.setValue(Main.initial.workersRR[i]);
                }else if (this.label.equals("workersLG")){
                    nm.setValue(Main.initial.workersLG[i]);
                }
            }else{
                nm.setValue(this.spinners[i].getValue());
            }
            this.spinners[i].setModel(nm);
        }
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        availableLabel = new javax.swing.JLabel();
        chasisQTY = new javax.swing.JSpinner();
        bodiesQTY = new javax.swing.JSpinner();
        engineQTY = new javax.swing.JSpinner();
        wheelsQTY = new javax.swing.JSpinner();
        accesoriesQTY = new javax.swing.JSpinner();
        assemblersQTY = new javax.swing.JSpinner();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        availableLabel.setText("jLabel4");
        jPanel1.add(availableLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 10, 40, -1));

        chasisQTY.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(chasisQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 20));

        bodiesQTY.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(bodiesQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, 20));

        engineQTY.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(engineQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 40, 20));

        wheelsQTY.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(wheelsQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 40, 20));

        accesoriesQTY.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(accesoriesQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 40, 20));

        assemblersQTY.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(assemblersQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner accesoriesQTY;
    private javax.swing.JSpinner assemblersQTY;
    private javax.swing.JLabel availableLabel;
    private javax.swing.JSpinner bodiesQTY;
    private javax.swing.JSpinner chasisQTY;
    private javax.swing.JSpinner engineQTY;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner wheelsQTY;
    // End of variables declaration//GEN-END:variables
}
