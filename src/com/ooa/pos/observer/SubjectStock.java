package com.ooa.pos.observer;

public interface SubjectStock {

    public void subscribeObserverCustomer(ObserverCustomer customer);

    public void unSubscribeObserverCustomer(ObserverCustomer customer);

    public void notifyCustomers();

    
}
