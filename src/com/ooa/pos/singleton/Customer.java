/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ooa.pos.singleton;

import java.text.SimpleDateFormat;

/**
 *
 * @author Dumidu Bandara
 */
public class Customer {

    String customerId;
    String customerfName;
    String customerlName;
    String customerGender;
    String customerNIC;
    String customerAddress;
    String customerContact;
    String customerMail;
    String cusRegDate;
    String loyalPoints;

    public Customer() {}
     
     //constructor
    public Customer( String customerId, String customerfName, String customerlName, String customerGender,
           String customerNIC,  String customerAddress, String customerContact, String customerMail, String cusRegDate, String loyalPoints )
    {
        this.customerId = customerId;
        this.customerfName = customerfName;
        this.customerlName = customerlName;
        this.customerGender = customerGender;
        this.customerNIC = customerNIC;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;
        this.customerMail = customerMail;
        this.cusRegDate = cusRegDate;
        this.loyalPoints = loyalPoints;     
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerfName() {
        return customerfName;
    }

    public void setCustomerfName(String customerfName) {
        this.customerfName = customerfName;
    }

    public String getCustomerlName() {
        return customerlName;
    }

    public void setCustomerlName(String customerlName) {
        this.customerlName = customerlName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerNIC() {
        return customerNIC;
    }

    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public String getCusRegDate() {
        return cusRegDate;
    }

    public void setCusRegDate(String cusRegDate) {
        this.cusRegDate = cusRegDate;
    }

    public String getLoyalPoints() {
        return loyalPoints;
    }

    public void setLoyalPoints(String loyalPoints) {
        this.loyalPoints = loyalPoints;
    }

   
    
    
  
}
