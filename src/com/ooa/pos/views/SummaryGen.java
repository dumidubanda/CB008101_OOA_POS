
package com.ooa.pos.views;
import com.ooa.pos.singleton.SingletonDataBaseConnection;
import java.awt.Color;
import java.awt.Component;
import java.awt.List;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
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
import static javax.management.Query.or;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


public class SummaryGen extends javax.swing.JFrame {
        Connection con; 
        PreparedStatement pst;
        ResultSet rs;
        DefaultTableModel d;

    public SummaryGen() {
        initComponents();
        con=SingletonDataBaseConnection.connect();
        //TableColumnColorr();
       
     
    }
    
  public void TableColumnColorr()
  {
        DefaultTableCellRenderer rendar1 = new DefaultTableCellRenderer();
        rendar1.setBackground(Color.green);
        jTableStockDetails.getColumnModel().getColumn(4).setCellRenderer(rendar1);
        
  }
  
 
   
 


      

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnExitFromCashierReg = new javax.swing.JButton();
        btnBackFromCashierReg = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableRight = new javax.swing.JTable();
        btnRefreshSalesTable = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSalesDetailsLeft = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnSearchByDate = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblTotalCostByDate = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblSalesDate6 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblSalesDate5 = new javax.swing.JLabel();
        lblSalesDate7 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblSalesDate8 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl1TotalSalesValueByDate = new javax.swing.JLabel();
        lblSalesDate9 = new javax.swing.JLabel();
        lblSalesDate10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl1TotalProfitByDate = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbl11 = new javax.swing.JLabel();
        lblTotalProfitAll = new javax.swing.JLabel();
        lblTotalSalesValueAll = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lblTotalCostAll = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnExitFromCashierReg2 = new javax.swing.JButton();
        btnBackFromCashierReg2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        lbl8 = new javax.swing.JLabel();
        lblTotalEarnedPoints = new javax.swing.JLabel();
        lbl1NumberofCustomers = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        btnRefreshCustomerReports = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnExitFromCashierReg3 = new javax.swing.JButton();
        btnBackFromCashierReg3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStockDetails = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        lblStockItemsRecievedCount = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblRecievedStockValue = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblStockItemsAvailableCount = new javax.swing.JLabel();
        lblAvaillableStockValue = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTotalSoldItemCount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTotalSalesValueStock = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblProfit = new javax.swing.JLabel();
        btnRefreshStockTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 108, 254));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 230, 103));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reports");

        jTabbedPane1.setOpaque(true);

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

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder), "Sales Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        jTableRight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice Date", "Invoice ID", "Item ID", "Item Type", "Brand", "Size", "Stock Price", "Sales Price"
            }
        ));
        jScrollPane4.setViewportView(jTableRight);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRefreshSalesTable.setText("Refresh Tables");
        btnRefreshSalesTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshSalesTableActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder), "Sales Details Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        tblSalesDetailsLeft.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblSalesDetailsLeft.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Total", "Issued Date", "IssuedTime"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSalesDetailsLeft);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder), "Time Period", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("To");

        jDateChooser1.setToolTipText("Choose Date 1");
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jDateChooser2.setToolTipText("Choose Date 2");
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSearchByDate.setText("Search");
        btnSearchByDate.setToolTipText("Search ");
        btnSearchByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel24)
                        .addGap(83, 83, 83)
                        .addComponent(btnSearchByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTotalCostByDate.setBackground(new java.awt.Color(255, 255, 0));
        lblTotalCostByDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalCostByDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalCostByDate.setOpaque(true);

        lbl2.setBackground(new java.awt.Color(153, 153, 153));
        lbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Total Cost");
        lbl2.setOpaque(true);

        lblSalesDate6.setBackground(new java.awt.Color(204, 204, 204));
        lblSalesDate6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSalesDate6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalesDate6.setOpaque(true);

        jLabel26.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("To");
        jLabel26.setOpaque(true);

        lblSalesDate5.setBackground(new java.awt.Color(204, 204, 204));
        lblSalesDate5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSalesDate5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalesDate5.setOpaque(true);

        lblSalesDate7.setBackground(new java.awt.Color(204, 204, 204));
        lblSalesDate7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSalesDate7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalesDate7.setOpaque(true);

        jLabel27.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("To");
        jLabel27.setOpaque(true);

        lblSalesDate8.setBackground(new java.awt.Color(204, 204, 204));
        lblSalesDate8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSalesDate8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalesDate8.setOpaque(true);

        lbl13.setBackground(new java.awt.Color(153, 153, 153));
        lbl13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl13.setText("Total Sales Value");
        lbl13.setOpaque(true);

        lbl1TotalSalesValueByDate.setBackground(new java.awt.Color(255, 255, 0));
        lbl1TotalSalesValueByDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl1TotalSalesValueByDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1TotalSalesValueByDate.setOpaque(true);

        lblSalesDate9.setBackground(new java.awt.Color(204, 204, 204));
        lblSalesDate9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSalesDate9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalesDate9.setOpaque(true);

        lblSalesDate10.setBackground(new java.awt.Color(204, 204, 204));
        lblSalesDate10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSalesDate10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalesDate10.setOpaque(true);

        jLabel28.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("To");
        jLabel28.setOpaque(true);

        lbl15.setBackground(new java.awt.Color(255, 102, 102));
        lbl15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl15.setText("Total Profit");
        lbl15.setOpaque(true);

        lbl1TotalProfitByDate.setBackground(new java.awt.Color(255, 0, 0));
        lbl1TotalProfitByDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl1TotalProfitByDate.setForeground(new java.awt.Color(255, 255, 0));
        lbl1TotalProfitByDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1TotalProfitByDate.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblSalesDate5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblSalesDate6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalCostByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblSalesDate8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblSalesDate7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl1TotalSalesValueByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblSalesDate10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblSalesDate9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl1TotalProfitByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSalesDate10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalesDate9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(lbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbl1TotalProfitByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSalesDate8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSalesDate7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(lbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lbl1TotalSalesValueByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSalesDate5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSalesDate6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lblTotalCostByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl11.setBackground(new java.awt.Color(255, 102, 102));
        lbl11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11.setText("Total Profit");
        lbl11.setOpaque(true);

        lblTotalProfitAll.setBackground(new java.awt.Color(255, 0, 0));
        lblTotalProfitAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalProfitAll.setForeground(new java.awt.Color(255, 255, 0));
        lblTotalProfitAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalProfitAll.setOpaque(true);

        lblTotalSalesValueAll.setBackground(new java.awt.Color(255, 255, 0));
        lblTotalSalesValueAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalSalesValueAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalSalesValueAll.setOpaque(true);

        lbl9.setBackground(new java.awt.Color(153, 153, 153));
        lbl9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setText("Total Sales Value");
        lbl9.setOpaque(true);

        lbl7.setBackground(new java.awt.Color(153, 153, 153));
        lbl7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setText("Total Cost");
        lbl7.setOpaque(true);

        lblTotalCostAll.setBackground(new java.awt.Color(255, 255, 0));
        lblTotalCostAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalCostAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalCostAll.setOpaque(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalCostAll, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalSalesValueAll, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalProfitAll, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblTotalCostAll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblTotalSalesValueAll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblTotalProfitAll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRefreshSalesTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExitFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefreshSalesTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackFromCashierReg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sales Reports", jPanel2);

        btnExitFromCashierReg2.setText("Exit");
        btnExitFromCashierReg2.setToolTipText("Exit From Application");
        btnExitFromCashierReg2.setBorder(null);
        btnExitFromCashierReg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitFromCashierReg2ActionPerformed(evt);
            }
        });

        btnBackFromCashierReg2.setText("Back ");
        btnBackFromCashierReg2.setToolTipText("Back to Dash Board");
        btnBackFromCashierReg2.setBorder(null);
        btnBackFromCashierReg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackFromCashierReg2ActionPerformed(evt);
            }
        });

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

        lbl8.setBackground(new java.awt.Color(153, 153, 153));
        lbl8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setText("Total Points");
        lbl8.setOpaque(true);

        lblTotalEarnedPoints.setBackground(new java.awt.Color(255, 255, 0));
        lblTotalEarnedPoints.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalEarnedPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalEarnedPoints.setOpaque(true);

        lbl1NumberofCustomers.setBackground(new java.awt.Color(255, 255, 0));
        lbl1NumberofCustomers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl1NumberofCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1NumberofCustomers.setOpaque(true);

        lbl14.setBackground(new java.awt.Color(153, 153, 153));
        lbl14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl14.setText("Number of Customers Registered");
        lbl14.setOpaque(true);

        btnRefreshCustomerReports.setText("Refresh Tables");
        btnRefreshCustomerReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshCustomerReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRefreshCustomerReports, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl1NumberofCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalEarnedPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 610, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackFromCashierReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExitFromCashierReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefreshCustomerReports, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lblTotalEarnedPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lbl14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lbl1NumberofCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitFromCashierReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackFromCashierReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        jTabbedPane1.addTab("Loyal Customer Reports", jPanel4);

        btnExitFromCashierReg3.setText("Exit");
        btnExitFromCashierReg3.setToolTipText("Exit From Application");
        btnExitFromCashierReg3.setBorder(null);
        btnExitFromCashierReg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitFromCashierReg3ActionPerformed(evt);
            }
        });

        btnBackFromCashierReg3.setText("Back ");
        btnBackFromCashierReg3.setToolTipText("Back to Dash Board");
        btnBackFromCashierReg3.setBorder(null);
        btnBackFromCashierReg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackFromCashierReg3ActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder), "Stock Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        jTableStockDetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableStockDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Recieved Stock", "Stock Price", "Available Stock", "Sales Price", "Recieved Stock Total Value", "Number of Sold Items", "Available Stock Total Value", "Total Sales Value", "Profit"
            }
        ));
        jScrollPane2.setViewportView(jTableStockDetails);
        if (jTableStockDetails.getColumnModel().getColumnCount() > 0) {
            jTableStockDetails.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTableStockDetails.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTableStockDetails.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTableStockDetails.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTableStockDetails.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Total Stock Items Recieved");
        jLabel10.setOpaque(true);

        lblStockItemsRecievedCount.setBackground(new java.awt.Color(153, 153, 153));
        lblStockItemsRecievedCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStockItemsRecievedCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStockItemsRecievedCount.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Recieved Stock - Total Stock Value");
        jLabel11.setOpaque(true);

        lblRecievedStockValue.setBackground(new java.awt.Color(153, 153, 153));
        lblRecievedStockValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRecievedStockValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRecievedStockValue.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Total Stock Items Available");
        jLabel13.setOpaque(true);

        lblStockItemsAvailableCount.setBackground(new java.awt.Color(153, 153, 153));
        lblStockItemsAvailableCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStockItemsAvailableCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStockItemsAvailableCount.setOpaque(true);

        lblAvaillableStockValue.setBackground(new java.awt.Color(153, 153, 153));
        lblAvaillableStockValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAvaillableStockValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAvaillableStockValue.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Available Stock - Total Stock Value");
        jLabel12.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Total Sold Items ");
        jLabel14.setOpaque(true);

        lblTotalSoldItemCount.setBackground(new java.awt.Color(153, 153, 153));
        lblTotalSoldItemCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalSoldItemCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalSoldItemCount.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(255, 255, 102));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Total Sales Value");
        jLabel16.setOpaque(true);

        lblTotalSalesValueStock.setBackground(new java.awt.Color(255, 255, 0));
        lblTotalSalesValueStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalSalesValueStock.setForeground(new java.awt.Color(0, 0, 204));
        lblTotalSalesValueStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalSalesValueStock.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(255, 102, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Total Profit");
        jLabel17.setOpaque(true);

        lblProfit.setBackground(new java.awt.Color(255, 0, 0));
        lblProfit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProfit.setForeground(new java.awt.Color(255, 255, 0));
        lblProfit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProfit.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalSoldItemCount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblStockItemsRecievedCount, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                        .addComponent(lblStockItemsAvailableCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblRecievedStockValue, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblAvaillableStockValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblProfit, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                        .addComponent(lblTotalSalesValueStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(326, 638, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStockItemsRecievedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecievedStockValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStockItemsAvailableCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvaillableStockValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalSoldItemCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalSalesValueStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProfit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(0, 67, Short.MAX_VALUE))
        );

        btnRefreshStockTable.setText("Refresh Tables");
        btnRefreshStockTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshStockTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnRefreshStockTable, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackFromCashierReg3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExitFromCashierReg3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnRefreshStockTable, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitFromCashierReg3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackFromCashierReg3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );

        jTabbedPane1.addTab("Stock Reports", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnRefreshSalesTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshSalesTableActionPerformed
         TableColumnColorr();
        
        
//---------Left Hand Side Small Table SQL Quesry----------------------------------------------------------------//       
      try
      {  
            String sql= "SELECT * FROM invoice";
            pst=con.prepareStatement(sql);
            rs = pst.executeQuery();
            tblSalesDetailsLeft.setModel(DbUtils.resultSetToTableModel(rs));
      }  
      
      
      catch (SQLException ex) 
      {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(SummaryGen.class.getName()).log(Level.SEVERE, null, ex);
      }
      
//--------------------------------------------------------------------------------------//
        
//--------Refreshing Sales Report----------------------------------------------------------------//
 
        int c;
        try {
            pst = con.prepareStatement("SELECT * FROM item_has_invoice LEFT JOIN item ON item_num = item_id "
                    + "UNION "
                    + "SELECT * FROM item RIGHT JOIN item_has_invoice ON item_id = item_num WHERE item_id is null");
            //pst = con.prepareStatement("SELECT item_id, received_stock, stock_price_per_unit, available_quantity, selling_price FROM item");
            rs = pst.executeQuery();
           
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            d = (DefaultTableModel)jTableRight.getModel();
           
            d.setRowCount(0);
         
           //** While loop for load the data
            while(rs.next())
            {
              Vector v2 = new Vector();
              for(int i=1; i<=c; i++)
              {
              v2.add(rs.getString("invo_date"));
              v2.add(rs.getString("invoice_num"));
             
              v2.add(rs.getString("item_id"));
              v2.add(rs.getString("item_type"));
              v2.add(rs.getString("item_brand"));
              v2.add(rs.getString("item_size"));
              v2.add(rs.getString("stock_price_per_unit"));
              v2.add(rs.getString("selling_price"));

              }
              
              d.addRow(v2);
            }

             
        } catch (SQLException ex) {
            Logger.getLogger(SingletonStockManagment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
//--------------------------------------------------------------------------------------//
        
//-----Calculating All Total Cost--------------------------------------------------------//
   double cost = 0;  //Sales
           
            for (int y = 0; y < jTableRight.getRowCount(); y++)
            {
                cost += Double.parseDouble(jTableRight.getValueAt(y,6).toString()); //Calculating Sales Total in Sales Table
               
            }
            lblTotalCostAll.setText(""+cost);  //Display Total Sales value          
//-----------------------------------------------------------------------------//

//-----Calculating Total Sales Value --------------------------------------------------------//
            double salesValue = 0;  //Sales
           
            for (int y = 0; y < jTableRight.getRowCount(); y++)
            {
                salesValue+= Double.parseDouble(jTableRight.getValueAt(y,7).toString()); //Calculating Sales Total in Sales Table
               
            }
            lblTotalSalesValueAll.setText(""+salesValue);  //Display Total Sales value   
           
//-----------------------------------------------------------------------------//

//-----Calculating All Total Sales Profit --------------------------------------------------------//
            double totalSalesValue, profit, totalCost;
            totalSalesValue = Double.parseDouble(lblTotalSalesValueAll.getText());
            totalCost = Double.parseDouble(lblTotalCostAll.getText());
            profit = totalSalesValue - totalCost;
            lblTotalProfitAll.setText(Double.toString(profit));
          

//-----------------------------------------------------------------------------//




    }//GEN-LAST:event_btnRefreshSalesTableActionPerformed


    private void btnExitFromCashierRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFromCashierRegActionPerformed
        if (JOptionPane.showConfirmDialog( null,"Are you sure you want to exit the applicatiion?","KDH Fashions System Exit",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                System.exit(0);
    }//GEN-LAST:event_btnExitFromCashierRegActionPerformed

    private void btnBackFromCashierRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackFromCashierRegActionPerformed
       
        AdminDashboard adminDashboard = new AdminDashboard();
       
       
        adminDashboard.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_btnBackFromCashierRegActionPerformed

    private void btnExitFromCashierReg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFromCashierReg2ActionPerformed
       if (JOptionPane.showConfirmDialog( null,"Are you sure you want to exit the applicatiion?","KDH Fashions System Exit",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    System.exit(0);
    }//GEN-LAST:event_btnExitFromCashierReg2ActionPerformed

    private void btnBackFromCashierReg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackFromCashierReg2ActionPerformed
       AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.show();
        this.hide();
    }//GEN-LAST:event_btnBackFromCashierReg2ActionPerformed

    private void btnExitFromCashierReg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFromCashierReg3ActionPerformed
       if (JOptionPane.showConfirmDialog( null,"Are you sure you want to exit the applicatiion?","KDH Fashions System Exit",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    System.exit(0);
    }//GEN-LAST:event_btnExitFromCashierReg3ActionPerformed

    private void btnBackFromCashierReg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackFromCashierReg3ActionPerformed
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.show();
        this.hide();
    }//GEN-LAST:event_btnBackFromCashierReg3ActionPerformed

    private void btnRefreshStockTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshStockTableActionPerformed
        
       
       
        TableColumnColorr();
        
        int cc;
        try {
            pst = con.prepareStatement("SELECT item_id, received_stock, stock_price_per_unit, available_quantity, selling_price FROM item");
            rs = pst.executeQuery();
           
            ResultSetMetaData rsd = rs.getMetaData();
            cc = rsd.getColumnCount();
            d = (DefaultTableModel)jTableStockDetails.getModel();
           
            d.setRowCount(0);
         
           //** While loop for load the data
            while(rs.next())
            {
              Vector v2 = new Vector();
              for(int i=1; i<=cc; i++)
              {
              v2.add(rs.getString("item_id"));
              v2.add(rs.getString("received_stock"));
              v2.add(rs.getString("stock_price_per_unit"));
              v2.add(rs.getString("available_quantity"));
              v2.add(rs.getString("selling_price"));
             
              }
              
              d.addRow(v2);
            }

             
        } catch (SQLException ex) {
            Logger.getLogger(SingletonStockManagment.class.getName()).log(Level.SEVERE, null, ex);
        } 

//-----Calculating Recieved Stock Total Value price row by row--------------------------------------------------------//
            
            
            for (int y = 0; y < jTableStockDetails.getRowCount(); y++)
            {  
                Double a=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,1));
                Double b=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,2));
                Double c=a*b;
                
                jTableStockDetails.setValueAt(c,y,5);
                
            }
