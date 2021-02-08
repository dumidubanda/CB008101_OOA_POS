
package com.ooa.pos.views;
import com.ooa.pos.singleton.SingletonDataBaseConnection;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Sales extends javax.swing.JFrame {
        Connection con; 
        PreparedStatement pst;
        ResultSet rs;
   
        
    public Sales() {
        initComponents();
        con = SingletonDataBaseConnection.connect();
        Billheder();
        invoiceIdGen();

        
        showDate();
        showTime();
        Billheder ();
       
    }
        
    //Auto incriment Id
    public void invoiceIdGen() {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(invoice_no) FROM  invoice");
            rs.next();
            rs.getString("MAX(invoice_no)");

            if (rs.getString("MAX(invoice_no)") == null) {
                lblInvoiceId.setText("INV00001");
            } else {
                long invoiceid = Long.parseLong(rs.getString("MAX(invoice_no)").substring(3, rs.getString("MAX(invoice_no)").length()));
                invoiceid++;
                lblInvoiceId.setText("INV" + String.format("%05d", invoiceid));
            }
        } catch (SQLException ex) {
            Object e;
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       


    
//---Bill Printing ---------------------------------------------------------------------------------------------------------/
    
     private void Billheder (){
    txtBill.setText(
    "Item ID\t"+"Item Name\t" +"Quantity\t" +"Sale Price\t" +"Discount\t" +"Net Amount\n" +
    "____________________________________________________________________________\n"
                );
       

    }

//-----------------------------------------------------------------------------------------------------------------------------//
     
//---Show date in lable-------------------------------------------------------------------------------------------------------//
  
  void showDate()
  {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      Date d = new Date();
      lblDateInvoice.setText(sdf.format(d));
      lblBillDate.setText(sdf.format(d));
  }   
   
//----------------------------------------------------------------------------------------------------------------------------//
  
//---Show time in lable-------------------------------------------------------------------------------------------------------//
  
  void showTime()
  {
      new Timer(0, new ActionListener()
      {
          @Override
          public void actionPerformed(ActionEvent e)
            {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                Date d = new Date();
                lblTimeInvoice.setText(sdf.format(d));
                lblBillTime.setText(sdf.format(d));
            }
      }).start();
      
  }   
   
//----------------------------------------------------------------------------------------------------------------------------//
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtSearchItem = new javax.swing.JTextField();
        btnSearchItem = new javax.swing.JButton();
        txtItemType = new javax.swing.JLabel();
        txtBuyingQuantity = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        btnAddBuyItemToBill = new javax.swing.JButton();
        jLabelAmount = new javax.swing.JLabel();
        jLabelQty = new javax.swing.JLabel();
        jLabelItType = new javax.swing.JLabel();
        txtItemBrand = new javax.swing.JLabel();
        jLabel1ItBrand = new javax.swing.JLabel();
        txtItemSize = new javax.swing.JLabel();
        jLabel1ItSize = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelSubTotal = new javax.swing.JLabel();
        txtSubTotalPrice = new javax.swing.JLabel();
        cmdPayementMethods = new javax.swing.JComboBox<>();
        jLabelPayMehod = new javax.swing.JLabel();
        jLabelPayedAmount = new javax.swing.JLabel();
        txtPayedAmount = new javax.swing.JTextField();
        txtBalance = new javax.swing.JLabel();
        jLabelBalance = new javax.swing.JLabel();
        btnCalculateBalance = new javax.swing.JButton();
        btnPrint1 = new javax.swing.JButton();
        jLabelRedeemedPoints = new javax.swing.JLabel();
        txtRedeemedPoints = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JLabel();
        txtItemDiscount = new javax.swing.JLabel();
        txtsaleprice = new javax.swing.JLabel();
        jLabelSalePrice = new javax.swing.JLabel();
        jLabeldiscount = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        txtitemid = new javax.swing.JLabel();
        lblitemid = new javax.swing.JLabel();
        btnRemoveSaleRow = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblInvoiceId = new javax.swing.JLabel();
        jLabel1InvoID = new javax.swing.JLabel();
        jLabel1Date = new javax.swing.JLabel();
        lblDateInvoice = new javax.swing.JLabel();
        lblTimeInvoice = new javax.swing.JLabel();
        jPaneBill = new javax.swing.JPanel();
        lblBillInvoice4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtBill = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblBillTime = new javax.swing.JLabel();
        lblBillDate = new javax.swing.JLabel();
        lblBillInvoice = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblBillUserID = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabelCurrentPoints = new javax.swing.JLabel();
        jLabelCusID = new javax.swing.JLabel();
        txtCusIDSearch = new javax.swing.JTextField();
        lblCustomerName = new javax.swing.JLabel();
        lblCustomerMail = new javax.swing.JLabel();
        lblCustomerNIC = new javax.swing.JLabel();
        btnCusSearch = new javax.swing.JButton();
        pointsToDataBase = new javax.swing.JButton();
        jLabelNewPoints = new javax.swing.JLabel();
        jLabelTotalPoints = new javax.swing.JLabel();
        lblCustomerfName = new javax.swing.JLabel();
        txtCustomerMail = new javax.swing.JLabel();
        txtCustomerNIC = new javax.swing.JLabel();
        lblCurrentPoints = new javax.swing.JLabel();
        lblNewPoints = new javax.swing.JLabel();
        lblTotalPoints = new javax.swing.JLabel();
        lblCustomerLastName = new javax.swing.JLabel();
        lblCustomerId = new javax.swing.JLabel();
        btnCusDataClear = new javax.swing.JButton();
        btnNewCustomerRegister = new javax.swing.JButton();
        btnSearchRegisteredCustomer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNewSaleReset = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblUserDesignnation = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        btnExitFromCashierReg = new javax.swing.JButton();
        btnBackFromCashierReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 108, 254));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 230, 103));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder), "Sales Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder));

        txtSearchItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchItem.setToolTipText("Type Item ID Here");
        txtSearchItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        txtSearchItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchItemKeyReleased(evt);
            }
        });

        btnSearchItem.setText("Search Item ID");
        btnSearchItem.setToolTipText("Search Item ID");
        btnSearchItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btnSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemActionPerformed(evt);
            }
        });

        txtItemType.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtItemType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemType.setToolTipText("Item Type");
        txtItemType.setOpaque(true);

        txtBuyingQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuyingQuantity.setToolTipText("Type Item Quantity ");
        txtBuyingQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtBuyingQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuyingQuantityActionPerformed(evt);
            }
        });
        txtBuyingQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuyingQuantityKeyReleased(evt);
            }
        });

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.setToolTipText("Amount");
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        btnAddBuyItemToBill.setText("Add");
        btnAddBuyItemToBill.setToolTipText("Item details added to bill");
        btnAddBuyItemToBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBuyItemToBillActionPerformed(evt);
            }
        });

        jLabelAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAmount.setText("Amount (Rs.)");
        jLabelAmount.setOpaque(true);

        jLabelQty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelQty.setText("Quantity");
        jLabelQty.setOpaque(true);

        jLabelItType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItType.setText("Item Type");
        jLabelItType.setOpaque(true);

        txtItemBrand.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtItemBrand.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemBrand.setToolTipText("Item Brand");
        txtItemBrand.setOpaque(true);

        jLabel1ItBrand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1ItBrand.setText("Item Brand");
        jLabel1ItBrand.setOpaque(true);

        txtItemSize.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtItemSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemSize.setToolTipText("Item Size");
        txtItemSize.setOpaque(true);

        jLabel1ItSize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1ItSize.setText("Item Size");
        jLabel1ItSize.setOpaque(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder));

        jLabelSubTotal.setBackground(new java.awt.Color(255, 102, 102));
        jLabelSubTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubTotal.setText("Sub Total  (Rs.)");
        jLabelSubTotal.setOpaque(true);

        txtSubTotalPrice.setBackground(new java.awt.Color(255, 51, 0));
        txtSubTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSubTotalPrice.setForeground(new java.awt.Color(255, 255, 0));
        txtSubTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSubTotalPrice.setToolTipText("Total");
        txtSubTotalPrice.setOpaque(true);
        txtSubTotalPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSubTotalPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSubTotalPriceKeyTyped(evt);
            }
        });

        cmdPayementMethods.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmdPayementMethods.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CashPayment", "Card Payment" }));
        cmdPayementMethods.setToolTipText("Payment Method");

        jLabelPayMehod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPayMehod.setText("Payment Method");
        jLabelPayMehod.setOpaque(true);

        jLabelPayedAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPayedAmount.setText("Payed Amount (Rs.)");
        jLabelPayedAmount.setOpaque(true);

        txtPayedAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPayedAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPayedAmount.setToolTipText("Type Payed Amount Here");
        txtPayedAmount.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtPayedAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayedAmountActionPerformed(evt);
            }
        });
        txtPayedAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPayedAmountKeyReleased(evt);
            }
        });

        txtBalance.setBackground(new java.awt.Color(51, 255, 51));
        txtBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBalance.setForeground(new java.awt.Color(255, 0, 0));
        txtBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtBalance.setToolTipText("Balance");
        txtBalance.setOpaque(true);

        jLabelBalance.setBackground(new java.awt.Color(153, 255, 153));
        jLabelBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelBalance.setText("Balance (Rs.)");
        jLabelBalance.setOpaque(true);

        btnCalculateBalance.setText("Calculate Balance");
        btnCalculateBalance.setToolTipText("Calculate Balance");
        btnCalculateBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateBalanceActionPerformed(evt);
            }
        });

        btnPrint1.setText("Print Bill");
        btnPrint1.setToolTipText("Printing Bill");
        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint1ActionPerformed(evt);
            }
        });

        jLabelRedeemedPoints.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRedeemedPoints.setText("Redeemd Points");
        jLabelRedeemedPoints.setOpaque(true);

        txtRedeemedPoints.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtRedeemedPoints.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRedeemedPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRedeemedPoints.setToolTipText("Item Size");
        txtRedeemedPoints.setOpaque(true);

        jLabelTotal.setBackground(new java.awt.Color(255, 255, 153));
        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTotal.setText("Total (Rs.)");
        jLabelTotal.setOpaque(true);

        txtTotal.setBackground(new java.awt.Color(255, 255, 0));
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setToolTipText("Item Size");
        txtTotal.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnCalculateBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrint1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelRedeemedPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRedeemedPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelPayMehod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPayedAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSubTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPayedAmount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubTotalPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdPayementMethods, 0, 322, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRedeemedPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRedeemedPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPayMehod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdPayementMethods, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPayedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPayedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculateBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtItemPrice.setBackground(new java.awt.Color(51, 204, 0));
        txtItemPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtItemPrice.setToolTipText("Item Price");
        txtItemPrice.setOpaque(true);

        txtItemDiscount.setBackground(new java.awt.Color(204, 204, 0));
        txtItemDiscount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemDiscount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtItemDiscount.setToolTipText("Discount Percentage");
        txtItemDiscount.setOpaque(true);

        txtsaleprice.setBackground(new java.awt.Color(255, 51, 255));
        txtsaleprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsaleprice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtsaleprice.setToolTipText("Discounted Price");
        txtsaleprice.setOpaque(true);

        jLabelSalePrice.setBackground(new java.awt.Color(255, 153, 255));
        jLabelSalePrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSalePrice.setText("Sale Price");
        jLabelSalePrice.setOpaque(true);

        jLabeldiscount.setBackground(new java.awt.Color(255, 204, 153));
        jLabeldiscount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeldiscount.setText("Discount (%)");
        jLabeldiscount.setOpaque(true);

        jLabelPrice.setBackground(new java.awt.Color(102, 255, 102));
        jLabelPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPrice.setText("Item Price (Rs.)");
        jLabelPrice.setOpaque(true);

        txtitemid.setBackground(new java.awt.Color(0, 255, 153));
        txtitemid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtitemid.setForeground(new java.awt.Color(0, 0, 204));
        txtitemid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtitemid.setToolTipText("Item ID");
        txtitemid.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txtitemid.setIconTextGap(10);
        txtitemid.setOpaque(true);

        lblitemid.setBackground(new java.awt.Color(204, 255, 255));
        lblitemid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblitemid.setText("Item ID");
        lblitemid.setOpaque(true);

        btnRemoveSaleRow.setText("Remove a Sale");
        btnRemoveSaleRow.setToolTipText("Remove a Sale From Bill");
        btnRemoveSaleRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSaleRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabelItType, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(txtItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel1ItSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1ItBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtItemSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtItemBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(jLabeldiscount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtItemDiscount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(txtsaleprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(btnRemoveSaleRow, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAddBuyItemToBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabelQty, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtBuyingQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelItType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1ItBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtItemBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1ItSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsaleprice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuyingQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBuyItemToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveSaleRow, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder));

        lblInvoiceId.setBackground(new java.awt.Color(0, 255, 255));
        lblInvoiceId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInvoiceId.setForeground(new java.awt.Color(0, 0, 153));
        lblInvoiceId.setOpaque(true);

        jLabel1InvoID.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1InvoID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1InvoID.setText("Invoice ID");
        jLabel1InvoID.setOpaque(true);

        jLabel1Date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Date.setText("Date");
        jLabel1Date.setOpaque(true);

        lblDateInvoice.setBackground(java.awt.Color.lightGray);
        lblDateInvoice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDateInvoice.setForeground(new java.awt.Color(0, 0, 153));
        lblDateInvoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDateInvoice.setOpaque(true);

        lblTimeInvoice.setBackground(java.awt.Color.lightGray);
        lblTimeInvoice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeInvoice.setForeground(new java.awt.Color(0, 0, 153));
        lblTimeInvoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimeInvoice.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1InvoID, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel1Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInvoiceId, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblDateInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTimeInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1InvoID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInvoiceId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDateInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTimeInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPaneBill.setBackground(new java.awt.Color(255, 255, 255));

        lblBillInvoice4.setBackground(new java.awt.Color(255, 255, 255));
        lblBillInvoice4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBillInvoice4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBillInvoice4.setText("Thank you for shopping at KDH Fashions");
        lblBillInvoice4.setOpaque(true);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("If you are not 100% satisfied with your purchase, we accept returns for items within 7 days of purchased date. We kindly ask that all items requested for return / exchange is not used, undamaged and unopened packaging. Items are expected to be in the exact same condition as when you received it, and is in the original box and/or packaging with all tags, if any. ");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(jTextArea1);

        txtBill.setColumns(20);
        txtBill.setRows(5);
        jScrollPane5.setViewportView(txtBill);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("The Fashions");
        jLabel7.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("No. 106/6,");
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Peradeniya Road,");
        jLabel14.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Kandy");
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("T.P. -  081 2 818181");
        jLabel17.setOpaque(true);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setOpaque(true);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Invoice No");
        jLabel21.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Date");
        jLabel22.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Time");
        jLabel23.setOpaque(true);

        lblBillTime.setBackground(new java.awt.Color(255, 255, 255));
        lblBillTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBillTime.setText("Time");
        lblBillTime.setOpaque(true);

        lblBillDate.setBackground(new java.awt.Color(255, 255, 255));
        lblBillDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBillDate.setText("Date");
        lblBillDate.setOpaque(true);

        lblBillInvoice.setBackground(new java.awt.Color(255, 255, 255));
        lblBillInvoice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBillInvoice.setText("Invoice No");
        lblBillInvoice.setOpaque(true);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Cahsier ID");
        jLabel28.setOpaque(true);

        lblBillUserID.setBackground(new java.awt.Color(255, 255, 255));
        lblBillUserID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBillUserID.setText("CashierID");
        lblBillUserID.setOpaque(true);

        javax.swing.GroupLayout jPaneBillLayout = new javax.swing.GroupLayout(jPaneBill);
        jPaneBill.setLayout(jPaneBillLayout);
        jPaneBillLayout.setHorizontalGroup(
            jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneBillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneBillLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPaneBillLayout.createSequentialGroup()
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblBillDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPaneBillLayout.createSequentialGroup()
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblBillTime, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPaneBillLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBillUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPaneBillLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBillInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(500, 500, 500))
                    .addGroup(jPaneBillLayout.createSequentialGroup()
                        .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblBillInvoice4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPaneBillLayout.setVerticalGroup(
            jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneBillLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPaneBillLayout.createSequentialGroup()
                        .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneBillLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(jPaneBillLayout.createSequentialGroup()
                                .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(lblBillInvoice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(lblBillDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(lblBillTime))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaneBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(lblBillUserID))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblBillInvoice4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder), "Loyal Customer Loyalty Points", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        jLabelCurrentPoints.setBackground(new java.awt.Color(204, 204, 204));
        jLabelCurrentPoints.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCurrentPoints.setText("Current Points");
        jLabelCurrentPoints.setOpaque(true);

        jLabelCusID.setBackground(new java.awt.Color(204, 255, 255));
        jLabelCusID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCusID.setText("Customer ID");
        jLabelCusID.setOpaque(true);

        txtCusIDSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCusIDSearch.setToolTipText("Type Loyal Customer  ID Here");
        txtCusIDSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        lblCustomerName.setBackground(new java.awt.Color(204, 204, 204));
        lblCustomerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerName.setText("First Name");
        lblCustomerName.setOpaque(true);

        lblCustomerMail.setBackground(new java.awt.Color(204, 204, 204));
        lblCustomerMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerMail.setText("E-Mail Address");
        lblCustomerMail.setOpaque(true);

        lblCustomerNIC.setBackground(new java.awt.Color(204, 204, 204));
        lblCustomerNIC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerNIC.setText("NIC");
        lblCustomerNIC.setOpaque(true);

        btnCusSearch.setText("Search Customer ID");
        btnCusSearch.setToolTipText("Search Customer ID");
        btnCusSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btnCusSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCusSearchbtnCusSearchActionPerformed(evt);
            }
        });

        pointsToDataBase.setText("Add Points ");
        pointsToDataBase.setToolTipText("Points Added to Data Base");
        pointsToDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsToDataBasepointsToDataBaseActionPerformed(evt);
            }
        });

        jLabelNewPoints.setBackground(new java.awt.Color(204, 204, 204));
        jLabelNewPoints.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNewPoints.setText("New Points");
        jLabelNewPoints.setOpaque(true);

        jLabelTotalPoints.setBackground(new java.awt.Color(204, 204, 204));
        jLabelTotalPoints.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTotalPoints.setText("Total Points");
        jLabelTotalPoints.setOpaque(true);

        lblCustomerfName.setBackground(new java.awt.Color(153, 153, 153));
        lblCustomerfName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCustomerfName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerfName.setToolTipText("Loyal Customer Fist Name");
        lblCustomerfName.setOpaque(true);

        txtCustomerMail.setBackground(new java.awt.Color(153, 153, 153));
        txtCustomerMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCustomerMail.setToolTipText("Loyal Customer E-Mail Address");
        txtCustomerMail.setOpaque(true);

        txtCustomerNIC.setBackground(new java.awt.Color(153, 153, 153));
        txtCustomerNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerNIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCustomerNIC.setToolTipText("Loyal Customer NIC");
        txtCustomerNIC.setOpaque(true);

        lblCurrentPoints.setBackground(new java.awt.Color(255, 255, 204));
        lblCurrentPoints.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCurrentPoints.setForeground(new java.awt.Color(0, 204, 0));
        lblCurrentPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrentPoints.setToolTipText("Loyal Customer Current Points");
        lblCurrentPoints.setOpaque(true);

        lblNewPoints.setBackground(new java.awt.Color(255, 255, 153));
        lblNewPoints.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNewPoints.setForeground(new java.awt.Color(0, 0, 204));
        lblNewPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewPoints.setToolTipText("Loyal Customer New Points");
        lblNewPoints.setOpaque(true);

        lblTotalPoints.setBackground(new java.awt.Color(255, 255, 153));
        lblTotalPoints.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalPoints.setForeground(new java.awt.Color(204, 0, 0));
        lblTotalPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPoints.setToolTipText("Loyal Customer New Points");
        lblTotalPoints.setOpaque(true);

        lblCustomerLastName.setBackground(new java.awt.Color(153, 153, 153));
        lblCustomerLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCustomerLastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerLastName.setToolTipText("Loyal Customer Last Name");
        lblCustomerLastName.setOpaque(true);

        lblCustomerId.setBackground(new java.awt.Color(0, 255, 153));
        lblCustomerId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerId.setForeground(new java.awt.Color(0, 0, 204));
        lblCustomerId.setToolTipText("Loyal Customer ID");
        lblCustomerId.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblCustomerId.setIconTextGap(10);
        lblCustomerId.setOpaque(true);

        btnCusDataClear.setText("Clear Fields");
        btnCusDataClear.setToolTipText("Reset Loyalty Points Section");
        btnCusDataClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCusDataClearActionPerformed(evt);
            }
        });

        btnNewCustomerRegister.setText("Register New Customer");
        btnNewCustomerRegister.setToolTipText("Begin new sale");
        btnNewCustomerRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCustomerRegistertxtresetActionPerformed(evt);
            }
        });

        btnSearchRegisteredCustomer.setText("Search Customer Details");
        btnSearchRegisteredCustomer.setToolTipText("Begin new sale");
        btnSearchRegisteredCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchRegisteredCustomertxtresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pointsToDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCusDataClear, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnNewCustomerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSearchRegisteredCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelTotalPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelNewPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelCusID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCustomerName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCustomerMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                        .addComponent(lblCustomerNIC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelCurrentPoints, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 0, 0)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblNewPoints, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCurrentPoints, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCustomerNIC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCustomerMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCustomerId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                                .addComponent(lblCustomerfName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCustomerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(lblTotalPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(txtCusIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCusSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNewCustomerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchRegisteredCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCusIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCusSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCusID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCustomerfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCurrentPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNewPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotalPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pointsToDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnCusDataClear, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnNewSaleReset.setText("New Sale");
        btnNewSaleReset.setToolTipText("Begin new sale");
        btnNewSaleReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSaleResettxtresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNewSaleReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNewSaleReset, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblUserDesignnation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUserDesignnation.setText("Designation");

        lblUserID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUserID.setText("User ID");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUserDesignnation, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(lblUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblUserDesignnation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserID)
                .addGap(16, 16, 16))
        );

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

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(btnBackFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExitFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneBill, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExitFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBackFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPaneBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//---Removing a Row in bill Table and Calculating new Total------------------------------------------------//
    private void btnRemoveSaleRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSaleRowActionPerformed
        
         //remove items
        double a = Double.parseDouble(txtItemPrice.getText());
        int Quantity = Integer.parseInt(txtBuyingQuantity.getText());
        double c = Double.parseDouble(txtItemDiscount.getText());
        double amt = a * Quantity;
        double discount = amt * c / 100;
        double Sale_price = amt - discount;
        total_amount = total_amount - Sale_price;
        txtsaleprice.setText("" + amt);
        txtAmount.setText("" + Sale_price);
        txtTotal.setText("" + total_amount);  
        
//-------------------Increasing available quantity---------------------//
        
        String itemid=txtitemid.getText();
        
        String sql = "UPDATE item SET available_quantity=available_quantity-? where item_id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(Quantity));
            pst.setString(2,itemid);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //total amount
        txtTotal.setText(Double.toString(total_amount));
        //sending informations to the text box
        txtBill.setText(txtBill.getText() + "\n" + txtitemid.getText() + "\t" + txtItemType.getText() 
                + "\t" + txtBuyingQuantity.getText() + "\t" + txtItemPrice.getText() + "\t" + txtItemDiscount.getText() + "\t" + "-" + txtAmount.getText());

   //-----------------------------------------------------------------------------------------------//
        
        
     //--Updating ivoice has item table----------------------------------------//
            
     
        try {
             String itemNum = txtitemid.getText();
             String sqlquery ="DELETE FROM item_has_invoice WHERE item_num='"+itemNum+"'";
            pst = con.prepareStatement(sqlquery);
           
           
            pst.execute();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //--------------------------------------------------------------//    
                //clear added data
        txtitemid.setText("");
        txtItemType.setText("");
        txtItemBrand.setText("");
        txtItemSize.setText("");
        txtItemPrice.setText("");
        txtItemDiscount.setText("");
        txtsaleprice.setText("");
        txtBuyingQuantity.setText("");
        txtAmount.setText("");

        //send curser to the beging 
        txtSearchItem.requestFocus();

    }//GEN-LAST:event_btnRemoveSaleRowActionPerformed

    private void btnCalculateBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateBalanceActionPerformed
        
        //finding the balance cash 
        double x, y, z;
        x = Double.parseDouble(txtPayedAmount.getText());
        y = Double.parseDouble(txtSubTotalPrice.getText());
            
        z = x - y;
        
        //Redeem Points
        
        txtBalance.setText(Double.toString(z));

        //print the total 
        txtBill.setText(txtBill.getText()   
                
                 + "\n" + 
                "Earned Points\t\t\t\t" + lblNewPoints.getText() 
                + "\n" + 
                "________________________________________________________________________________" 
               + "\n" + 
                "Total\t\t\t\t" + txtSubTotalPrice.getText() 
                + "\n" + 
                "________________________________________________________________________________" 
                + "\n" +  
                "Payed\t\t\t\t" + txtPayedAmount.getText() 
                + "\n" + 
                "________________________________________________________________________________" 
               + "\n" + 
                "Balance\t\t\t\t" + txtBalance.getText() 
                + "\n" + 
                "________________________________________________________________________________" 
                + "\n" + 
                "Payment Method\t" + cmdPayementMethods.getSelectedItem().toString());
                
    

    }//GEN-LAST:event_btnCalculateBalanceActionPerformed

    private void txtPayedAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayedAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayedAmountActionPerformed

    private void btnAddBuyItemToBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBuyItemToBillActionPerformed
     //discount genarating
        double a = Double.parseDouble(txtItemPrice.getText());
        int b = Integer.parseInt(txtBuyingQuantity.getText());
        double c = Double.parseDouble(txtItemDiscount.getText());
        double amt = a * b;
        double discount = amt * c / 100;
        double Sale_price = amt - discount;
        total_amount = total_amount + Sale_price;
        txtsaleprice.setText("" + amt);
        txtAmount.setText("" + Sale_price);

        
        txtTotal.setText("" + total_amount); 
    

 //----Reducing available quantity------------------------------------------------------------------//   
 
        String itemid=txtitemid.getText();     
        String sql = "UPDATE item SET available_quantity=available_quantity-? where item_id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(b));
            pst.setString(2,itemid);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //total amount
        txtTotal.setText(Double.toString(total_amount));
        //sending informations to the text box
        txtBill.setText(txtBill.getText() + "\n" + txtitemid.getText() + "\t" + txtItemType.getText() + "\t" + txtBuyingQuantity.getText() +
                "\t" + txtItemPrice.getText() + "\t" + txtItemDiscount.getText() + "\t" + txtAmount.getText());

//-------------------------------------------------------------------------------------------------------------------//
        
 //--Updating ivoice has item table----------------------------------------//
     
         String mysql = "INSERT INTO item_has_invoice(invoice_num, item_num, invo_date) VALUES (?,?,?)";
        try {
            pst = con.prepareStatement(mysql);
            pst.setString(1, lblInvoiceId.getText());
            pst.setString(2, txtitemid.getText());
            pst.setString(3, lblDateInvoice.getText());
           
            pst.execute();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
//--------------------------------------------------------------// 

 //--Customer Points----------------------------------------------------------------------------//

        double customerCurrentPoints=Double.parseDouble(lblCurrentPoints.getText());
        double total=Double.parseDouble(txtTotal.getText());
       
        //Amount of newly added points //1 Loyal point for Rs.1000/=
        double earnedPoints = total/1000;  
        //Redeem Points
        double redeemedPoints = (earnedPoints*5)/100;
        double newpoints = earnedPoints-redeemedPoints ;
        double redeemedPointsValue = redeemedPoints*1000;
        
        double subTotal = total-redeemedPointsValue;
        
        txtRedeemedPoints.setText(""+ redeemedPoints);
        lblNewPoints.setText(""+ newpoints);
        txtSubTotalPrice.setText(""+ subTotal);
        
        //Total points after adding New Earned Points
        double customerTotalPoints = customerCurrentPoints + newpoints;
        lblTotalPoints.setText(""+customerTotalPoints);
        
 //-----------------------------------------------------------------------------------------------------//




        //clear text fields
        txtitemid.setText("");
        txtItemType.setText("");
        txtItemBrand.setText("");
        txtItemSize.setText("");
        txtItemPrice.setText("");
        txtItemDiscount.setText("");
       // txtAmount.setText("");
        txtBuyingQuantity.setText("");
        //txtAmount.setText(""); 

        //send curser to the beging 
        txtSearchItem.requestFocus();
    }//GEN-LAST:event_btnAddBuyItemToBillActionPerformed
    double total_amount = 0;
    private void txtBuyingQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuyingQuantityKeyReleased
       
               
        
    }//GEN-LAST:event_txtBuyingQuantityKeyReleased

    private void txtBuyingQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuyingQuantityActionPerformed

    }//GEN-LAST:event_txtBuyingQuantityActionPerformed

    private void btnSearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchItemActionPerformed
        //search items from the data base
        try {
            Statement st = con.createStatement();
            String itemid = txtSearchItem.getText();

            String sql = "SELECT * FROM item WHERE item_id='" + itemid + "'";
            ResultSet rs = st.executeQuery(sql);

            if  (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "invalid item id");
            }
            String item_id = rs.getString("item_id");
            txtitemid.setText(item_id);
            
            String item_type = rs.getString("item_type");
            txtItemType.setText(item_type);
            
            String item_brand = rs.getString("item_brand");
            txtItemBrand.setText(item_brand);

            String item_size = rs.getString("item_size");
            txtItemSize.setText(item_size);

            String sales_price = rs.getString("item_price");
            txtItemPrice.setText(sales_price);
            
            String discount = rs.getString("discount");
            txtItemDiscount.setText(discount);
            
            //String salesPrice = rs.getString("selling_price");
            //txtsaleprice.setText(salesPrice);
            
           

            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        

    }//GEN-LAST:event_btnSearchItemActionPerformed

    private void txtSearchItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchItemKeyReleased
       
    }//GEN-LAST:event_txtSearchItemKeyReleased

    private void btnCusSearchbtnCusSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCusSearchbtnCusSearchActionPerformed

        String searchCustomerId = txtCusIDSearch.getText();

        if (searchCustomerId.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Customer ID");
        }
        else
        {
            try
            {
                Statement st = con.createStatement();
                String customerId = txtCusIDSearch.getText();

                String sql="SELECT * FROM loyalcustomer WHERE customer_id='"+customerId+"'";
                ResultSet rs=st.executeQuery(sql);

                if(rs.next()==false)
                {
                    JOptionPane.showMessageDialog(null,"Invalid ID");

                }

                String customer_id = rs.getString("customer_id");
                lblCustomerId.setText(customer_id);

                String customer_fname = rs.getString("customer_fname");
                lblCustomerfName.setText(customer_fname);

                String customer_lname = rs.getString("customer_lname");
                lblCustomerLastName.setText(customer_fname);

                String customerNIC = rs.getString("customer_nic");
                txtCustomerNIC.setText(customerNIC);

                String customerMail = rs.getString("customer_mail");
                txtCustomerMail.setText(customerMail);

                String customerPoints = rs.getString("loyal_points");
                lblCurrentPoints.setText(customerPoints);

            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }

        }
    }//GEN-LAST:event_btnCusSearchbtnCusSearchActionPerformed

    private void pointsToDataBasepointsToDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsToDataBasepointsToDataBaseActionPerformed

        //-----Update Loyal Customer Tabel---------------------------------------------------//

        String customerId = txtCusIDSearch.getText();

        String lblcustomerID = lblCustomerId.getText();
        String customerfName = lblCurrentPoints.getText();
        String customerlName = lblCurrentPoints.getText();
        String customerEmail = lblCurrentPoints.getText();
        String customerNIC = lblCurrentPoints.getText();

        String customerCurrentPoints = lblCurrentPoints.getText();  // The number of points currently available
        String customerNewPoints = lblNewPoints.getText();  // Amount of newly added points
        String customerTotalPoints = lblTotalPoints.getText();   //Newly added points + Current points

        if (lblcustomerID.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Customer ID Field is Empty");
        }
        else if (customerfName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Customer First Name is Empty");
        }
        else if (customerlName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Customer Last Name is Empty");
        }
        else if (customerEmail.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Customer E-mail is Empty");
        }
        else if (customerNIC.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Customer NIC is Empty");
        }
        else if (customerCurrentPoints.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Current Point Filed is Empty");
        }
        else if (customerNewPoints.equals(""))
        {
            JOptionPane.showMessageDialog(null, "No New Points Added");
        }
        else if (customerTotalPoints.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Total Points Field is Empty");
        }

        else
        {

            String sql="UPDATE loyalcustomer SET loyal_points=? WHERE customer_id='"+customerId+"'";
            try
            {

                pst=con.prepareStatement(sql);
                pst.setString(1,lblTotalPoints.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null,"Customer Points Updated");

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }

        //----------------------------------------------------------------------------------//
    }//GEN-LAST:event_pointsToDataBasepointsToDataBaseActionPerformed

    private void btnCusDataClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCusDataClearActionPerformed

        //Clearing fields in loyal customer point section
        txtCusIDSearch.setText("");
        lblCustomerId.setText("");
        lblCustomerfName.setText("");
        lblCustomerLastName.setText("");
        txtCustomerMail.setText("");
        txtCustomerNIC.setText("");

        lblCurrentPoints.setText("");
        lblNewPoints.setText("");
        lblTotalPoints.setText("");

    }//GEN-LAST:event_btnCusDataClearActionPerformed

    private void btnNewCustomerRegistertxtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCustomerRegistertxtresetActionPerformed
       
         //---Pasing dat to ---------------------------------------//
        SingletonCustomerRegister cusReg= new SingletonCustomerRegister();
        SingletonCustomerRegister.lblUserDesignnation.setText(Sales.lblUserDesignnation.getText());
        SingletonCustomerRegister.lblUserID.setText(Sales.lblUserID.getText());
        
        
        cusReg.setVisible(true);
        dispose();
        
        
       
    }//GEN-LAST:event_btnNewCustomerRegistertxtresetActionPerformed

    private void btnSearchRegisteredCustomertxtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchRegisteredCustomertxtresetActionPerformed
         SingletonCustomerRegister cusReg= new SingletonCustomerRegister();
        SingletonCustomerRegister.lblUserDesignnation.setText(Sales.lblUserDesignnation.getText());
        SingletonCustomerRegister.lblUserID.setText(Sales.lblUserID.getText());
        
        
        cusReg.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSearchRegisteredCustomertxtresetActionPerformed

    private void btnNewSaleResettxtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSaleResettxtresetActionPerformed

        //--- Confirmation before clear fields--------------------------------------------------------------------//

        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to clear details?",null,JOptionPane.YES_NO_OPTION);
        if(opt==0)

        //-----------------------------------------------------------------------------------------------------//

        //Clearing fields in LOYAL CUSTOMER POINTS section
        txtBill.setText("");
        txtCusIDSearch.setText("");
        lblCustomerId.setText("");
        lblCustomerfName.setText("");
        lblCustomerLastName.setText("");
        txtCustomerMail.setText("");
        txtCustomerNIC.setText("");
        txtAmount.setText("");
        lblCurrentPoints.setText("");
        lblNewPoints.setText("");
        lblTotalPoints.setText("");

        //Clearing fields in SALES section
        txtSearchItem.setText("");
        
        txtItemType.setText("");
        txtItemBrand.setText("");
        txtItemSize.setText("");
        txtItemPrice.setText("");
        txtItemDiscount.setText("");
        txtsaleprice.setText("");
        txtBuyingQuantity.setText("");
        txtAmount.setText("");
        txtSubTotalPrice.setText("");
        txtPayedAmount.setText("");
        txtBalance.setText("");
        txtTotal.setText("");
        txtRedeemedPoints.setText("");
     
        Billheder ();
        

        invoiceIdGen();
        total_amount = 0;

    }//GEN-LAST:event_btnNewSaleResettxtresetActionPerformed

    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed

      

        String total = txtSubTotalPrice.getText();

        if(total.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please calculate total");
        }
        else
        {

            //--------------------------------------------------------------------------------------//

            //--invoice data added to database--------------------------------------------------//

            String sql = "INSERT INTO invoice(invoice_no, total_amount, invoice_date, invoice_time) VALUES (?,?,?,?)";
            try
            {
                pst = con.prepareStatement(sql);
                pst.setString(1, lblInvoiceId.getText());
                pst.setString(2, txtSubTotalPrice.getText());
                pst.setString(3, lblDateInvoice.getText());
                pst.setString(4, lblTimeInvoice.getText());

                pst.execute();

                invoiceIdGen();

                JOptionPane.showMessageDialog(null, "Successfully added");

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            //---------------------------------------------------------------------------------------------//

            //--print--------------------------------------------------------------------------------------//

            PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Bill");

            job.setPrintable(new Printable()
                {
                    public int print(Graphics pg, PageFormat pf, int pageNum)
                    {
                        if(pageNum>0)
                        {
                            return Printable.NO_SUCH_PAGE;
                        }
                        Graphics2D g2 = (Graphics2D)pg;
                        g2.translate(pf.getImageableX(), pf.getImageableY());
                        g2.scale(1,1);

                        jPaneBill.paint(g2);
                        return Printable.PAGE_EXISTS;
                    }
                });

                boolean OK = job.printDialog();
                if(OK)
                {
                    try
                    {
                        job.print();
                    }
                    catch(PrinterException ex)
                    {

                    }
                }

            }

          
            /*     //clear added data

            lblItemId.setText("");
            txtPayedAmount.setText("");
            txtTotalPrice.setText("");
            txtBalance.setText("");
            txtItemType.setText("");
            txtItemBrand.setText("");
            txtItemSize.setText("");

            //send curser to the beging
            txtSearchItem.requestFocus();
            //add data to the database
            */
    }//GEN-LAST:event_btnPrint1ActionPerformed

    private void btnExitFromCashierRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFromCashierRegActionPerformed
        if (JOptionPane.showConfirmDialog( null,"Are you sure you want to exit the applicatiion?","KDH Fashions System Exit",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    System.exit(0);
    }//GEN-LAST:event_btnExitFromCashierRegActionPerformed

    private void btnBackFromCashierRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackFromCashierRegActionPerformed
        
       
        String designation = lblUserDesignnation.getText();
        
        if(designation.equals("Cashier"))
        {
            
            CashierDashboard cashDashboard = new CashierDashboard();
            CashierDashboard.lblUserDesignnation.setText(Sales.lblUserDesignnation.getText());
            CashierDashboard.lblUserID.setText(Sales.lblUserID.getText());
            
            
            cashDashboard.setVisible(true);
            dispose();
            
            
        }
        else
        { 
            AdminDashboard adminDashboard = new AdminDashboard();
            AdminDashboard.lblUserDesignnation.setText(Sales.lblUserDesignnation.getText());
            AdminDashboard.lblUserID.setText(Sales.lblUserID.getText());
            
            adminDashboard.setVisible(true);
            dispose();
        }
       
    }//GEN-LAST:event_btnBackFromCashierRegActionPerformed

    private void txtSubTotalPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubTotalPriceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalPriceKeyReleased

    private void txtPayedAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPayedAmountKeyReleased
      
    }//GEN-LAST:event_txtPayedAmountKeyReleased

    private void txtSubTotalPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubTotalPriceKeyTyped
      
    }//GEN-LAST:event_txtSubTotalPriceKeyTyped

 



