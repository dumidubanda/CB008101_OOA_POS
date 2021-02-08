
package com.ooa.pos.views;

import com.ooa.pos.singleton.SingletonDataBaseConnection;
import java.sql.*;
import javax.swing.*;



public class LoginPanel extends javax.swing.JFrame {

   Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    public LoginPanel() {
        initComponents();
        con=SingletonDataBaseConnection.connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        txtUserName = new javax.swing.JTextField();
        btnloging = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        cmboption = new javax.swing.JComboBox<>();
        txtpword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 51, 255));
        kGradientPanel2.setkGradientFocus(2000);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 255));

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        btnloging.setText("Login");
        btnloging.setToolTipText("Login");
        btnloging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogingActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");

        btncancel.setText("Cancel");

        cmboption.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmboption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cashier" }));

        txtpword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwordActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Designation");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Name");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USER LOGIN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User ID");

        txtUserId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtpword, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cmboption, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnloging, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(350, 350, 350))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(txtUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(txtpword, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(cmboption, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(btnloging, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncancel)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void txtpwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpwordActionPerformed

    private void btnlogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogingActionPerformed

        //btn code//
        String userID = txtUserId.getText();
        String useName = txtUserName.getText();
        String password = txtpword.getText();
        String designationCombo = cmboption.getSelectedItem().toString();

        if(
            userID.equals("")||useName.equals("")||password.equals("")||designationCombo.equals("Select")
        ){
            JOptionPane.showMessageDialog(rootPane, "Fields Are Missing","Error",1);

        }
        else {
            try{

                pst=con.prepareStatement("SELECT * FROM user WHERE username=? AND password=?");

                //pst.setString(1, userID);
                pst.setString(1, useName);
                pst.setString(2, password);
                

                rs = pst.executeQuery();

                if(rs.next()){
                    String desig = rs.getString("designation");
                    String userName= rs.getString("username");
                    if((designationCombo.equalsIgnoreCase("Admin"))&& (desig.equalsIgnoreCase("admin")))
                    {
                        AdminDashboard adminDash = new AdminDashboard(userName);
                        adminDash.setVisible(true);
                        this.setVisible(false);
                    }

                    else if(designationCombo.equalsIgnoreCase("Cashier")&& desig.equalsIgnoreCase("cashier")){
                        CashierDashboard cashierDash = new CashierDashboard(userName);
                        cashierDash.setVisible(true);
                        this.setVisible(false);
                    }

                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "UserName or Password not Matching ","Loging Error",1);
                }
            }

            catch(Exception ex)
            {
                System.out.print(""+ex);
            }

        }

    }//GEN-LAST:event_btnlogingActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnloging;
    private javax.swing.JComboBox<String> cmboption;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtpword;
    // End of variables declaration//GEN-END:variables
}
