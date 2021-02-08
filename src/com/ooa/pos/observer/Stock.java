
package com.ooa.pos.observer;


public interface Stock {
    public void addObserver(LoyalCustomer teacher);
    public void removeOserver(LoyalCustomer teacher);
    public void notifyObserver();
    
}
