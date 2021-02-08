
//Singleton Pattern
 // Using SingletonDataBaseConnection 

package com.ooa.pos.views;
import com.ooa.pos.singleton.Customer;
import com.ooa.pos.singleton.CustomerDaoImplementation;
import com.ooa.pos.singleton.SingletonDataBaseConnection;
import static com.ooa.pos.views.SingletonStockManagment.lblUserDesignnation;
import static com.ooa.pos.views.SingletonStockManagment.lblUserID;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.swing.*;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;



public class SingletonCustomerRegister extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;
    
    
    
    public SingletonCustomerRegister() {
        
        initComponents();
        showDate();
       
    }
    

 void showDate()
  {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      java.util.Date d = new java.util.Date();
      dcCusRegisteredDate.setText(sdf.format(d));
     
  }   
 //-------------------------------------------------------------------------------------------------------------------------------------------------//
  

    
//----Adding data to Jtable------------------------------------------------------------------------------------------------------------------------//
    
   public void CustomerLoad()
   {
       int c;
        try {
            pst = con.prepareStatement("SELECT * FROM loyalcustomer");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            d = (DefaultTableModel)tblCustomer.getModel();
            d.setRowCount(0);
            
//** While loop for load the data
            while(rs.next())
            {
              Vector v2 = new Vector();
              for(int i=1; i<=c; i++)
              {
              v2.add(rs.getString("customer_id"));
              v2.add(rs.getString("customer_fname"));
              v2.add(rs.getString("customer_lname"));
              v2.add(rs.getString("customer_gender"));
              v2.add(rs.getString("customer_nic"));
              v2.add(rs.getString("customer_address"));
              v2.add(rs.getString("customer_contactno"));
              v2.add(rs.getString("customer_mail"));
             
              v2.add(rs.getDate("registered_date"));   // Registred Date
              
              v2.add(rs.getString("loyal_points"));
              }
              
              d.addRow(v2);
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }

   
 //-------------------------------------------------------------------------------------------------------------------------------------------------//
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblUserDesignnation = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        txtSearchCustomer = new javax.swing.JTextField();
        btnBackFromCus = new javax.swing.JToggleButton();
        btnClearCusData = new javax.swing.JButton();
        btnCusDelete = new javax.swing.JButton();
        btnCusEdit = new javax.swing.JButton();
        btnCusAdd = new javax.swing.JButton();
        btnExitFromCus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblCustomerId = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        txtCustomerfName = new javax.swing.JTextField();
        txtCustomerlName = new javax.swing.JTextField();
        lblCustomerlName = new javax.swing.JLabel();
        lblCustomerNIC1 = new javax.swing.JLabel();
        cmbCustomerGender = new javax.swing.JComboBox<>();
        txtCustomerNIC = new javax.swing.JTextField();
        lblCustomerNIC = new javax.swing.JLabel();
        lblCustomerAddress = new javax.swing.JLabel();
        txtCustomerAddress = new javax.swing.JTextField();
        txtCustomerContact = new javax.swing.JTextField();
        lblCustomerContact = new javax.swing.JLabel();
        lblCustomerMail = new javax.swing.JLabel();
        txtCustomerMail = new javax.swing.JTextField();
        lblRegisteredDate = new javax.swing.JLabel();
        lblLoyalPoints = new javax.swing.JLabel();
        dcCusRegisteredDate = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        lblLoyalPointsDisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 108, 254));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 230, 103));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Loyal Customers");

        jPanel12.setBackground(new java.awt.Color(0, 108, 254));

        lblUserDesignnation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUserDesignnation.setText("Designation");

        lblUserID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUserID.setText("User ID");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUserDesignnation, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(lblUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblUserDesignnation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserID)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(559, Short.MAX_VALUE))
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tblCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "First Name", "Last Name", "Gender", "NIC", "Address", "Contact Number", "E-Mail", "Registered Date", "Loyalty Points"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);
        if (tblCustomer.getColumnModel().getColumnCount() > 0) {
            tblCustomer.getColumnModel().getColumn(0).setPreferredWidth(75);
            tblCustomer.getColumnModel().getColumn(1).setPreferredWidth(75);
            tblCustomer.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblCustomer.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblCustomer.getColumnModel().getColumn(4).setPreferredWidth(75);
            tblCustomer.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblCustomer.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblCustomer.getColumnModel().getColumn(7).setPreferredWidth(200);
            tblCustomer.getColumnModel().getColumn(8).setPreferredWidth(90);
        }

        txtSearchCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchCustomer.setToolTipText("Search Bar");
        txtSearchCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        txtSearchCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchCustomerMouseClicked(evt);
            }
        });
        txtSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCustomerActionPerformed(evt);
            }
        });
        txtSearchCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchCustomerKeyReleased(evt);
            }
        });

        btnBackFromCus.setText("Back");
        btnBackFromCus.setToolTipText("Back to Dash Board");
        btnBackFromCus.setBorder(null);
        btnBackFromCus.setOpaque(true);
        btnBackFromCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackFromCusActionPerformed(evt);
            }
        });

        btnClearCusData.setText("Clear Text Fiields");
        btnClearCusData.setToolTipText("Clear Text Fiields");
        btnClearCusData.setBorder(null);
        btnClearCusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCusDataActionPerformed(evt);
            }
        });

        btnCusDelete.setText("Delete Customer Details");
        btnCusDelete.setToolTipText("Delete Customer Details");
        btnCusDelete.setBorder(null);
        btnCusDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCusDeleteActionPerformed(evt);
            }
        });

        btnCusEdit.setText("Update Customer Details");
        btnCusEdit.setToolTipText("Update Customer Details");
        btnCusEdit.setBorder(null);
        btnCusEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCusEditActionPerformed(evt);
            }
        });

        btnCusAdd.setText("Add New Customer ");
        btnCusAdd.setToolTipText("Add New Customer ");
        btnCusAdd.setBorder(null);
        btnCusAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCusAddActionPerformed(evt);
            }
        });

        btnExitFromCus.setText("Exit");
        btnExitFromCus.setToolTipText("Exit Frtom Application");
        btnExitFromCus.setBorder(null);
        btnExitFromCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitFromCusActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        lblCustomerId.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerId.setText("Customer ID");
        lblCustomerId.setOpaque(true);

        lblCustomerName.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerName.setText("First Name");
        lblCustomerName.setOpaque(true);

        txtCustomerfName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerfName.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        txtCustomerlName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerlName.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        lblCustomerlName.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerlName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerlName.setText("Last Name");
        lblCustomerlName.setOpaque(true);

        lblCustomerNIC1.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerNIC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerNIC1.setText("Gender");
        lblCustomerNIC1.setOpaque(true);

        cmbCustomerGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCustomerGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cmbCustomerGender.setBorder(null);

        txtCustomerNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerNIC.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        lblCustomerNIC.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerNIC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerNIC.setText("NIC");
        lblCustomerNIC.setOpaque(true);

        lblCustomerAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerAddress.setText("Postal Address");
        lblCustomerAddress.setOpaque(true);

        txtCustomerAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerAddress.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        txtCustomerContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerContact.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        lblCustomerContact.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerContact.setText("Contact Number");
        lblCustomerContact.setOpaque(true);

        lblCustomerMail.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerMail.setText("E-Mail Address");
        lblCustomerMail.setOpaque(true);

        txtCustomerMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerMail.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        lblRegisteredDate.setBackground(new java.awt.Color(255, 255, 255));
        lblRegisteredDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRegisteredDate.setText("Registered Date");
        lblRegisteredDate.setOpaque(true);

        lblLoyalPoints.setBackground(new java.awt.Color(255, 255, 255));
        lblLoyalPoints.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLoyalPoints.setText("Loyalty Points");
        lblLoyalPoints.setOpaque(true);

        dcCusRegisteredDate.setBackground(java.awt.SystemColor.controlHighlight);
        dcCusRegisteredDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dcCusRegisteredDate.setOpaque(true);

        txtCustomerId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerId.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        lblLoyalPointsDisplay.setBackground(java.awt.SystemColor.controlHighlight);
        lblLoyalPointsDisplay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLoyalPointsDisplay.setText("0");
        lblLoyalPointsDisplay.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblCustomerlName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomerNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCustomerfName, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(txtCustomerlName, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(txtCustomerNIC, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(txtCustomerId))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lblCustomerMail, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCustomerMail, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lblCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCustomerNIC1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCustomerGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoyalPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegisteredDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcCusRegisteredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(989, 989, 989)
                    .addComponent(lblLoyalPointsDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerId)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerName)
                    .addComponent(lblCustomerNIC1)
                    .addComponent(cmbCustomerGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerContact)
                    .addComponent(txtCustomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerlName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerlName)
                    .addComponent(lblCustomerMail)
                    .addComponent(txtCustomerMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegisteredDate)
                    .addComponent(dcCusRegisteredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerNIC)
                    .addComponent(lblCustomerAddress)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoyalPoints))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(136, Short.MAX_VALUE)
                    .addComponent(lblLoyalPointsDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)))
        );

        jLabel2.setText("Search Customer Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackFromCus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExitFromCus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnCusAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCusEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCusDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnClearCusData, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCusAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearCusData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCusDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCusEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExitFromCus, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(btnBackFromCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
   // Click Back Button ---->  Move to Cashier Dashboard 
    private void btnBackFromCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackFromCusActionPerformed
                   
       String userID = lblUserID.getText();
        String designation = lblUserDesignnation.getText();
        
        if(designation.equals("Cashier"))
        {
            CashierDashboard cashDashboard = new CashierDashboard();
            CashierDashboard.lblUserDesignnation.setText(SingletonCustomerRegister.lblUserDesignnation.getText());
            CashierDashboard.lblUserID.setText(SingletonCustomerRegister.lblUserID.getText());
               
            cashDashboard.setVisible(true);
            dispose();
        }
        else
        { 
            AdminDashboard adminDashboard = new AdminDashboard();
            AdminDashboard.lblUserDesignnation.setText(SingletonCustomerRegister.lblUserDesignnation.getText());
            AdminDashboard.lblUserID.setText(SingletonCustomerRegister.lblUserID.getText());
          
            adminDashboard.setVisible(true);
            dispose();
        }
                    
    }//GEN-LAST:event_btnBackFromCusActionPerformed

    
    //Fill text field after click on a table raw
    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
       //Disabling Add button when updating customer details
        btnCusAdd.setEnabled(false);
        //----------RowFilter-------------------------------------------------------------------------------------------------------//
       
        d = (DefaultTableModel)tblCustomer.getModel();
        int selectIndex = tblCustomer.getSelectedRow();
        
        String customerSearch = txtSearchCustomer.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(d);
        tblCustomer.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(customerSearch));
        
