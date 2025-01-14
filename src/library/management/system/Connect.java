/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author gupta
 */
public class Connect {
    public static Connection Connection(){
        Connection Con = null;
        try {
            
            Con= DriverManager.getConnection("jdbc:mysql://localhost/libraryManagementSystem", "root", "Riya@7668");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return Con;
    }
    
}
