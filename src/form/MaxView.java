/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import proyectoso1.Values;

/**
 *
 * @author paola
 */
public class MaxView extends javax.swing.JPanel {
    
    /**
     * Creates new form MaxView
     * 
     */
    public MaxView() {
        initComponents();
        this.jPanel2.setOpaque(false);
        this.setOpaque(false);
        maxC.setText(String.valueOf(Values.maxPerCategory[0]));
        maxB.setText(String.valueOf(Values.maxPerCategory[1]));
        maxE.setText(String.valueOf(Values.maxPerCategory[2]));
        maxW.setText(String.valueOf(Values.maxPerCategory[3]));
        maxAc.setText(String.valueOf(Values.maxPerCategory[4]));
               
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        availableLabel = new javax.swing.JLabel();
        maxC = new javax.swing.JLabel();
        maxB = new javax.swing.JLabel();
        maxE = new javax.swing.JLabel();
        maxW = new javax.swing.JLabel();
        maxAc = new javax.swing.JLabel();

        setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        availableLabel.setText("Máximo");
        jPanel2.add(availableLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        maxC.setText("jLabel1");
        jPanel2.add(maxC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        maxB.setText("jLabel1");
        jPanel2.add(maxB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        maxE.setText("jLabel1");
        jPanel2.add(maxE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        maxW.setText("jLabel1");
        jPanel2.add(maxW, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 40, -1));

        maxAc.setText("jLabel1");
        jPanel2.add(maxAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel maxAc;
    private javax.swing.JLabel maxB;
    private javax.swing.JLabel maxC;
    private javax.swing.JLabel maxE;
    private javax.swing.JLabel maxW;
    // End of variables declaration//GEN-END:variables
}
