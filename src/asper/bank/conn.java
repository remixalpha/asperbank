/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asper.bank;

import java.sql.*;
/**
 *
 * @author remix_alpha
 */
public class conn {
    
    Connection c;
    Statement s;
    public conn(){
        
        try{
           
            c = DriverManager.getConnection("jdbc:mysql:///rahul","root@localhost","Rahul@123");
            s = c.createStatement();
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
    
}
