
package com.ooa.pos.observer;

import java.util.ArrayList;
import java.util.List;


public class Email implements Stock{
        private  String sendmail;
 
  private final List<LoyalCustomer> customers; //creat list observers

     public Email() {
        customers = new ArrayList<>();  //initialization
     }

    @Override
    public void addObserver(LoyalCustomer customer) {
        customers.add(customer);
        
    }

    @Override
    public void removeOserver(LoyalCustomer customer) {
        customers.remove(customer);
        
        
    }

    @Override
    public void notifyObserver() {
        for(LoyalCustomer customer : customers){
            customer.notifyMe(this);
        }
        
    }

    public String getSendmail() {
        return sendmail;
    }

    public void setSendmail(String sendmail) {
        this.sendmail = sendmail;
        notifyObserver();
    }

    }
     
    
    
