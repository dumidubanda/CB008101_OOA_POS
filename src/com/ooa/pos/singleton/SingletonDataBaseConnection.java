package com.ooa.pos.singleton;



import java.sql.*;
// create a SingletonDataBaseConnection class.
public class SingletonDataBaseConnection {
     //SingletonDataBaseConnection prevents the instantiation from any other class.  
    private static Connection con = null; 
  
    static
    { 
        String url = "jdbc:mysql://localhost:3306/ooa_pos_data_base"; 
        String user = "root"; 
        String pass = ""; 
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection(url, user, pass); 
        } 
        catch (ClassNotFoundException | SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
    public static Connection getConnection() 
    { 
        return con; 
    } 
    
//    public static Connection connect()
//    {
//    try
//    {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ooa_pos_data_base","root","");
//        return con;
//    }
//        
//      catch(Exception e)
//      {
//      return null;
//      }
//    
//    }

    public static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
