/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import proyectoso1.Main;
/**
 *
 * @author paola
 */
public final class Form extends javax.swing.JFrame {

    private WorkersQty wRR;
    private WorkersQty wLG;
    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.wRR = new WorkersQty(12, "workersRR");
        this.wLG = new WorkersQty(16, "workersLG");
//        WorkersQty wRR = new WorkersQty(12, "workersRR");
//        WorkersQty wLG = new WorkersQty(16, "workersLG");
        createWorkersQty(contentRR, wRR);
        createWorkersQty(contentLG, wLG);
        createModelSpinner(DayDurationSpinner, "DayDurationSpinner");
        createModelSpinner(DeadlineSpinner, "DeadlineSpinner");
    }

       public void createWorkersQty(JPanel panel, WorkersQty wq){
            wq.setSize(60, 220);
            wq.setLocation(0, 0);
            panel.removeAll();
            panel.add(wq, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
           
       }
       
    public void createModelSpinner(JSpinner spinner, String label){
        SpinnerNumberModel nm = new SpinnerNumberModel();
//        nm.setMaximum();
        nm.setMinimum(1);
        if (label.equals("DayDurationSpinner")){
            nm.setValue(Main.initial.dayDuration);
        }else if (label.equals("DeadlineSpinner")){
            nm.setValue(Main.initial.deadLine);
        }
        spinner.setModel(nm);
       
        
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
        Título1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        maxC = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        DashBoard_Panel.add(Título, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        ganancias_bruto.setText("Ganancias en bruto:");
        DashBoard_Panel.add(ganancias_bruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        gastos_op.setText("Gastos operativos:");
        DashBoard_Panel.add(gastos_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        utilidad.setText("Utilidad total:");
        DashBoard_Panel.add(utilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        LG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LG.setText("Lamborghini");
        DashBoard_Panel.add(LG, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        RR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RR.setText("Rolls Royce");
        DashBoard_Panel.add(RR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        LG_bruto.setText("jLabel4");
        DashBoard_Panel.add(LG_bruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        RR_bruto.setText("jLabel4");
        DashBoard_Panel.add(RR_bruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        RR_op.setText("jLabel4");
        DashBoard_Panel.add(RR_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        LG_op.setText("jLabel4");
        DashBoard_Panel.add(LG_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        LG_utilidad.setText("jLabel4");
        DashBoard_Panel.add(LG_utilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, -1, -1));

        RR_utilidad.setText("jLabel4");
        DashBoard_Panel.add(RR_utilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

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
            .addGap(0, 60, Short.MAX_VALUE)
        );
        contentLGLayout.setVerticalGroup(
            contentLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        DashBoard_Panel.add(contentLG, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 60, 220));

        jTabbedPane1.addTab("DashBoard", DashBoard_Panel);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Rolls Royce", jPanel3);

        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Título1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Título1.setText("Lamborghini");
        jPanel4.add(Título1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel6.setText("Creadores de chasis");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel10.setText("Creadores de carrocerías");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel11.setText("Creadores de motores");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel12.setText("Creadores de ruedas");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel13.setText("Creadores de accesorios");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel14.setText("Ensambladores");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel15.setText("jLabel1");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel16.setText("jLabel1");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel17.setText("jLabel1");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel18.setText("jLabel1");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel19.setText("jLabel1");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel20.setText("Máximo");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel21.setText("Chasis");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel22.setText("Carrocerías");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel23.setText("Motores");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel24.setText("Ruedas");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel25.setText("Accesorios");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel28.setText("jLabel1");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel29.setText("jLabel1");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel30.setText("jLabel1");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel31.setText("jLabel1");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel32.setText("jLabel1");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        maxC.setText("jLabel1");
        jPanel4.add(maxC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jLabel34.setText("jLabel1");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jLabel35.setText("jLabel1");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jLabel36.setText("jLabel1");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jLabel37.setText("jLabel1");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel38.setText("Producidas");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Cantidad de trabajadores:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Información sobre el gerente");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Vehículos estándar");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel40.setText("jLabel1");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel41.setText("jLabel1");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Vehículos con accesorios");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("5");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 50, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar_today_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jLabel43.setText("días restantes para la entrega");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 60));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Cantidad de partes:");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Información sobre el director");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel47.setText("Cantidad de faltas:");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        jLabel48.setText("El director está");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jLabel49.setText("jLabel49");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        jLabel50.setText("jLabel49");
        jPanel4.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        jLabel51.setText("El gerente está");
        jPanel4.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        jLabel52.setText("jLabel49");
        jPanel4.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        jLabel53.setText("Dinero descontado:");
        jPanel4.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        jLabel54.setText("jLabel49");
        jPanel4.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));

        jTabbedPane1.addTab("Lamborghini", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 534));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        Main.initial.setDayDuration((int)DayDurationSpinner.getValue());
        Main.initial.setDeadLine((int)DeadlineSpinner.getValue());
        Main.initial.setWorkersRR(this.wRR.valuesSpinners);
        Main.initial.setWorkersLG(this.wLG.valuesSpinners);
        for (int i = 0; i < Main.initial.workersRR.length; i++) {
            System.out.println(Main.initial.workersRR[i]);
        }
        
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
    private javax.swing.JLabel Título1;
    private javax.swing.JPanel contentLG;
    private javax.swing.JPanel contentRR;
    private javax.swing.JLabel ganancias_bruto;
    private javax.swing.JLabel gastos_op;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel maxC;
    private javax.swing.JLabel utilidad;
    // End of variables declaration//GEN-END:variables
}
