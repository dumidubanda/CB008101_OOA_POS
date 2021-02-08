/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ooa.pos.classes;

import java.text.SimpleDateFormat;

/**
 *
 * @author Dumidu Bandara
 */
public class User {

    String userId;
    String userFirstName;
    String userLastName;
    String userGender;
    String userNIC;
    String userAddress;
    String userContact;
    String userMail;
    String userDesignation;
    String username;
    String Password;
    String userRegDate;
    
    //constructor
    public User(String userId,  String userFirstName, String userLastName,  String userGender, String userNIC,  
            String userAddress, String userContact, String userMail, String userDesignation, 
            String username, String Password, String userRegDate )
    {
      this.userId = userId;
      this.userFirstName = userFirstName;
      this.userLastName = userLastName;
      this.userGender = userGender;
      this.userNIC = userNIC;
      this.userAddress = userAddress;
      this.userContact = userContact;
      this.userMail = userMail;
      this.userDesignation = userDesignation;
      this.username = username;
      this.Password = Password;
      this.userRegDate = userRegDate;
   }
   
    
    
    
}