//--------------------------------------------------------------------------------------------------------//
   
    
    
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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBuyItemToBill;
    private javax.swing.JButton btnBackFromCashierReg;
    private javax.swing.JButton btnCalculateBalance;
    private javax.swing.JButton btnCusDataClear;
    private javax.swing.JButton btnCusSearch;
    private javax.swing.JButton btnExitFromCashierReg;
    private javax.swing.JButton btnNewCustomerRegister;
    private javax.swing.JButton btnNewSaleReset;
    private javax.swing.JButton btnPrint1;
    private javax.swing.JButton btnRemoveSaleRow;
    private javax.swing.JButton btnSearchItem;
    private javax.swing.JButton btnSearchRegisteredCustomer;
    private javax.swing.JComboBox<String> cmdPayementMethods;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel1Date;
    private javax.swing.JLabel jLabel1InvoID;
    private javax.swing.JLabel jLabel1ItBrand;
    private javax.swing.JLabel jLabel1ItSize;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JLabel jLabelCurrentPoints;
    private javax.swing.JLabel jLabelCusID;
    private javax.swing.JLabel jLabelItType;
    private javax.swing.JLabel jLabelNewPoints;
    private javax.swing.JLabel jLabelPayMehod;
    private javax.swing.JLabel jLabelPayedAmount;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelQty;
    private javax.swing.JLabel jLabelRedeemedPoints;
    private javax.swing.JLabel jLabelSalePrice;
    private javax.swing.JLabel jLabelSubTotal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTotalPoints;
    private javax.swing.JLabel jLabeldiscount;
    private javax.swing.JPanel jPaneBill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblBillDate;
    private javax.swing.JLabel lblBillInvoice;
    private javax.swing.JLabel lblBillInvoice4;
    private javax.swing.JLabel lblBillTime;
    public static javax.swing.JLabel lblBillUserID;
    private javax.swing.JLabel lblCurrentPoints;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblCustomerLastName;
    private javax.swing.JLabel lblCustomerMail;
    private javax.swing.JLabel lblCustomerNIC;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerfName;
    private javax.swing.JLabel lblDateInvoice;
    private javax.swing.JLabel lblInvoiceId;
    private javax.swing.JLabel lblNewPoints;
    private javax.swing.JLabel lblTimeInvoice;
    private javax.swing.JLabel lblTotalPoints;
    public static javax.swing.JLabel lblUserDesignnation;
    public static javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblitemid;
    private javax.swing.JButton pointsToDataBase;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JLabel txtBalance;
    private javax.swing.JTextArea txtBill;
    private javax.swing.JTextField txtBuyingQuantity;
    private javax.swing.JTextField txtCusIDSearch;
    private javax.swing.JLabel txtCustomerMail;
    private javax.swing.JLabel txtCustomerNIC;
    private javax.swing.JLabel txtItemBrand;
    private javax.swing.JLabel txtItemDiscount;
    private javax.swing.JLabel txtItemPrice;
    private javax.swing.JLabel txtItemSize;
    private javax.swing.JLabel txtItemType;
    private javax.swing.JTextField txtPayedAmount;
    private javax.swing.JLabel txtRedeemedPoints;
    private javax.swing.JTextField txtSearchItem;
    private javax.swing.JLabel txtSubTotalPrice;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtitemid;
    private javax.swing.JLabel txtsaleprice;
    // End of variables declaration//GEN-END:variables
}
