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

import com.ooa.pos.singleton.SingletonDataBaseConnection;
import com.ooa.pos.views.SingletonCustomerRegister;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dumidu Bandara
 */
public class CustomerDaoImplementation implements CustomerDao {

    static Connection con
            = SingletonDataBaseConnection.getConnection();

    @Override
    public int add(Customer cus) throws SQLException {
        String sql = "INSERT INTO loyalcustomer(customer_id, customer_fname, customer_lname, customer_gender, customer_nic, customer_address, customer_contactno, customer_mail, registered_date, loyal_points) VALUES(?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement pst
                = con.prepareStatement(sql);

        pst.setString(1, cus.getCustomerId());
        pst.setString(2, cus.getCustomerfName());
        pst.setString(3, cus.getCustomerlName());
        pst.setString(4, cus.getCustomerGender());
        pst.setString(5, cus.getCustomerNIC());
        pst.setString(6, cus.getCustomerAddress());
        pst.setString(7, cus.getCustomerContact());
        pst.setString(8, cus.getCustomerMail());
        //date chooser
        pst.setString(9, cus.getCusRegDate());
        pst.setString(10, cus.getLoyalPoints());

        int n = pst.executeUpdate();
        return n;
    }

    @Override
    public void delete(String customerId) throws SQLException {
        String sql = "DELETE FROM loyalcustomer WHERE customer_id='" + customerId + "'";
        PreparedStatement pst
                = con.prepareStatement(sql);
        pst.setString(1, customerId);
        pst.executeUpdate();
    }

    @Override
    public void update(Customer customerId) throws SQLException {
        String sql = "UPDATE loyalcustomer SET customer_id=?, customer_fname=? , customer_lname=? , customer_gender=? , customer_nic=? , customer_address=? , customer_contactno=? , customer_mail=? , registered_date=?  WHERE customer_id='" + customerId + "'";
        PreparedStatement pst
                = con.prepareStatement(sql);

        pst.setString(1, customerId.getCustomerId());
        pst.setString(2, customerId.getCustomerfName());
        pst.setString(3, customerId.getCustomerlName());
        pst.setString(4, customerId.getCustomerGender());
        pst.setString(5, customerId.getCustomerNIC());
        pst.setString(6, customerId.getCustomerAddress());
        pst.setString(7, customerId.getCustomerContact());
        pst.setString(8, customerId.getCustomerMail());
        //date chooser
        pst.setString(9, customerId.getCusRegDate());
        pst.setString(10, customerId.getLoyalPoints());

        pst.executeUpdate();

    }

//    @Override
//    public Customer getCustomer(String customerId) throws SQLException {
//        String sql = "SELECT * FROM loyalcustomer";
//        PreparedStatement pst
//                = con.prepareStatement(sql);
//        pst.executeQuery();
//        return null;
//       
//             
//    }
    @Override
    public Customer getCustomers(String customerId) throws SQLException {
        String query
                = "SELECT * FROM loyalcustomer WHERE customer_id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, customerId);
        Customer customer = new Customer();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            customer.setCustomerId(rs.getString("customer_id"));
            customer.setCustomerfName(rs.getString("customer_fname"));
            customer.setCustomerlName(rs.getString("customer_lname"));
            customer.setCustomerGender(rs.getString("customer_gender"));
            customer.setCustomerNIC(rs.getString("customer_nic"));
            customer.setCustomerAddress(rs.getString("customer_address"));
            customer.setCustomerContact(rs.getString("customer_contactno"));
            customer.setCustomerMail(rs.getString("customer_mail"));
            customer.setCusRegDate(rs.getString("registered_date"));
            customer.setLoyalPoints(rs.getString("loyal_points"));
        }

        if (check == true) {
            return customer;
        } else {
            return null;
        }
    }

    @Override
    public List<Customer> getCustomers() throws SQLException {
        String query = "SELECT * FROM loyalcustomer";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Customer> ls = new ArrayList();

        while (rs.next()) {
            Customer customer = new Customer();
            customer.setCustomerId(rs.getString("customer_id"));
            customer.setCustomerfName(rs.getString("customer_fname"));
            customer.setCustomerlName(rs.getString("customer_lname"));
            customer.setCustomerGender(rs.getString("customer_gender"));
            customer.setCustomerNIC(rs.getString("customer_nic"));
            customer.setCustomerAddress(rs.getString("customer_address"));
            customer.setCustomerContact(rs.getString("customer_contactno"));
            customer.setCustomerMail(rs.getString("customer_mail"));
            customer.setCusRegDate(rs.getString("registered_date"));
            customer.setLoyalPoints(rs.getString("loyal_points"));
            ls.add(customer);
        }
        return ls;
    }

}
