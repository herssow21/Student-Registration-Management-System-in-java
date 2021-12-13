/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.registration.system;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassow099
 */
public class mysqlConnection {
    
      static Connection conn;
      static Statement st;
      static PreparedStatement pst;
      static ResultSet rs;
    
    public static Connection getConnection() throws SQLException{
        try {
             Class.forName("com.mysql.jdbc.Driver");
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbchuka" ,"root","");
        } catch (ClassNotFoundException ex) {
                   JOptionPane.showMessageDialog(null,"connection error!");
        }
        return conn;
    }
    
}
