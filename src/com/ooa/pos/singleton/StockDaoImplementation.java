/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ooa.pos.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.ooa.pos.singleton.CustomerDaoImplementation.con;
import com.ooa.pos.singleton.SingletonDataBaseConnection;
import com.ooa.pos.views.SingletonStockManagment;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dumidu Bandara
 */
public class StockDaoImplementation implements StockDao {

    static Connection con
            = SingletonDataBaseConnection.getConnection();

    @Override
    public int add(Stock stk) throws SQLException {
        String sql = "INSERT INTO item VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst
                = con.prepareStatement(sql);

        //send data to the data base
        pst = con.prepareStatement(sql);
        pst.setString(1, stk.getItemId());
        pst.setString(2, stk.getItemType());
        pst.setString(3, stk.getItemBrand());
        pst.setString(4, stk.getItemSize());
        pst.setString(5, stk.getRecievedStock());
        pst.setString(6, stk.getAvilQuantity());
        pst.setString(7, stk.getStockPrice());
        pst.setString(8, stk.getPrice());
        pst.setString(9, stk.getDiscount());
        pst.setString(10, stk.getDiscountedPrice());

        JOptionPane.showMessageDialog(null, "Successfully added");

        int n = pst.executeUpdate();
        return n;
    }

    @Override
    public Stock getStock(String itemId) throws SQLException {
        String query
                = "SELECT * FROM item WHERE item_id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, itemId);
        Stock stk = new Stock();
        ResultSet rs = ps.executeQuery();
        boolean check = false;
        while (rs.next()) {
            check = true;
            stk.setItemId(rs.getString("item_id"));
            stk.setItemBrand(rs.getString("item_brand"));
            stk.setItemType(rs.getString("item_type"));
            stk.setItemSize(rs.getString("item_size"));
            stk.setRecievedStock(rs.getString("received_stock"));
            stk.setAvilQuantity(rs.getString("available_quantity"));
            stk.setStockPrice(rs.getString("stock_price_per_unit"));
            stk.setPrice(rs.getString("item_price"));
            stk.setDiscount(rs.getString("discount"));
            stk.setDiscountedPrice(rs.getString("selling_price"));
        }
        if (check == true) {
            return stk;
        } else {
            return null;
        }
    }

    @Override
    public List<Stock> getStock() throws SQLException {
        String query = "SELECT * FROM item";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Stock> ls = new ArrayList();

        while (rs.next()) {
            Stock stk = new Stock();
            stk.setItemId(rs.getString("item_id"));
            stk.setItemBrand(rs.getString("item_brand"));
            stk.setItemType(rs.getString("item_type"));
            stk.setItemSize(rs.getString("item_size"));
            stk.setRecievedStock(rs.getString("received_stock"));
            stk.setAvilQuantity(rs.getString("available_quantity"));
            stk.setStockPrice(rs.getString("stock_price_per_unit"));
            stk.setPrice(rs.getString("item_price"));
            stk.setDiscount(rs.getString("discount"));
            stk.setDiscountedPrice(rs.getString("selling_price"));
            ls.add(stk);
        }
        return ls;

    }

    @Override
    public void delete(String itemId) throws SQLException {
        String sql = "DELETE FROM item WHERE item_id='" + itemId + "'";
        PreparedStatement pst
                = con.prepareStatement(sql);
        pst.setString(1, itemId);
        pst.executeUpdate();
    }

    @Override
    public void update(Stock itemId) throws SQLException {
        String sql = "UPDATE item SET item_id=?, item_type=? , item_brand=? , item_size=? , received_stock=?, available_quantity=? , stock_price_per_unit=?, item_price=? , discount=?, selling_price=? WHERE item_id='" + itemId + "'";
        PreparedStatement pst
                = con.prepareStatement(sql);
        pst.setString(1, itemId.getItemId());
        pst.setString(2, itemId.getItemType());
        pst.setString(3, itemId.getItemBrand());
        pst.setString(4, itemId.getItemSize());
        pst.setString(5, itemId.getRecievedStock());
        pst.setString(6, itemId.getAvilQuantity());
        pst.setString(7, itemId.getStockPrice());
        pst.setString(8, itemId.getPrice());
        pst.setString(9, itemId.getDiscount());
        pst.setString(10, itemId.getDiscountedPrice());
        
         pst.executeUpdate();
    }

}
