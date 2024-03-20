
package travel.management.system;

import java.sql.*;  

public class Conn
{
    Connection c;
    Statement s;
    public Conn()
    {  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","sql@021203"); 
            
            s =c.createStatement();  
            }
        catch(Exception e)
        { 
            e.printStackTrace();
            System.out.println(e);
        }  
    }  
}  
