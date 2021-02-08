/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ooa.pos.singleton;


import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Dumidu Bandara
 */
public interface StockDao {

    public int add(Stock stk)
            throws SQLException;

    public void delete(String itemId)
            throws SQLException;

    public Stock getStock(String itemId)
            throws SQLException;

    public List<Stock> getStock()
            throws SQLException;

    public void update(Stock stk)
            throws SQLException;
}
