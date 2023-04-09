package bank.management.system;

import java.sql.*;

public class Conn {

   Connection c; 
   Statement s;
   
    public Conn(){
        try{
            // Step 1: Register Driver
//            Class.forName(com.mysql.cj.jdbc.Driver);
            
            // Step 2: Create Connection (Creating Connection String)
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "akashAICH@0305"); 
            
            // Step 3: Create Statement.
            s = c.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
