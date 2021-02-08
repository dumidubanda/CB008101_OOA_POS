
package com.ooa.pos.views;

import com.ooa.pos.commandpattern.Email;
import com.ooa.pos.commandpattern.EmailJob;
import com.ooa.pos.commandpattern.Sms;
import com.ooa.pos.commandpattern.SmsJob;
import com.ooa.pos.commandpattern.ThreadPool;
import com.ooa.pos.singleton.SingletonDataBaseConnection;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class CommandCashierRegistration extends javax.swing.JFrame {

            Connection con = null; //database connection//
            PreparedStatement pst = null;
            ResultSet rs;
            DefaultTableModel d;

            private ImageIcon format;
            String filename = null;
            byte[] person_image =null;
        
        
        public CommandCashierRegistration() {
            
            this.format = null;
        
            initComponents();
             con=SingletonDataBaseConnection.connect();
            
            CashierIdGen();
            CashierLoad();
         }
        
        String email;
            CommandCashierRegistration(String email) {
            this.format = null;
        
            email=email;
            initComponents();
            
    }
            
            

    public void CashierIdGen()
{
    try
    {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT MAX(user_id) FROM user");
        rs.next();
        rs.getString("MAX(user_id)");
            if(rs.getString("MAX(user_id)")==null)
        {
        lblCashierID.setText("CAS00001");
        }
        else
        {
        long customerId = Long.parseLong(rs.getString("MAX(user_id)").substring(3,rs.getString("MAX(user_id)").length()));
        customerId++;
        lblCashierID.setText("CAS" + String.format("%05d", customerId));
        }
        }
        catch (SQLException ex) {
        Logger.getLogger(CommandCashierRegistration.class.getName()).log(Level.SEVERE, null, ex);
}

}        
            
            
 public void CashierLoad()
   {
       int c;
        try {
            pst = con.prepareStatement("SELECT * FROM user");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            d = (DefaultTableModel)tblCashierRegi.getModel();
            d.setRowCount(0);
            
//** While loop for load the data
            while(rs.next())
            {
              Vector v2 = new Vector();
              for(int i=1; i<=c; i++)
              {
              v2.add(rs.getString("user_id"));
              v2.add(rs.getString("user_fname"));
              v2.add(rs.getString("user_lname"));
              v2.add(rs.getString("user_gender"));
              v2.add(rs.getString("user_nic"));
              v2.add(rs.getString("user_address"));
              v2.add(rs.getString("user_contactno"));
              v2.add(rs.getString("user_email"));
              v2.add(rs.getString("designation"));
              v2.add(rs.getDate("user_joined_date"));
              v2.add(rs.getString("username"));
              v2.add(rs.getString("password"));
              
              }
              
              d.addRow(v2);
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(CommandCashierRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
   }           
            
      void clearTextFields()
      {
       // TODO add your handling code here:
        txtfname.setText("");
        txtlname.setText("");
        txtnic.setText("");
        txtaddress.setText("");
        txtcontact.setText("");

        txtusername.setText("");
        txtemail.setText("");
        txtpassword.setText("");
        
        //Curser position move to Cashier ID text field
        lblCashierID.requestFocus();
      }
         
      void showDate()
  {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      java.util.Date d = new java.util.Date();
      dcCasRegisteredDate.setText(sdf.format(d));
     
  } 
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        cmbgender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmbdesignation = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        txtPasswordReEnter = new javax.swing.JPasswordField();
        lblCashierID = new javax.swing.JLabel();
        dcCasRegisteredDate = new javax.swing.JLabel();
        txtCashierSearch = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCashierRegi = new javax.swing.JTable();
        btnAddCashier = new javax.swing.JButton();
        btnEditCashier = new javax.swing.JButton();
        btnDeleteCashier = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnExitFromCashierReg = new javax.swing.JButton();
        btnBackFromCashierReg = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblUserDesignnation = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Cashier ID");

        txtfname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfname.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("First Name");

        txtlname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtlname.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("NIC");

        txtnic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnic.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });

        cmbgender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        cmbgender.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Gender");

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        txtcontact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcontact.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactActionPerformed(evt);
            }
        });

        txtaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaddress.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Address");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Contact");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("E-mail Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Join Date");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Authentication ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        cmbdesignation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbdesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Admin" }));
        cmbdesignation.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Designation");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Username ");

        txtusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Password");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Re-Enter Password");

        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        txtPasswordReEnter.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtusername)
                        .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(txtPasswordReEnter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordReEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        lblCashierID.setBackground(new java.awt.Color(0, 204, 204));
        lblCashierID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCashierID.setForeground(new java.awt.Color(0, 0, 153));
        lblCashierID.setText("Cashier ID");
        lblCashierID.setOpaque(true);

        dcCasRegisteredDate.setBackground(new java.awt.Color(204, 204, 204));
        dcCasRegisteredDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dcCasRegisteredDate.setText("Reg Date");
        dcCasRegisteredDate.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(31, 31, 31)
                        .addComponent(txtcontact))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(31, 31, 31)
                        .addComponent(txtaddress))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfname)
                            .addComponent(txtlname)
                            .addComponent(txtnic)
                            .addComponent(cmbgender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCashierID, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail)
                            .addComponent(dcCasRegisteredDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(294, 294, 294))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCashierID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dcCasRegisteredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        txtCashierSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashierSearch.setToolTipText("Search Bar");
        txtCashierSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        txtCashierSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashierSearchActionPerformed(evt);
            }
        });
        txtCashierSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashierSearchKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Search");

        tblCashierRegi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCashierRegi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cashier ID", "First Name", "Last Name", "Geneder", "NIC", "Address", "Contact", "Email", "Designation", "Join Date"
            }
        ));
        tblCashierRegi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCashierRegiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCashierRegi);

        btnAddCashier.setText("Add Account Details");
        btnAddCashier.setToolTipText("Add Account Details");
        btnAddCashier.setBorder(null);
        btnAddCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCashierActionPerformed(evt);
            }
        });

        btnEditCashier.setText("Update Account Details");
        btnEditCashier.setToolTipText("Update Account Details");
        btnEditCashier.setBorder(null);
        btnEditCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCashierActionPerformed(evt);
            }
        });

        btnDeleteCashier.setText("Delete Account Details");
        btnDeleteCashier.setToolTipText("Delete Account Details");
        btnDeleteCashier.setBorder(null);
        btnDeleteCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCashierActionPerformed(evt);
            }
        });

        btnclear.setText("Clear Text Fields");
        btnclear.setToolTipText("Clear Text Fields");
        btnclear.setBorder(null);
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnExitFromCashierReg.setText("Exit");
        btnExitFromCashierReg.setToolTipText("Exit From Application");
        btnExitFromCashierReg.setBorder(null);
        btnExitFromCashierReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitFromCashierRegActionPerformed(evt);
            }
        });

        btnBackFromCashierReg.setText("Back ");
        btnBackFromCashierReg.setToolTipText("Back to Dash Board");
        btnBackFromCashierReg.setBorder(null);
        btnBackFromCashierReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackFromCashierRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBackFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExitFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCashierSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnEditCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnDeleteCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCashierSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 108, 254));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 250, 207));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("User Accounts");

        jPanel15.setBackground(new java.awt.Color(0, 108, 254));

        lblUserDesignnation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUserDesignnation.setText("Designation");

        lblUserID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUserID.setText("User ID");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUserDesignnation, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(lblUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblUserDesignnation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserID)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtCashierSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashierSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCashierSearchActionPerformed

    private void txtCashierSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashierSearchKeyReleased
      
        
        //Disabling Add button when updating customer details
        btnAddCashier.setEnabled(false);
        
