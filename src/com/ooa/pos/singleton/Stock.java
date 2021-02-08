/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ooa.pos.singleton;

/**
 *
 * @author Dumidu Bandara
 */
public class Stock {
        String itemId;
        String itemType;
        String itemBrand;
        String itemSize;
        String recievedStock;
        String avilQuantity;
        String stockPrice;
        String price;
        String discount;
        String discountedPrice;
        
         //constructor
        public Stock( String itemId, String itemType, String itemBrand, String itemSize,
           String recievedStock,  String avilQuantity, String stockPrice, String price, String discount, String discountedPrice )
    {
        this.itemId = itemId;
        this.itemType = itemType;
        this.itemBrand = itemBrand;
        this.itemSize = itemSize;
        this.recievedStock = recievedStock;
        this.avilQuantity = avilQuantity;
        this.stockPrice = stockPrice;
        this.price = price;
        this.discount = discount;
        this.discountedPrice = discountedPrice;     
    }

    public Stock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getRecievedStock() {
        return recievedStock;
    }

    public void setRecievedStock(String recievedStock) {
        this.recievedStock = recievedStock;
    }

    public String getAvilQuantity() {
        return avilQuantity;
    }

    public void setAvilQuantity(String avilQuantity) {
        this.avilQuantity = avilQuantity;
    }

    public String getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
        
}
