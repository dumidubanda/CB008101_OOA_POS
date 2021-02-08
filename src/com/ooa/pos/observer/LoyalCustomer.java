/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ooa.pos.observer;

import observerpattern.Observer;

/**
 *
 * @author Dumidu Bandara
 */
public class LoyalCustomer implements ObserverCustomer {

    @Override
    public void update(String message) {
        processMessage(message);
    }

    private void processMessage(String message) {
        System.out.println("Customer is interested in buying the product on sale!");
        
    }

}
