/*
This implemented class will be used as a DAO to perform CRUD operations. 
use PreparedStatement to execute the query.
 */
package com.ooa.pos.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dumidu Bandara
 */
public interface CustomerDao {

    public int add(Customer cus)
            throws SQLException;

    public void delete(String customerId)
            throws SQLException;

    public Customer getCustomers(String customerId)
            throws SQLException;

    public List<Customer> getCustomers()
            throws SQLException;

    public void update(Customer cus)
            throws SQLException;

    //public Customer getCustomer(String customerId)
    //throws SQLException;
}
