/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

import java.sql.*;
import javax.swing.*;


/**
 *
 * @author nashiaholloway
 */
public class MysqlConnect {
    
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CuvinoRestaurant", "user123", "123");
            JOptionPane.showMessageDialog(null, "Connected to Cuvino database");
            return conn;
                                     
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
    PreparedStatement pst = null;
    ResultSet rs = null;
    
}