//-----------------------------------------------------------------------------//

//-----Calculating Sold Items Row by Row--------------------------------------------------------//
               //int multiply = 0;
            for (int y = 0; y < jTableStockDetails.getRowCount(); y++)
            {
                
                int a=Integer.parseInt ((String) jTableStockDetails.getValueAt (y,1));
                int b=Integer.parseInt  ((String) jTableStockDetails.getValueAt (y,3));
                int c=a-b;
                
                jTableStockDetails.setValueAt(c,y,6);
            }
 //-----------------------------------------------------------------------------//  
 
 //-----Available Stock Items Total Value Row by Row----------------------------------------//
           for (int y = 0; y < jTableStockDetails.getRowCount(); y++)
            {  
                Double stPrice=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,2));
                Double availStock=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,3));
                Double c=stPrice*availStock;
                
                jTableStockDetails.setValueAt(c,y,7);
                
            }
 //-----------------------------------------------------------------------------//
 
//-----Total Sales Value in Stock Side Row by Row----------------------------------------//
      
           for (int y = 0; y < jTableStockDetails.getRowCount(); y++)
            {  
                Double recievedStock=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,1));
                Double salesPrice=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,4));
                Double availableStock=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,3));
                
                
                Double salesValue =(recievedStock*salesPrice)-(availableStock*salesPrice);
                
                jTableStockDetails.setValueAt(salesValue,y,8);
                
            }
           
 //-----------------------------------------------------------------------------//   
 
 //-----Total Profit Calculating---------------------------------------//
     
            for (int y = 0; y < jTableStockDetails.getRowCount(); y++)
            {  
                Double recievedStock=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,1));
                Double salesPrice=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,4));
                Double availableStock=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,3));
                Double stockPrice=Double.parseDouble ((String) jTableStockDetails.getValueAt (y,2));
                
                Double salesStockPriceDif = (salesPrice-stockPrice);
                Double p = (salesStockPriceDif*recievedStock);
                Double q = (salesStockPriceDif*availableStock);
                Double profit =(p-q);
                
                jTableStockDetails.setValueAt(profit,y,9);
                
            }
 //-----------------------------------------------------------------------------//  
 

