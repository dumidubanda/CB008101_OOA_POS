
package com.ooa.pos.views;

import com.ooa.pos.singleton.Customer;
import com.ooa.pos.singleton.Stock;
import com.ooa.pos.singleton.CustomerDaoImplementation;
import com.ooa.pos.singleton.StockDaoImplementation;
import com.ooa.pos.singleton.SingletonDataBaseConnection;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SingletonStockManagment extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;
    
   
    public SingletonStockManagment() {
        initComponents();
        //con=SingletonDataBaseConnection.connect();
       // additemsLoad();
        
       // ItemIdGen();
       // itemIdGen();
      
    }
    
    
    
//     //auto increment id code
//        
//     public void ItemIdGen()
//   {
//       try
//       {
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("SELECT MAX(item_id) FROM item");
//            rs.next();
//            rs.getString("MAX(item_id)");
//            
//            if(rs.getString("MAX(item_id)")==null)
//            {
//                labelItemId.setText("ITM00001");
//                
//            }
//            else
//            {
//                long customerId = Long.parseLong(rs.getString("MAX(item_id)").substring(3,rs.getString("MAX(item_id)").length()));
//                customerId++;
//                labelItemId.setText("ITM" + String.format("%05d", customerId));
//                
//            }
//        }
//       
//     catch (SQLException ex) {
//            Logger.getLogger(StockManagment.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//       
//       
//   }
//     
//     
//     //Adding Item to Jtable
//   public void additemsLoad()
//   {
//       int c;
//        try {
//            pst = con.prepareStatement("SELECT * FROM  item");
//            rs = pst.executeQuery();
//           
//            ResultSetMetaData rsd = rs.getMetaData();
//            c = rsd.getColumnCount();
//            d = (DefaultTableModel)tblAddItems.getModel();
//         
//            d.setRowCount(0);
//            
//           
////** While loop for load the data
//            while(rs.next())
//            {
//              Vector v2 = new Vector();
//              for(int i=1; i<=c; i++)
//              {
//              v2.add(rs.getString("item_id"));
//              v2.add(rs.getString("item_brand"));
//              v2.add(rs.getString("item_type"));
//              v2.add(rs.getString("item_size"));
//              v2.add(rs.getString("received_stock"));
//              v2.add(rs.getString("available_quantity"));
//              v2.add(rs.getString("stock_price_per_unit"));
//              v2.add(rs.getString("item_price"));
//              v2.add(rs.getString("discount"));
//              v2.add(rs.getString("selling_price"));
//                                      
//              }
//             
//             d.addRow(v2);
//             
//            }
//             
//        } catch (SQLException ex) {
//            Logger.getLogger(StockManagment.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnBackFromItem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbsize = new javax.swing.JComboBox<>();
        cmbbrand = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelItemId = new javax.swing.JLabel();
        cmdItemType = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        labelStockPrice = new javax.swing.JTextField();
        txtItemprice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtItemDiscountPercent = new javax.swing.JTextField();
        txtDiscountedPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRecievedStock = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAvailableQuan = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnExitFromItem = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddItems = new javax.swing.JTable();
        txtSearchItem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnEditItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        btnClearCusData = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        lblUserDesignnation = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 108, 254));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 230, 103));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stock Management");

        jTabbedPane1.setToolTipText("Update Previously Added Item Stock");
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBackFromItem.setText("Back");
        btnBackFromItem.setToolTipText("Back to Dash Board");
        btnBackFromItem.setBorder(null);
        btnBackFromItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackFromItemActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Item ID");
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item Type");

        cmbsize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbsize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));

        cmbbrand.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbbrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nike ", "Adidas", "Puma ", "Hugo", "Boss", "Calvin Klein", "Levi's" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Item Brand");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Item Size");

        labelItemId.setBackground(new java.awt.Color(0, 255, 255));
        labelItemId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelItemId.setForeground(new java.awt.Color(0, 0, 153));
        labelItemId.setText("Item ID");
        labelItemId.setOpaque(true);

        cmdItemType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmdItemType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Denim Jeans", "T-Shirts", "Shirts", "Chinos Trousers", "Jackets", "Hoodies", "Shorts", "Three Quarter Pants", "Belts", "Blazer", "Neckties", "Boots", "Sneakers", "Dress Shoes", " " }));

        jLabel14.setBackground(new java.awt.Color(204, 255, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Stock Price Per Unit");
        jLabel14.setOpaque(true);

        labelStockPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelStockPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        labelStockPrice.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        txtItemprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtItemprice.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel7.setBackground(new java.awt.Color(153, 255, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Sale Price Per Unit (Rs.)");
        jLabel7.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Discount (%)");

        txtItemDiscountPercent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemDiscountPercent.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtItemDiscountPercent.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtItemDiscountPercent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemDiscountPercentKeyReleased(evt);
            }
        });

        txtDiscountedPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiscountedPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiscountedPrice.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Discounted Price (Rs.)");

        txtRecievedStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRecievedStock.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtRecievedStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRecievedStockKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Recieved Stock");

        txtAvailableQuan.setBackground(java.awt.SystemColor.controlHighlight);
        txtAvailableQuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAvailableQuan.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Available Quantity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addComponent(txtRecievedStock, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtDiscountedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtItemprice, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtItemDiscountPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(labelStockPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbsize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmdItemType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAvailableQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecievedStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailableQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStockPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemprice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemDiscountPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiscountedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        btnExitFromItem.setText("Exit");
        btnExitFromItem.setToolTipText("Exit From Application");
        btnExitFromItem.setBorder(null);
        btnExitFromItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitFromItemActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), java.awt.SystemColor.activeCaptionBorder)); // NOI18N

        tblAddItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Brand", "Item Type", "Item Size", "Recieved Stock", "Available Quantity", "Stock Price", "Sale Price", "Discount", "Discounted Price"
            }
        ));
        tblAddItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAddItems);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtSearchItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchItem.setToolTipText("Search Item ID");
        txtSearchItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        txtSearchItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchItemMouseClicked(evt);
            }
        });
        txtSearchItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchItemKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Search Item Details");

        btnAddItem.setText("Add New Stock Item ");
        btnAddItem.setToolTipText("Add New Item ");
        btnAddItem.setBorder(null);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnEditItem.setText("Edit Stock Item Details");
        btnEditItem.setToolTipText("Update Item Details");
        btnEditItem.setBorder(null);
        btnEditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditItemActionPerformed(evt);
            }
        });

        btnDeleteItem.setText("Delete Stock Item Details ");
        btnDeleteItem.setToolTipText("Delete Item Details ");
        btnDeleteItem.setBorder(null);
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditItem, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearCusData, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackFromItem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExitFromItem, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBackFromItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExitFromItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnClearCusData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add New Stock Item", jPanel5);

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
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblUserDesignnation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserID)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitFromItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFromItemActionPerformed
        if (JOptionPane.showConfirmDialog( null,"Are you sure you want to exit the applicatiion?","KDH Fashions System Exit",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    System.exit(0);
    }//GEN-LAST:event_btnExitFromItemActionPerformed

    private void txtItemDiscountPercentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemDiscountPercentKeyReleased

        //----Calculating Discounted Price---------------------------------------------------------//

        double itemPrice = Double.parseDouble(txtItemprice.getText());
        double itemDiscountPercentage = Double.parseDouble(txtItemDiscountPercent.getText());
        double discountedPrice = itemPrice-(itemPrice*itemDiscountPercentage/100);
        txtDiscountedPrice.setText(""+discountedPrice);

        //----------------------------------------------------------------------------------------------------//
    }//GEN-LAST:event_txtItemDiscountPercentKeyReleased

    private void btnBackFromItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackFromItemActionPerformed
         String userID = lblUserID.getText();
        String designation = lblUserDesignnation.getText();
        
        if(designation.equals("Cashier"))
        {
            CashierDashboard cashDashboard = new CashierDashboard();
            CashierDashboard.lblUserDesignnation.setText(SingletonStockManagment.lblUserDesignnation.getText());
            CashierDashboard.lblUserID.setText(SingletonStockManagment.lblUserID.getText());
               
            cashDashboard.setVisible(true);
            dispose();
        }
        else
        { 
            AdminDashboard adminDashboard = new AdminDashboard();
            AdminDashboard.lblUserDesignnation.setText(SingletonStockManagment.lblUserDesignnation.getText());
            AdminDashboard.lblUserID.setText(SingletonStockManagment.lblUserID.getText());
              
            adminDashboard.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnBackFromItemActionPerformed

//Fill text field after click on a table raw
    private void tblAddItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddItemsMouseClicked
      

        d = (DefaultTableModel)tblAddItems.getModel();
        int selectIndex = tblAddItems.getSelectedRow();

        String itemSearch = txtSearchItem.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(d);
        tblAddItems.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(itemSearch));

        //get value from jTable to jtext fileds
        labelItemId.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 0).toString());
        cmbbrand.setSelectedItem(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 1).toString());
        cmdItemType.setSelectedItem(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 2).toString());
        cmbsize.setSelectedItem(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 3).toString());
        txtRecievedStock.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 4).toString()); 
        txtAvailableQuan.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 5).toString());
        labelStockPrice.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 6).toString());
        txtItemprice.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 7).toString());
        txtItemDiscountPercent.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 8).toString());
        txtDiscountedPrice.setText(d.getValueAt(tr.convertRowIndexToModel(selectIndex), 9).toString());
    }//GEN-LAST:event_tblAddItemsMouseClicked

    private void txtSearchItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchItemKeyReleased

        //----------RowFilter-------------------------------------------------------------------------------------------------------//

        d = (DefaultTableModel)tblAddItems.getModel();
        //int selectIndex = tblCustomer.getSelectedRow();

        String customerSearch = txtSearchItem.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(d);
        tblAddItems.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(customerSearch));

        //-----------------------------------------------------------------------------------------------------------------//

        //Disabling Add button when updating customer details
        btnAddItem.setEnabled(false);
    }//GEN-LAST:event_txtSearchItemKeyReleased

