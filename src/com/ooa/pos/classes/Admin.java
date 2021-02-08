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
public class Admin extends User{
   
     //constructor
    public Admin(String userId, String userFirstName, String userLastName, String userGender, String userNIC, String userAddress, String userContact, String userMail, String userDesignation, String username, String Password, String userRegDate) {
        super(userId, userFirstName, userLastName, userGender, userNIC, userAddress, userContact, userMail, userDesignation, username, Password, userRegDate);
    }
        
    
    
}