//-----Calculating Recieved Item quantity Total---------------------------------------//
//-----Calculating Available Item auqntity Total--------------------------------------//
//-----Calculating Total Sold Item Count--------------------------------------//

            int recievdStockQTY = 0; //Recieved Item quantity
            int availibaleStockQTY = 0; //Available Item quantity
            int numOfSoldItems = 0;
            
            double recievedStockValue = 0;
            double availabledStockValue = 0;
            double totalSalesValue = 0;
            
            double profit = 0;
            
            for (int y = 0; y < jTableStockDetails.getRowCount(); y++)
            {
                
                recievdStockQTY += Integer.parseInt(jTableStockDetails.getValueAt(y,1).toString()); //Calculating Recieved Item quantity Total in Stock Table 1
                availibaleStockQTY += Integer.parseInt(jTableStockDetails.getValueAt(y,3).toString()); //Calculating available Item auqntity Total in Stock Table 1
                numOfSoldItems += Integer.parseInt(jTableStockDetails.getValueAt(y,6).toString()); //Calculating number of Sold Items in Stock Table 2
                recievedStockValue += Double.parseDouble(jTableStockDetails.getValueAt(y,5).toString()); //Calculating Sales Total in Sales Table
                availabledStockValue += Double.parseDouble(jTableStockDetails.getValueAt(y,7).toString());
                totalSalesValue += Double.parseDouble(jTableStockDetails.getValueAt(y,8).toString());
                profit += Double.parseDouble(jTableStockDetails.getValueAt(y,9).toString());
            }
            
            lblStockItemsRecievedCount.setText(""+recievdStockQTY); //Display Recieved Item total quantity
            lblStockItemsAvailableCount.setText(""+availibaleStockQTY); //Display Available Item total quantity
            lblTotalSoldItemCount.setText(""+numOfSoldItems); //Display number of Sold Items
            lblRecievedStockValue.setText(""+recievedStockValue); //Display Total Stock Value Items
            lblAvaillableStockValue.setText(""+availabledStockValue);
            lblTotalSalesValueStock.setText(""+totalSalesValue);
            
            lblProfit.setText(""+profit);
            
