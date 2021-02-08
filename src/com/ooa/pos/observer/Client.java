
package com.ooa.pos.observer;


public class Client {
    public static void main(String[] args) {
        Email mail = new Email();
        Send_Email sendmails = new Send_Email();
        mail.addObserver(sendmails);
        mail.setSendmail("We added new Items to the store, Check Out");
    }
    
}
