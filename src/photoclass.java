
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samuel
 */
public class photoclass {
   Connection con;
   public Connection getCon() throws SQLException, ClassNotFoundException{
   Class.forName("com.mysql.jdbc.Driver");
   DriverManager.getConnection("jdbc:mysql://localhost:3306/samuel_test1","samuel","sam123");
   return con;
   }
}