//-----------------------------------------------------------------------------//


 
 

    }//GEN-LAST:event_btnRefreshStockTableActionPerformed

    private void btnSearchByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByDateActionPerformed
        
    
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String val1 = sdf.format(jDateChooser1.getDate());
        String val2 = sdf.format(jDateChooser2.getDate());
        
       // java.util.Date val1=jDateChooser1.getDate();
        //java.util.Date val2=jDateChooser2.getDate();
        
        
        //String val1 =jTextField1.getText();
        //String val2 = jTextField2.getText();
       
        if (jDateChooser1.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Choose Date");
        }
        else if(jDateChooser2.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Choose Date");
        }
        else
        {
            try
            {
               
               String sql= "SELECT * FROM"
                     + "("
                            + "SELECT * FROM "
                            + "item_has_invoice "
                            + "LEFT JOIN item ON item_num = item_id "
                            + "UNION "
                            + "SELECT * FROM item "
                            + "RIGHT JOIN item_has_invoice ON item_id = item_num WHERE item_id is null"
                     + ")"
                     + "item_has_invoice WHERE invo_date BETWEEN '"+val1+"' AND '"+val2+"'";
                pst=con.prepareStatement(sql);
               // pst.setDate( 1, val1 );
                //pst.setDate( 2, val2 );
                rs=pst.executeQuery();
               // tblSalesDetailsLeft.setModel(DbUtils.resultSetToTableModel(rs));
                jTableRight.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception ex)
            {
               JOptionPane.showMessageDialog(null,ex);
            }
        
       try
            {
               
               String sql="SELECT * FROM invoice WHERE invoice_date BETWEEN '"+val1+"' AND '"+val2+"' ";
                pst=con.prepareStatement(sql);
               // pst.setDate( 1, val1 );
                //pst.setDate( 2, val2 );
                rs=pst.executeQuery();
                tblSalesDetailsLeft.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception ex)
            {
               JOptionPane.showMessageDialog(null,ex);
            }
        
     
 }

         