//Searching Item details
    private void txtSearchItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchItemMouseClicked
        //Disabling Add button when updating customer details
        btnAddItem.setEnabled(false);

        txtSearchItem.setText("");
    }//GEN-LAST:event_txtSearchItemMouseClicked

    private void btnEditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditItemActionPerformed

        //Disabling Add button and quantity text field when updating customer details
        btnAddItem.setEnabled(false);

        //edit the data in the data base

        String itemId=labelItemId.getText();
        String itemType=cmdItemType.getSelectedItem().toString();
        String itemBrand=cmbbrand.getSelectedItem().toString();
        String itemSize =cmbsize.getSelectedItem().toString();
        String recievedStock=txtRecievedStock.getText();
        String avilQuantity=txtAvailableQuan.getText();
        String stockPrice=labelStockPrice.getText();
        String price=txtItemprice.getText();
        String discount=txtItemDiscountPercent.getText();
        String discountedPrice=txtDiscountedPrice.getText();

       
            try
            {
                Stock stk = new Stock();

                d = (DefaultTableModel) tblAddItems.getModel();
                int selectIndex = tblAddItems.getSelectedRow();

                stk.setItemId(labelItemId.getText());
                stk.setItemBrand(cmbbrand.getSelectedItem().toString());
                stk.setItemType(cmdItemType.getSelectedItem().toString());
                stk.setItemSize(cmbsize.getSelectedItem().toString());
                stk.setRecievedStock(txtRecievedStock.getText());
                stk.setAvilQuantity(txtAvailableQuan.getText());
                stk.setStockPrice(labelStockPrice.getText());
                stk.setPrice(txtItemprice.getText());
                stk.setDiscount(txtItemDiscountPercent.getText());
                stk.setDiscountedPrice(txtDiscountedPrice.getText());

                StockDaoImplementation cusDao = new StockDaoImplementation();
                cusDao.update(stk);

                JOptionPane.showMessageDialog(null, "successfully updated");
                

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }

        

       
    }//GEN-LAST:event_btnEditItemActionPerformed