//----------RowFilter-------------------------------------------------------------------------------------------------------//
       
        d = (DefaultTableModel)tblCashierRegi.getModel();
        int selectIndex = tblCashierRegi.getSelectedRow();
        
        String customerSearch = txtCashierSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(d);
        tblCashierRegi.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(customerSearch));
        
//-----------------------------------------------------------------------------------------------------------------//
        
        
      
        try{
            String sql = "SELECT * FROM `user` WHERE `user_fname`= ?";
            pst=con.prepareStatement(sql);
            pst.setString(1, txtCashierSearch.getText());

            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("user_id");
                lblCashierID.setText(add1);
                String add2=rs.getString("user_fname");
                txtfname.setText(add2);
                String add3=rs.getString("user_lname");
                txtlname.setText(add3);
                String add4=rs.getString("user_id");
                lblCashierID.setText(add4);
                String add5=rs.getString("user_gender");
                cmbgender.setSelectedItem(add5);
                String add6=rs.getString("user_nic");
                txtnic.setText(add6);
                String add7=rs.getString("user_address");
                txtaddress.setText(add7);
                String add8=rs.getString("user_contactno");
                txtcontact.setText(add8);
                String add9=rs.getString("user_email");
                txtemail.setText(add9);
                String add10=rs.getString("designation");
                cmbdesignation.setSelectedItem(add10);
                String add11=rs.getString("user_joined_date");
                dcCasRegisteredDate.setText(add11);
                String add12=rs.getString("username");
                txtusername.setText(add12);
                String add13=rs.getString("password");
                txtpassword.setText(add13);

             
            }

        }
        catch(Exception ex){

            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_txtCashierSearchKeyReleased

    private void btnAddCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCashierActionPerformed
        // TODO add your handling code here:

        String Id = lblCashierID.getText();
        String fName = txtfname.getText();
        String lName = txtlname.getText();
        String Gender = cmbgender.getSelectedItem().toString();
        String NIC = txtnic.getText();
        String Address = txtaddress.getText();
        String Contact = txtcontact.getText();
        String Mail = txtemail.getText();
        String Designation = cmbdesignation.getSelectedItem().toString();

        String username= txtusername.getText();
        String Password=txtpassword.getText();
        String cusRegDate = dcCasRegisteredDate.getText();
       
        
//        final String FromEmail = "kdhfashions@gmail.com";
//        final String FromEmailPassword = "cb969801";
//        String Subjects = "KDH Fashions";
//
//        Properties properties = new Properties();
//
//        properties.put("mail.smtp.starttls.enable","true");
//        properties.put("mail.smtp.auth","true");
//        properties.put("mail.smtp.host","smtp.gmail.com");
//        properties.put("mail.smtp.port","587");
//
//        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator()
//            {
//                @Override
//                protected PasswordAuthentication getPasswordAuthentication()
//                {
//                    return new PasswordAuthentication(FromEmail,FromEmailPassword);
//                }
//
//            });

            // Data validation

            if (Id.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required field");
            }
            else if (fName.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required field");
            }
            else if (lName.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required field");
            }
            /*else if (Gender.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required field");
            }*/
            else if (NIC.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required fields");
            }
            else if(Address.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required fields");
            }
            else if(Contact.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required fields");
            }

            // contact validation
            else if (!(Pattern.matches("^\\d{10}$", txtcontact.getText())))
            {
                JOptionPane.showMessageDialog(null, "Please Eneter Valid Contact Number", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(Mail.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required fields");
            }
            else if (!(Pattern.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", txtemail.getText())))
            {
                JOptionPane.showMessageDialog(null, "Please Neter Valid Email", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(Designation.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required fields");
            }

            else if(username.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required fields");
            }
            else if(Password.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required fields");
            }
            
          
             else if (dcCasRegisteredDate.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Required field", "Error", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                 con=SingletonDataBaseConnection.connect();

                try{
                    String quarey = "INSERT INTO `user`(`user_id`, `user_fname`, `user_lname`, `user_gender`, `user_nic`, `user_address`, `user_contactno`, `user_email`, `designation`, `user_joined_date`, `username`, `password`,`user_image`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";   //sql query//
                    //databaseconnection//
                    pst=con.prepareStatement(quarey);
                    pst.setString(1,lblCashierID.getText());
                    pst.setString(2,txtfname.getText());
                    pst.setString(3,txtlname.getText());
                    pst.setString(4,cmbgender.getSelectedItem().toString());
                    pst.setString(5,txtnic.getText());
                    pst.setString(6,txtaddress.getText());
                    pst.setString(7,txtcontact.getText());
                    pst.setString(8,txtemail.getText());
                    pst.setString(9,cmbdesignation.getSelectedItem().toString()); //datapasing//
                    pst.setString(10,dcCasRegisteredDate.getText());
                    pst.setString(11,txtusername.getText());
                    pst.setString(12,txtpassword.getText());
                    pst.setString(13,person_image.toString());

                    //pst.setString(13,txtimage.getText());*/
                    pst.executeUpdate();
                    
                    //Command Pattern Email and SMS Sending Job
                    ThreadPool pool = new ThreadPool(10);

                    Email email = null;
                    EmailJob emailJob = new EmailJob();

                    Sms sms = null;
                    SmsJob smsJob = new SmsJob();

                    for (int i = 0; i < 5; i++) {
                        email = new Email();
                        emailJob.setEmail(email);

                        sms = new Sms();
                        smsJob.setSms(sms);

                        pool.addJob(emailJob);
                        pool.addJob(smsJob);

                    }
                    pool.shutdownPool();
                    
//                    //----Email------------------------------------------------------------------------------------------------//
//
//                    MimeMessage message = new MimeMessage(session);
//                    message.setFrom(new InternetAddress(FromEmail));
//                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(Mail));
//                    message.setSubject(Subjects);
//
//                    // This mail has 2 part, the BODY and the embedded image
//                    MimeMultipart multipart = new MimeMultipart("related");
//
//                    // first part (the html)
//                    BodyPart messageBodyPart = new MimeBodyPart();
//                    String htmlText = "<H1>Hello " + fName + " </H1> <H2>We are so excited that you have decided to join with us. Contact us at 081 2 818181 if you have any questions.</H2><img src=\"cid:image\">";
//
//                    messageBodyPart.setContent(htmlText, "text/html");
//                    // add it
//                    multipart.addBodyPart(messageBodyPart);
//
//                    // second part (the image)
//                    messageBodyPart = new MimeBodyPart();
//                    
//                     
//                    String filename = "C:\\Users\\Dumidu Bandara\\Documents\\NetBeansProjects\\ESA_FINAL_CB008101_CB008096_CB008098\\src\\com\\kdhfashions\\images\\welcome_image.jpg";
//                    DataSource fds = new FileDataSource(filename);
//                    
//                    /*DataSource fds = new FileDataSource(
//                        "/com.kdhfashions.images/welcome_image.jpg");
//                    */
//
//                    messageBodyPart.setDataHandler(new DataHandler(fds));
//                    messageBodyPart.setHeader("Content-ID", "<image>");
//
//                    // add image to the multipart
//                    multipart.addBodyPart(messageBodyPart);
//
//                    // put everything together
//                    message.setContent(multipart);
//                    // Send message
//                    Transport.send(message);
//
//                    //message.setText("Hi " + customerfName + "!");
//                    //message.setText( "We’re so excited that you’ve decided to join with us. You can expect to hear "
//                        //+ "from us with special offers, product updates, and more. Contact us at 081 2 818181 if you have any questions.");
//                    //Transport.send(message);

//----------------------------------------------------------------------------------------------------//

                    JOptionPane.showMessageDialog(null,"REGISTER SUCCESSFULLY");

                    CashierLoad();
                    CashierIdGen();
                    //email

                 
            clearTextFields();

                }
                catch(Exception ex){

                    JOptionPane.showMessageDialog(null,ex);
                }
            }
            
    
    
    }//GEN-LAST:event_btnAddCashierActionPerformed

    private void btnEditCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCashierActionPerformed
        // TODO add your handling code here:
        String Id = lblCashierID.getText();
        String fName = txtfname.getText();
        String lName = txtlname.getText();
        String Gender = cmbgender.getSelectedItem().toString();
        String NIC = txtnic.getText();
        String Address = txtaddress.getText();
        String Contact = txtcontact.getText();
        String Mail = txtemail.getText();
        String Designation = cmbdesignation.getSelectedItem().toString();

        String username= txtusername.getText();
        String Password=txtpassword.getText();

        String cusRegDate = dcCasRegisteredDate.getText();

        if (Id.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required field");
        }
        else if (fName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required field");
        }
        else if (lName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required field");
        }
        else if (Gender.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required field");
        }
        else if (NIC.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if(Address.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if(Contact.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }

        // contact validation
        else if (!(Pattern.matches("^\\d{10}$", txtcontact.getText())))
        {
            JOptionPane.showMessageDialog(null, "Please Eneter Valid Contact Number", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(Mail.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if (!(Pattern.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", txtemail.getText())))
        {
            JOptionPane.showMessageDialog(null, "Please Neter Valid Email", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(Designation.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }

        else if(username.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if(Password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }

        else{

             con=SingletonDataBaseConnection.connect();

            try{

                String sql ="UPDATE user SET user_id=?, user_fname=? , user_lname=? , user_gender=? , user_nic=? , user_address=? , user_contactno=? , user_email=? , designation=?,user_joined_date=? , username=? , password=?   WHERE user_id='"+Id+"'";

                d = (DefaultTableModel)tblCashierRegi.getModel();
                int selectIndex = tblCashierRegi.getSelectedRow();

                pst=con.prepareStatement(sql);
                pst.setString(1,lblCashierID.getText());
                pst.setString(2,txtfname.getText());
                pst.setString(3,txtlname.getText());
                pst.setString(4,cmbgender.getSelectedItem().toString());
                pst.setString(5,txtnic.getText());
                pst.setString(6,txtaddress.getText());
                pst.setString(7,txtcontact.getText());
                pst.setString(8,txtemail.getText());
                pst.setString(9,cmbdesignation.getSelectedItem().toString()); //datapasing//
                pst.setString(10,dcCasRegisteredDate.getText());  // date want to pass//
                pst.setString(11,txtusername.getText());
                pst.setString(12,txtpassword.getText());

                //pst.setByte(13,person_image());
                //pst.setString(13,txtimage.getText());//
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"UPDATE SUCCESSFULLY");

                btnAddCashier.setEnabled(true);

                clearTextFields();

                CashierLoad();
                CashierIdGen();
            }

            catch(Exception ex){

                JOptionPane.showMessageDialog(null,ex);

            }

        }
    }//GEN-LAST:event_btnEditCashierActionPerformed

    private void btnDeleteCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCashierActionPerformed
        // TODO add your handling code here:

        //delete data from the data base
        String id=lblCashierID.getText();
        String sql="DELETE FROM user WHERE user_id ='"+id+"'";

        try{
            pst=con.prepareStatement(sql);

            pst.execute();

            JOptionPane.showMessageDialog(null,"succesefully Delete");
            CashierLoad();
            CashierIdGen();

             clearTextFields();

        }
        catch(Exception ex){

            JOptionPane.showMessageDialog(null,ex);

        }

    }//GEN-LAST:event_btnDeleteCashierActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       
         clearTextFields();
        //Refreshing Table
        CashierIdGen();
        CashierLoad();
        
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnBackFromCashierRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackFromCashierRegActionPerformed
        AdminDashboard adminDashboard = new AdminDashboard();
        AdminDashboard.lblUserDesignnation.setText(CommandCashierRegistration.lblUserDesignnation.getText());
        AdminDashboard.lblUserID.setText(CommandCashierRegistration.lblUserID.getText());
        
        adminDashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackFromCashierRegActionPerformed

    private void btnExitFromCashierRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFromCashierRegActionPerformed
          if (JOptionPane.showConfirmDialog( null,"Are you sure you want to exit the applicatiion?","KDH Fashions System Exit",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnExitFromCashierRegActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void tblCashierRegiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCashierRegiMouseClicked
        
//----------RowFilter-------------------------------------------------------------------------------------------------------//
       
        d = (DefaultTableModel)tblCashierRegi.getModel();
        int selectIndex = tblCashierRegi.getSelectedRow();
        
        String customerSearch = txtCashierSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(d);
        tblCashierRegi.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(customerSearch));
        
//-----------------------------------------------------------------------------------------------------------------//
        
       // d = (DefaultTableModel)tblCustomer.getModel();
        //int selectIndex = tblCustomer.getSelectedRow();
        
         //get value from jTable to jtext fileds
        lblCashierID.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 0).toString());
        txtfname.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 1).toString());
        txtlname.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 2).toString());
        txtnic.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 3).toString());
        cmbgender.setSelectedItem(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 4).toString());
        txtaddress.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 5).toString());
        txtcontact.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 6).toString());
        txtemail.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 7).toString());
        dcCasRegisteredDate.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 8).toString());
        
       
        
        
    }//GEN-LAST:event_tblCashierRegiMouseClicked

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
            java.util.logging.Logger.getLogger(CommandCashierRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommandCashierRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommandCashierRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommandCashierRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommandCashierRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCashier;
    private javax.swing.JButton btnBackFromCashierReg;
    private javax.swing.JButton btnDeleteCashier;
    private javax.swing.JButton btnEditCashier;
    private javax.swing.JButton btnExitFromCashierReg;
    private javax.swing.JButton btnclear;
    private javax.swing.JComboBox<String> cmbdesignation;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JLabel dcCasRegisteredDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblCashierID;
    public static javax.swing.JLabel lblUserDesignnation;
    public static javax.swing.JLabel lblUserID;
    private javax.swing.JTable tblCashierRegi;
    private javax.swing.JTextField txtCashierSearch;
    private javax.swing.JPasswordField txtPasswordReEnter;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
