/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuvinodatabase;

import java.sql.*;

/**
 *
 * @author nashiaholloway
 */
public class CuvinoDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;         //allow connection to database
        Statement st = null;            //allow execution of queries
        ResultSet rs = null;            //allow presentation of data from queries
        ResultSetMetaData meta = null;  //allow to get info about data
        String query = "Select * from user123.employee";
        
        try{
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CuvinoRestaurant", "user123", "123");
            st = conn.createStatement();
            rs = st.executeQuery(query);
            meta = rs.getMetaData();
            
            int colNum = meta.getColumnCount();
            //System.out.println(colNum);           //prints number of columns in table
            for(int i = 1; i <= colNum; i++){
                System.out.print(meta.getColumnName(i) + "\t");
            }
            System.out.println();
            while(rs.next()){
                for(int i = 1; i <= colNum; i++){
                    System.out.print(rs.getObject(i) + "\t");
                }
                System.out.println();
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