//GEN-FIRST:event_btnresetActionPerformed
 
//GEN-LAST:event_btnresetActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        //delete data from the data base
        String id=labelItemId.getText();
        String sql="DELETE  FROM  item WHERE item_id ='"+id+"'";

        //display a message when deleting items(Are you sure to delete customer details?)
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete customer details?","Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0)

        try
        {

            pst=con.prepareStatement(sql);

            pst.execute();

            JOptionPane.showMessageDialog(null,"Succesefully Delete");
//            additemsLoad();
//            
//            ItemIdGen();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

        //clear added data
        // txtid.setText("");
        cmdItemType.setSelectedIndex(-1);
        cmbbrand.setSelectedIndex(-1);
        cmbsize.setSelectedIndex(-1);
        txtRecievedStock.setText("");
        txtAvailableQuan.setText("");
        txtItemprice.setText("");
        txtItemDiscountPercent.setText("");
        txtDiscountedPrice.setText("");
        //labelStockPrice.setText("");

        //send curser to the beging
        labelItemId.requestFocus();
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed

        
        
        String id=labelItemId.getText();
        String itemType=cmdItemType.getSelectedItem().toString();
        String brand=cmbbrand.getSelectedItem().toString();
        String size =cmbsize.getSelectedItem().toString();
        String recievedStock=txtRecievedStock.getText();
        String availQuantity=txtAvailableQuan.getText();
        String stockPrice=labelStockPrice.getText();
        String price=txtItemprice.getText();
        String discount=txtItemDiscountPercent.getText();
        String discountedPrice=txtDiscountedPrice.getText();

       

            String sql="INSERT INTO item VALUES (?,?,?,?,?,?,?,?,?,?)";

            try
            {
                //send data to the data base
                pst=con.prepareStatement(sql);
                pst.setString(1,labelItemId.getText());
                pst.setString(2,cmdItemType.getSelectedItem().toString());
                pst.setString(3,cmbbrand.getSelectedItem().toString());
                pst.setString(4,cmbsize.getSelectedItem().toString());
                pst.setString(5,txtRecievedStock.getText());
                pst.setString(6,txtAvailableQuan.getText());
                pst.setString(7,labelStockPrice.getText());
                pst.setString(8,txtItemprice.getText());
                pst.setString(9,txtItemDiscountPercent.getText());
                pst.setString(10,txtDiscountedPrice.getText());
                pst.execute();

                JOptionPane.showMessageDialog(null,"Successfully added");
//                additemsLoad();
//               
//                ItemIdGen();
//                //itemIdGen();

                //clear added data
                //txtid.setText("");


            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnClearCusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCusDataActionPerformed

        //Clearing added data of the text fields after added customer details
       
        txtRecievedStock.setText("");
        txtAvailableQuan.setText("");
       
        labelStockPrice.setText("");
        txtItemprice.setText("");
        txtItemDiscountPercent.setText("");
        txtDiscountedPrice.setText("");
        
//        additemsLoad();
//        ItemIdGen();
    }//GEN-LAST:event_btnClearCusDataActionPerformed

    private void txtRecievedStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecievedStockKeyReleased
 
        //Setting Recieved Stock Value in Available Quantity Field
        String recievedStock=txtRecievedStock.getText();
       txtAvailableQuan.setText(recievedStock);
    }//GEN-LAST:event_txtRecievedStockKeyReleased

      
       
        
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
            java.util.logging.Logger.getLogger(SingletonStockManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingletonStockManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingletonStockManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingletonStockManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingletonStockManagment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBackFromItem;
    private javax.swing.JButton btnClearCusData;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnEditItem;
    private javax.swing.JButton btnExitFromItem;
    private javax.swing.JComboBox<String> cmbbrand;
    private javax.swing.JComboBox<String> cmbsize;
    private javax.swing.JComboBox<String> cmdItemType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel labelItemId;
    private javax.swing.JTextField labelStockPrice;
    public static javax.swing.JLabel lblUserDesignnation;
    public static javax.swing.JLabel lblUserID;
    private javax.swing.JTable tblAddItems;
    private javax.swing.JLabel txtAvailableQuan;
    private javax.swing.JTextField txtDiscountedPrice;
    private javax.swing.JTextField txtItemDiscountPercent;
    private javax.swing.JTextField txtItemprice;
    private javax.swing.JTextField txtRecievedStock;
    private javax.swing.JTextField txtSearchItem;
    // End of variables declaration//GEN-END:variables
}
