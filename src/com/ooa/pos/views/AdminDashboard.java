
package com.ooa.pos.views;




public class AdminDashboard extends javax.swing.JFrame {

   
    public AdminDashboard() {
        initComponents();
    }

        String email;
        AdminDashboard(String email) {
        email = email;
        initComponents();
   
    }
     void userDesignation(String designation)
        {
          lblUserDesignnation.setText(designation);

        }
  
    void userID(String userId)
        {
          lblUserID.setText(userId);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        lblUserDesignnation = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        btnAdminChasierReg = new javax.swing.JButton();
        btnAdminReports = new javax.swing.JButton();
        btnCashierAddItems1 = new javax.swing.JButton();
        btnCashierSales = new javax.swing.JButton();
        btnCashierLoyalCus = new javax.swing.JButton();
        btnbtnLogoutFromAdminDash = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(720, 480));

        kGradientPanel4.setkGradientFocus(2500);
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 51, 51));

        lblUserDesignnation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUserDesignnation.setText("Designation");

        lblUserID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUserID.setText("User ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserDesignnation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUserDesignnation)
                .addGap(20, 20, 20)
                .addComponent(lblUserID)
                .addContainerGap())
        );

        btnAdminChasierReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdminChasierReg.setText("Accounts");
        btnAdminChasierReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminChasierRegActionPerformed(evt);
            }
        });

        btnAdminReports.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdminReports.setText("Summary");
        btnAdminReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminReportsActionPerformed(evt);
            }
        });

        btnCashierAddItems1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCashierAddItems1.setText("Stock Management");
        btnCashierAddItems1.setFocusable(false);
        btnCashierAddItems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierAddItems1ActionPerformed(evt);
            }
        });

        btnCashierSales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCashierSales.setText("Sales");
        btnCashierSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierSalesActionPerformed(evt);
            }
        });

        btnCashierLoyalCus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCashierLoyalCus.setText("Customer Registratiion");
        btnCashierLoyalCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierLoyalCusActionPerformed(evt);
            }
        });

        btnbtnLogoutFromAdminDash.setText("Logiut");
        btnbtnLogoutFromAdminDash.setToolTipText("Log Out  From Application");
        btnbtnLogoutFromAdminDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbtnLogoutFromAdminDashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(1060, Short.MAX_VALUE)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(btnbtnLogoutFromAdminDash, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(btnCashierSales, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCashierLoyalCus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdminReports, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdminChasierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCashierAddItems1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCashierSales, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnCashierAddItems1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCashierLoyalCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdminChasierReg, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnAdminReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(btnbtnLogoutFromAdminDash, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminChasierRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminChasierRegActionPerformed

        //---Pasing dat to ReturnToSales Form---------------------------------------//
        CommandCashierRegistration userRegister= new CommandCashierRegistration();
        CommandCashierRegistration.lblUserDesignnation.setText(AdminDashboard.lblUserDesignnation.getText());
        CommandCashierRegistration.lblUserID.setText(AdminDashboard.lblUserID.getText());
        
        userRegister.setVisible(true);
        dispose();
        
        //CashierRegistation cr = new CashierRegistation();
                //cr.show();
                //this.hide();

        
    }//GEN-LAST:event_btnAdminChasierRegActionPerformed

    private void btnbtnLogoutFromAdminDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbtnLogoutFromAdminDashActionPerformed

        LoginPanel lg = new LoginPanel();
                lg.show();
                this.hide();
    }//GEN-LAST:event_btnbtnLogoutFromAdminDashActionPerformed

    private void btnAdminReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminReportsActionPerformed
        //---Pasing dat to ReturnToSales Form---------------------------------------//
        SummaryGen reports= new SummaryGen();
       
        
        reports.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdminReportsActionPerformed

    private void btnCashierSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierSalesActionPerformed
         //---Pasing dat to ReturnToSales Form---------------------------------------//
        Sales salesForm= new Sales();
        Sales.lblUserDesignnation.setText(AdminDashboard.lblUserDesignnation.getText());
        Sales.lblUserID.setText(AdminDashboard.lblUserID.getText());
        
        
        salesForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCashierSalesActionPerformed

    private void btnCashierLoyalCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierLoyalCusActionPerformed
       //---Pasing dat to ReturnToSales Form---------------------------------------//
        SingletonCustomerRegister customerRegistration = new SingletonCustomerRegister();
        SingletonCustomerRegister.lblUserDesignnation.setText(AdminDashboard.lblUserDesignnation.getText());
        SingletonCustomerRegister.lblUserID.setText(AdminDashboard.lblUserID.getText());
        
        customerRegistration.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCashierLoyalCusActionPerformed

    private void btnCashierAddItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierAddItems1ActionPerformed
         //---Pasing dat to ReturnToSales Form---------------------------------------//
        SingletonStockManagment stockItem = new SingletonStockManagment();
        SingletonStockManagment.lblUserDesignnation.setText(AdminDashboard.lblUserDesignnation.getText());
        SingletonStockManagment.lblUserID.setText(AdminDashboard.lblUserID.getText());
        
        stockItem.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCashierAddItems1ActionPerformed

    /**
     * 
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminChasierReg;
    private javax.swing.JButton btnAdminReports;
    private javax.swing.JButton btnCashierAddItems1;
    private javax.swing.JButton btnCashierLoyalCus;
    private javax.swing.JButton btnCashierSales;
    private javax.swing.JButton btnbtnLogoutFromAdminDash;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel4;
    public static javax.swing.JLabel lblUserDesignnation;
    public static javax.swing.JLabel lblUserID;
    // End of variables declaration//GEN-END:variables
}
