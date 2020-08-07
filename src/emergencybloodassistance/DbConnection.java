/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergencybloodassistance;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Bipul Sapkota
 */
public class DbConnection
{
    public static PreparedStatement getConnection(String sql){
        PreparedStatement ps=null;
        Connection conn;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blooddata","root","");
            ps=conn.prepareStatement(sql);
            }
            catch(SQLException | ClassNotFoundException e)
              {
                 JOptionPane.showMessageDialog(null,e.getMessage());
              }
        return ps;
    }      
}