//-----Calculating Total Cost Between Date Range-------------------------------------//

            double z = 0;
            for (int y = 0; y < jTableRight.getRowCount(); y++)
            {
                z+=Double.parseDouble(jTableRight.getValueAt(y,10).toString());
            }
            lblTotalCostByDate.setText(""+z);
            

//-----------------------------------------------------------------------------//

//-----Calculating Total Sales Value --------------------------------------------------------//
            double salesValue = 0;  //Sales
           
            for (int y = 0; y < jTableRight.getRowCount(); y++)
            {
                salesValue+= Double.parseDouble(jTableRight.getValueAt(y,11).toString()); //Calculating Sales Total in Sales Table
               
            }
            lbl1TotalSalesValueByDate.setText(""+salesValue);  //Display Total Sales value   
           
//-----------------------------------------------------------------------------//

//-----Calculating Total Sales Profit --------------------------------------------------------//
            double totalSalesValue, profit, totalCost;
            totalSalesValue = Double.parseDouble(lbl1TotalSalesValueByDate.getText());
            totalCost = Double.parseDouble(lblTotalCostByDate.getText());
            profit = totalSalesValue - totalCost;
            lbl1TotalProfitByDate.setText(Double.toString(profit));
          

//-----------------------------------------------------------------------------//
       
        
//Dsplating dates 
            lblSalesDate10.setText(val1);
            lblSalesDate8.setText(val1);
            lblSalesDate5.setText(val1);
            //lblSalesDate4.setText(val1);
            
            lblSalesDate9.setText(val2);
            lblSalesDate7.setText(val2);
            lblSalesDate6.setText(val2);
            //lblSalesDate3.setText(val2);
            
           
    }//GEN-LAST:event_btnSearchByDateActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
       

    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnRefreshCustomerReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshCustomerReportsActionPerformed
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
            Logger.getLogger(SingletonCustomerRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
       
//-----Calculating All Total Points-------------------------------------------------------//
        double pointsEarned = 0;  //Sales
           
            for (int y = 0; y < tblCustomer.getRowCount(); y++)
            {
                pointsEarned += Double.parseDouble(tblCustomer.getValueAt(y,9).toString()); //Calculating Sales Total in Sales Table
               
            }
            lblTotalEarnedPoints.setText(""+pointsEarned);  //Display Total Sales value          
//-----------------------------------------------------------------------------// 
        
  //-----Number of Registered Customers-------------------------------------------------------//
        
            DefaultTableModel t=(DefaultTableModel)tblCustomer.getModel();
            int number_of_rows = t.getRowCount();
            
            lbl1NumberofCustomers.setText(""+number_of_rows);        
//-----------------------------------------------------------------------------//       
        
        
        
    }//GEN-LAST:event_btnRefreshCustomerReportsActionPerformed

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
            java.util.logging.Logger.getLogger(SummaryGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummaryGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummaryGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummaryGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummaryGen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackFromCashierReg;
    private javax.swing.JButton btnBackFromCashierReg2;
    private javax.swing.JButton btnBackFromCashierReg3;
    private javax.swing.JButton btnExitFromCashierReg;
    private javax.swing.JButton btnExitFromCashierReg2;
    private javax.swing.JButton btnExitFromCashierReg3;
    private javax.swing.JButton btnRefreshCustomerReports;
    private javax.swing.JButton btnRefreshSalesTable;
    private javax.swing.JButton btnRefreshStockTable;
    private javax.swing.JButton btnSearchByDate;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableRight;
    private javax.swing.JTable jTableStockDetails;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl1NumberofCustomers;
    private javax.swing.JLabel lbl1TotalProfitByDate;
    private javax.swing.JLabel lbl1TotalSalesValueByDate;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblAvaillableStockValue;
    private javax.swing.JLabel lblProfit;
    private javax.swing.JLabel lblRecievedStockValue;
    private javax.swing.JLabel lblSalesDate10;
    private javax.swing.JLabel lblSalesDate5;
    private javax.swing.JLabel lblSalesDate6;
    private javax.swing.JLabel lblSalesDate7;
    private javax.swing.JLabel lblSalesDate8;
    private javax.swing.JLabel lblSalesDate9;
    private javax.swing.JLabel lblStockItemsAvailableCount;
    private javax.swing.JLabel lblStockItemsRecievedCount;
    private javax.swing.JLabel lblTotalCostAll;
    private javax.swing.JLabel lblTotalCostByDate;
    private javax.swing.JLabel lblTotalEarnedPoints;
    private javax.swing.JLabel lblTotalProfitAll;
    private javax.swing.JLabel lblTotalSalesValueAll;
    private javax.swing.JLabel lblTotalSalesValueStock;
    private javax.swing.JLabel lblTotalSoldItemCount;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblSalesDetailsLeft;
    // End of variables declaration//GEN-END:variables
}
