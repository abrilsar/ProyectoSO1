/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.BorderLayout;
import javax.swing.JPanel;
/**
 *
 * @author paola
 */
public final class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        WorkersQty wRR = new WorkersQty(12);
        WorkersQty wLG = new WorkersQty(16);
        createWorkersQty(contentRR, wRR);
        createWorkersQty(contentLG, wLG);
    }

       public void createWorkersQty(JPanel panel, WorkersQty wq){
            wq.setSize(60, 220);
            wq.setLocation(0, 0);
            panel.removeAll();
            panel.add(wq, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
           
       }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        DashBoard_Panel = new javax.swing.JPanel();
        contentRR = new javax.swing.JPanel();
        Título = new javax.swing.JLabel();
        ganancias_bruto = new javax.swing.JLabel();
        gastos_op = new javax.swing.JLabel();
        utilidad = new javax.swing.JLabel();
        LG = new javax.swing.JLabel();
        RR = new javax.swing.JLabel();
        LG_bruto = new javax.swing.JLabel();
        RR_bruto = new javax.swing.JLabel();
        RR_op = new javax.swing.JLabel();
        LG_op = new javax.swing.JLabel();
        LG_utilidad = new javax.swing.JLabel();
        RR_utilidad = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        RR1 = new javax.swing.JLabel();
        LG1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Deadline = new javax.swing.JLabel();
        DayDuration = new javax.swing.JLabel();
        DeadlineSpinner = new javax.swing.JSpinner();
        DayDurationSpinner = new javax.swing.JSpinner();
        contentLG = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DashBoard_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout contentRRLayout = new javax.swing.GroupLayout(contentRR);
        contentRR.setLayout(contentRRLayout);
        contentRRLayout.setHorizontalGroup(
            contentRRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        contentRRLayout.setVerticalGroup(
            contentRRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        DashBoard_Panel.add(contentRR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 60, 220));

        Título.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Título.setText("Mercado Automotriz en Venezuela");
        DashBoard_Panel.add(Título, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        ganancias_bruto.setText("Ganancias en bruto:");
        DashBoard_Panel.add(ganancias_bruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        gastos_op.setText("Gastos operativos:");
        DashBoard_Panel.add(gastos_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        utilidad.setText("Utilidad total:");
        DashBoard_Panel.add(utilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        LG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LG.setText("Lamborghini");
        DashBoard_Panel.add(LG, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        RR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RR.setText("Rolls Royce");
        DashBoard_Panel.add(RR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        LG_bruto.setText("jLabel4");
        DashBoard_Panel.add(LG_bruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, -1));

        RR_bruto.setText("jLabel4");
        DashBoard_Panel.add(RR_bruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        RR_op.setText("jLabel4");
        DashBoard_Panel.add(RR_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        LG_op.setText("jLabel4");
        DashBoard_Panel.add(LG_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        LG_utilidad.setText("jLabel4");
        DashBoard_Panel.add(LG_utilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, -1, -1));

        RR_utilidad.setText("jLabel4");
        DashBoard_Panel.add(RR_utilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        DashBoard_Panel.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        RR1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RR1.setText("Rolls Royce");
        DashBoard_Panel.add(RR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        LG1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LG1.setText("Lamborghini");
        DashBoard_Panel.add(LG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel2.setText("Empleados disponibles");
        DashBoard_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setText("Creadores de chasis");
        DashBoard_Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setText("Creadores de carrocerías");
        DashBoard_Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setText("Creadores de motores");
        DashBoard_Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel7.setText("Creadores de ruedas");
        DashBoard_Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel8.setText("Creadores de accesorios");
        DashBoard_Panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel9.setText("Ensambladores");
        DashBoard_Panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        Deadline.setText("Deadline de entrega (en segundos):");
        DashBoard_Panel.add(Deadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        DayDuration.setText("Duración del día (en segundos):");
        DashBoard_Panel.add(DayDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        DeadlineSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        DashBoard_Panel.add(DeadlineSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 40, -1));

        DayDurationSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        DashBoard_Panel.add(DayDurationSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 40, -1));

        javax.swing.GroupLayout contentLGLayout = new javax.swing.GroupLayout(contentLG);
        contentLG.setLayout(contentLGLayout);
        contentLGLayout.setHorizontalGroup(
            contentLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLGLayout.setVerticalGroup(
            contentLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        DashBoard_Panel.add(contentLG, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 60, 220));

        jTabbedPane1.addTab("DashBoard", DashBoard_Panel);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Rolls Royce", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Lamborghini", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashBoard_Panel;
    private javax.swing.JLabel DayDuration;
    private javax.swing.JSpinner DayDurationSpinner;
    private javax.swing.JLabel Deadline;
    private javax.swing.JSpinner DeadlineSpinner;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel LG;
    private javax.swing.JLabel LG1;
    private javax.swing.JLabel LG_bruto;
    private javax.swing.JLabel LG_op;
    private javax.swing.JLabel LG_utilidad;
    private javax.swing.JLabel RR;
    private javax.swing.JLabel RR1;
    private javax.swing.JLabel RR_bruto;
    private javax.swing.JLabel RR_op;
    private javax.swing.JLabel RR_utilidad;
    private javax.swing.JLabel Título;
    private javax.swing.JPanel contentLG;
    private javax.swing.JPanel contentRR;
    private javax.swing.JLabel ganancias_bruto;
    private javax.swing.JLabel gastos_op;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel utilidad;
    // End of variables declaration//GEN-END:variables
}
