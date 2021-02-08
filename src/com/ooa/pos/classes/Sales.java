/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ooa.pos.classes;

/**
 *
 * @author Dumidu Bandara
 */
public class Sales {

    String itemId;
    String itemType;
    String itemBrand;
    String itemSize;
    double discountedPrice;
    int quantity;
    double amount;
    double totoalPrice;
    double payMethod;
    double payedAmount;
    double balance;

    Sales() {
        this.itemId = itemId;
        this.itemType = itemType;
        this.itemBrand = itemBrand;
        this.itemSize = itemSize;
        this.discountedPrice = discountedPrice;
        this.quantity = quantity;
        this.amount = amount;
        this.totoalPrice = totoalPrice;
        this.payMethod = payMethod;
        this.payedAmount = payedAmount;
        this.balance = balance;

    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotoalPrice() {
        return totoalPrice;
    }

    public void setTotoalPrice(double totoalPrice) {
        this.totoalPrice = totoalPrice;
    }

    public double getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(double payMethod) {
        this.payMethod = payMethod;
    }

    public double getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(double payedAmount) {
        this.payedAmount = payedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    

}