//-----------------------------------------------------------------------------------------------------------------//
        
     
        
         //get value from jTable to jtext fileds
        txtCustomerId.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 0).toString());
        txtCustomerfName.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 1).toString());
        txtCustomerlName.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 2).toString());
        cmbCustomerGender.setSelectedItem(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 3).toString());
        txtCustomerNIC.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 4).toString());
        txtCustomerAddress.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 5).toString());
        txtCustomerContact.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 6).toString());
        txtCustomerMail.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 7).toString());
        
       //get value from jTable to jDateChooser
        //dcCusRegisteredDate.setDate((java.util.Date) tblCustomer.getValueAt(tblCustomer.getSelectedRow(),8));
       // dcCusRegisteredDate.setDate((java.util.Date) tblCustomer.getValueAt(tblCustomer.convertRowIndexToModel(selectIndex),8));
        
        dcCusRegisteredDate.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 9).toString());
       
    }//GEN-LAST:event_tblCustomerMouseClicked

    
    
    //Edit button
    private void btnCusEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCusEditActionPerformed
        
       

        String customerId = txtCustomerId.getText();
        String customerfName = txtCustomerfName.getText(); 
        String customerlName = txtCustomerlName.getText();
        String customerGender = cmbCustomerGender.getSelectedItem().toString();
        String customerNIC = txtCustomerNIC.getText();
        String customerAddress = txtCustomerAddress.getText();
        String customerContact = txtCustomerContact.getText();
        String customerMail = txtCustomerMail.getText();
        String cusRegDate = dcCusRegisteredDate.getText();
          
        try
        {
            //Using SingletonDataBaseConnection 
             Customer cus = new Customer(); 
             
             d = (DefaultTableModel)tblCustomer.getModel();
            int selectIndex = tblCustomer.getSelectedRow();
            
                    cus.setCustomerId(txtCustomerId.getText());
                    cus.setCustomerfName(txtCustomerfName.getText());
                    cus.setCustomerlName(txtCustomerlName.getText());
                    cus.setCustomerGender(cmbCustomerGender.getSelectedItem().toString());
                    cus.setCustomerNIC(txtCustomerNIC.getText());
                    cus.setCustomerAddress(txtCustomerAddress.getText());
                    cus.setCustomerContact(txtCustomerContact.getText());
                    cus.setCusRegDate(dcCusRegisteredDate.getText());
                    cus.setLoyalPoints(lblLoyalPointsDisplay.getText());
                    cus.setCustomerMail(txtCustomerMail.getText());
                    
             CustomerDaoImplementation cusDao = new CustomerDaoImplementation();
             cusDao.update(cus);
                    
            
        
       
            JOptionPane.showMessageDialog(null,"Customer Details Updated");
           // CustomerLoad();
          
            
            //Refreshing Table
             //CustomerLoad();
             //CustomerIdGen();
        }
        catch(Exception e)
                {
                  JOptionPane.showMessageDialog(null,e);
                }
        

    }//GEN-LAST:event_btnCusEditActionPerformed

    private void btnClearCusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCusDataActionPerformed
            
            //Disabling Add button when updating customer details
            btnCusAdd.setEnabled(true);
            
           
             //Clearing added data of the text fields after added customer details
            //txtCustomerId.setText("");
            txtCustomerfName.setText("");
            txtCustomerlName.setText("");
            cmbCustomerGender.setSelectedIndex(0);
            txtCustomerNIC.setText("");
            txtCustomerAddress.setText("");
            txtCustomerContact.setText("");
            txtCustomerMail.setText("");
           //JDateChooser Clearing 
           // dcCusRegisteredDate.setCalendar(null);
            
            dcCusRegisteredDate.setText("0"); 
            
            //Curser position move to CustomerID text field
            txtCustomerId.requestFocus();
            
            txtSearchCustomer.setText("");
             
            //Refreshing Table
             //CustomerLoad();
             //CustomerIdGen();
    }//GEN-LAST:event_btnClearCusDataActionPerformed

    
    
    
    //Delete details
    private void btnCusDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCusDeleteActionPerformed
        
        String customerId = txtCustomerId.getText();
        String customerfName = txtCustomerfName.getText();
        String customerlName = txtCustomerlName.getText();
        String customerGender = cmbCustomerGender.getSelectedItem().toString();
        String customerNIC = txtCustomerNIC.getText();
        String customerAddress = txtCustomerAddress.getText();
        String customerContact = txtCustomerContact.getText();
        String customerMail = txtCustomerMail.getText();
        String cusRegDate = dcCusRegisteredDate.getText();
        String loyalPoints = lblLoyalPointsDisplay.getText();

