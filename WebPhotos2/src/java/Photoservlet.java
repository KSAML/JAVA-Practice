/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(urlPatterns = {"/Photoservlet"})
public class Photoservlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
   String Client_Name = request.getParameter("Client_Name");
   BufferedImage Image = null; 
  // Image = readFromFile("","","");
   // writeToFile(Image);
  String Photographer_Name = request.getParameter("Photographer_Name");
     photoclass PC = new photoclass();
     //Connection con = PC.getCon();
     //Statement stat = con.createStatement();
   //  stat.executeUpdate("insert into user(Client_Name,Image,Photographer_Name) values('"+Client_Name+"','"+Image+"','"+Photographer_Name+"')");
     //ResultSet myRs = stat.executeQuery("select* from photos");
     out.println("every thing is kawa now"+"<br/>");
   
        //get a connection to database
        Connection  myconnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/samuel_test1", "samuel", "sam123");
          
        //creating a statement
        Statement mystat = myconnect.createStatement();
        
        //execute SQL query
        ResultSet myRs = mystat.executeQuery("select* from photos");
        
        //process the result set
          while(myRs.next()){
          out.println(myRs.getString("Client_Name") + "," + myRs.getString("Image") + "," + myRs.getString("Photographer_Name")+"<br>");
          }      
        
        }   
        catch (SQLException ex) {
            Logger.getLogger(Photoservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    private static class photoclass {

        public photoclass() {
        }

        private Connection getCon() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        processRequest(request, response);
    }
}
