
package com.ooa.pos.views;




public class CashierDashboard extends javax.swing.JFrame {

    
    public CashierDashboard() {
        initComponents();
    }

     String email;
    CashierDashboard(String email) {

       email=email;
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
        kGradientPanel2 = new keeptoo.KGradientPanel();
        btnCashierSales = new javax.swing.JButton();
        btnCashierLoyalCus = new javax.swing.JButton();
        btnCashierAddItems1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblUserDesignnation = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        btnLogoutFromCashierDash = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel2.setkGradientFocus(2500);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 51, 51));

        btnCashierSales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCashierSales.setText("Sales");
        btnCashierSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierSalesActionPerformed(evt);
            }
        });

        btnCashierLoyalCus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCashierLoyalCus.setText("Customer Registration");
        btnCashierLoyalCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierLoyalCusActionPerformed(evt);
            }
        });

        btnCashierAddItems1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCashierAddItems1.setText("Stock Management");
        btnCashierAddItems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierAddItems1ActionPerformed(evt);
            }
        });

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

        btnLogoutFromCashierDash.setText("Logout");
        btnLogoutFromCashierDash.setToolTipText("Log Out  From Application");
        btnLogoutFromCashierDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutFromCashierDashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogoutFromCashierDash, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(btnCashierSales, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCashierLoyalCus, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCashierAddItems1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCashierAddItems1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCashierLoyalCus, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCashierSales, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 175, Short.MAX_VALUE)
                .addComponent(btnLogoutFromCashierDash, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCashierLoyalCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierLoyalCusActionPerformed
 //---Pasing dat to ReturnToSales Form---------------------------------------//
        SingletonCustomerRegister customerRegistration = new SingletonCustomerRegister();
        SingletonCustomerRegister.lblUserDesignnation.setText(CashierDashboard.lblUserDesignnation.getText());
        SingletonCustomerRegister.lblUserID.setText(CashierDashboard.lblUserID.getText());
        
        customerRegistration.setVisible(true);
        dispose();
        
        
        
        //LoyalCustomerRegistor cr = new CustomerRegister();
               // cr.show();
               // this.hide();


        // TODO add your handling code here:
    }//GEN-LAST:event_btnCashierLoyalCusActionPerformed

    private void btnLogoutFromCashierDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutFromCashierDashActionPerformed
        LoginPanel lg = new LoginPanel();
                lg.show();
                this.hide();
        
    }//GEN-LAST:event_btnLogoutFromCashierDashActionPerformed

    private void btnCashierSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierSalesActionPerformed
       
        //---Pasing dat to ReturnToSales Form---------------------------------------//
        Sales salesForm= new Sales();
        Sales.lblUserDesignnation.setText(CashierDashboard.lblUserDesignnation.getText());
        Sales.lblUserID.setText(CashierDashboard.lblUserID.getText());
       
        
        salesForm.setVisible(true);
        dispose();
        
        
        
        
    }//GEN-LAST:event_btnCashierSalesActionPerformed

    private void btnCashierAddItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierAddItems1ActionPerformed

      //---Pasing dat to ReturnToSales Form---------------------------------------//
        SingletonStockManagment stockItem = new SingletonStockManagment();
        SingletonStockManagment.lblUserDesignnation.setText(CashierDashboard.lblUserDesignnation.getText());
        SingletonStockManagment.lblUserID.setText(CashierDashboard.lblUserID.getText());
        
        stockItem.setVisible(true);
        dispose();
        
        
        
        
        //ItemPanel stman = new StockManagment();
                //stman.show();
               // this.hide();
    }//GEN-LAST:event_btnCashierAddItems1ActionPerformed

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
            java.util.logging.Logger.getLogger(CashierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCashierAddItems1;
    private javax.swing.JButton btnCashierLoyalCus;
    private javax.swing.JButton btnCashierSales;
    private javax.swing.JButton btnLogoutFromCashierDash;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel2;
    public static javax.swing.JLabel lblUserDesignnation;
    public static javax.swing.JLabel lblUserID;
    // End of variables declaration//GEN-END:variables
}