//---Delete confirmation dialog box--------------------------------------------------------------------// 
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete customer details?", "Delete", JOptionPane.YES_NO_OPTION);
        if (opt == 0)
      
//-----------------------------------------------------------------------------------------------------//      
  
    
            
        try {
            Customer cus = new Customer();
            
            d = (DefaultTableModel) tblCustomer.getModel();
            int selectIndex = tblCustomer.getSelectedRow();
            
            cus.setCustomerId(txtCustomerId.getText());
            CustomerDaoImplementation cusDao = new CustomerDaoImplementation();
            cusDao.delete(customerId);

            

           
            //pst.execute();
            JOptionPane.showMessageDialog(null, "Customer Details Deleted");
            //Refreshing Table
            //CustomerLoad();
            //CustomerIdGen();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnCusDeleteActionPerformed

    private void btnExitFromCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFromCusActionPerformed
          
    if (JOptionPane.showConfirmDialog( null,"Are you sure you want to exit the applicatiion?","KDH Fashions System Exit",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnExitFromCusActionPerformed

    //Searching customer details
    private void txtSearchCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchCustomerMouseClicked
     //Disabling Add button when updating customer details
        btnCusAdd.setEnabled(false);
        
        txtSearchCustomer.setText("");
    }//GEN-LAST:event_txtSearchCustomerMouseClicked

    //Search field
    private void txtSearchCustomerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCustomerKeyReleased
        
//Disabling Add button when updating customer details
btnCusAdd.setEnabled(false);
        
//----------RowFilter-------------------------------------------------------------------------------------------------------//
       
        d = (DefaultTableModel)tblCustomer.getModel();
        int selectIndex = tblCustomer.getSelectedRow();
        
        String customerSearch = txtSearchCustomer.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(d);
        tblCustomer.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(customerSearch));
        
//-----------------------------------------------------------------------------------------------------------------//
        
        
        
            

       
    }//GEN-LAST:event_txtSearchCustomerKeyReleased

    private void txtSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCustomerActionPerformed
     
    }//GEN-LAST:event_txtSearchCustomerActionPerformed

    private void btnCusAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCusAddActionPerformed

        String customerId = txtCustomerId.getText();
        String customerfName = txtCustomerfName.getText();
        String customerlName = txtCustomerlName.getText();
        String customerGender = cmbCustomerGender.getSelectedItem().toString();
        String customerNIC = txtCustomerNIC.getText();
        String customerAddress = txtCustomerAddress.getText();
        String customerContact = txtCustomerContact.getText();
        String customerMail = txtCustomerMail.getText();
        String cusRegDate = dcCusRegisteredDate.getText();
       
        
        String loyaltyPoints = lblLoyalPointsDisplay.getText();
        
       
                
                try
                {
                    Customer cus = new Customer();
                    cus.setCustomerId(txtCustomerId.getText());
                    cus.setCustomerfName(txtCustomerfName.getText());
                    cus.setCustomerlName(txtCustomerlName.getText());
                    cus.setCustomerGender(cmbCustomerGender.getSelectedItem().toString());
                    cus.setCustomerNIC(txtCustomerNIC.getText());
                    cus.setCustomerAddress(txtCustomerAddress.getText());
                    cus.setCustomerContact(txtCustomerContact.getText());
                    cus.setCusRegDate(dcCusRegisteredDate.getText());
                    cus.setLoyalPoints(lblLoyalPointsDisplay.getText());
                    cus.setCustomerMail(txtCustomerMail.getText());
                          
                    
                    CustomerDaoImplementation cusDao = new CustomerDaoImplementation();
                    cusDao.add(cus);

 
                  JOptionPane.showMessageDialog(null,"Successflly Added");       
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }

    }//GEN-LAST:event_btnCusAddActionPerformed

 
       
    
    
   
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
            java.util.logging.Logger.getLogger(SingletonCustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingletonCustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingletonCustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingletonCustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingletonCustomerRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBackFromCus;
    private javax.swing.JButton btnClearCusData;
    private javax.swing.JButton btnCusAdd;
    private javax.swing.JButton btnCusDelete;
    private javax.swing.JButton btnCusEdit;
    private javax.swing.JButton btnExitFromCus;
    private javax.swing.JComboBox<String> cmbCustomerGender;
    private javax.swing.JLabel dcCusRegisteredDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblCustomerAddress;
    private javax.swing.JLabel lblCustomerContact;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblCustomerMail;
    private javax.swing.JLabel lblCustomerNIC;
    private javax.swing.JLabel lblCustomerNIC1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerlName;
    private javax.swing.JLabel lblLoyalPoints;
    private javax.swing.JLabel lblLoyalPointsDisplay;
    private javax.swing.JLabel lblRegisteredDate;
    public static javax.swing.JLabel lblUserDesignnation;
    public static javax.swing.JLabel lblUserID;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerContact;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerMail;
    private javax.swing.JTextField txtCustomerNIC;
    private javax.swing.JTextField txtCustomerfName;
    private javax.swing.JTextField txtCustomerlName;
    private javax.swing.JTextField txtSearchCustomer;
    // End of variables declaration//GEN-END:variables
}
