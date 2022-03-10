/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photos.pkg2;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.*;
//import java.sql.*;
import java.util.Scanner;

public final class Photos2 extends Applet implements ActionListener
{      
       public JFrame f;
       public JPanel p;
       public JPanel p2;
       public JButton b1;
       public JLabel l;
       public JPanel p3;
       public JLabel l2;
       public JLabel l3;
       public JTextField jt1;
       public JTextField jt2;
      // public JImage jm;
       Image picture;
       
       //Create the class constructor
       public Photos2() throws IOException{
      String response = getdata("");
        
     System.out.println(response);
           //create a method gui()
         
           gui();
       }
       
       //Declaring a method
       public void gui() throws IOException{
       //for the Frame
    
           f=new JFrame("Connect to Server");
       f.setVisible(true);
    f.setSize(100,100);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
      // String response = getdata("");
         //  f=new JFrame();
     //  f.setBackground(Color.white);
       
          p3=new JPanel();
       p3.setBackground(Color.gray);
     // p.setSize(50,50);
      p3.setBounds(22, 20, 200, 100);
      setSize(100,50);
      
       p=new JPanel();
      p.setBackground(Color.GRAY);
     // p.setSize(50,50);
      p.setBounds(22, 500, 200, 100);
      setSize(200,100);
      
       
        p2=new JPanel();
       p2.setBackground(Color.white);
         p2.setBounds(22, 125, 500, 500);
     p2.setSize(200,350);
     
     jt1=new JTextField("Customer_Name");
    jt1.setBounds(50,100,20,100);
    
     jt2=new JTextField("Photographer_Name");
    jt2.setBounds(50,100,100,20);
    jt2.setSize(100,20);
     // jt1.setBackground(Color.black);
       b1 = new JButton("View");
       l = new JLabel("<html> <p\t\t style=\"width:100px\">"+"trial Label"+"</p><br/></html>");
      // jt1=new JTextField("<html> <p\t\t style=\"width:100px\"></p><br/></html>");
       l2 = new JLabel("<html><p style=\"width:100px\">"+"Customer_Name"+"</p><br/></html>");
       l3 = new JLabel("<html><p style=\"width:100px\">"+"Photographer_name"+"</p><br/></html>");
      //frame.add(textField); dialog.add(textField); panel.add(textField);
       p2.add(l);
       p2.add(l2);
        p2.add(jt1);     
       p2.add(l3);
      p2.add(jt2);
       p.add(b1);
      // p2.add ();
     
      f.add(p);
      f.add(p2);
      f.add(p3);
    
     //  f.add(p3);
       }      
   public static void main(String[] args) throws IOException {
     
       new Photos2();
       
       System.out.println("hullo all");
     // Photos2 i = new Photos2();
    
              }
   
       public static String getdata(String name) throws IOException
        {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8090/WebPhotos2/Photoservlet" + name).openConnection();
		
		connection.setRequestMethod("GET");

		int responseCode = connection.getResponseCode();
		if(responseCode == 200){
			String response = "";
			Scanner scanner = new Scanner(connection.getInputStream());
			while(scanner.hasNextLine()){
				response += scanner.nextLine();
				response += "\n";
			}
			scanner.close();

			return response;
                       // System.out.println(response);
		}
		  //System.out.println(response);
		// an error happened
		return null;
	}
   
 /*
    JFrame frame;
       ImageIcon image;
       JLabel displayField;
       
     public Photos2(){
     frame = new JFrame("Image Display Test");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    try{
        image = new ImageIcon(getClass().getResource("tulips.jpg"));
        displayField = new JLabel(image);
        frame.add(displayField);
    }catch(Exception e){
    System.out.println("Image cannot be formed");
    }
   // frame.pack();
   frame.setSize(50, 100);
    frame.setVisible(true);
    }*/
        /*  String Cname="", PName ="";
    
    TextField n = new TextField(20);
   TextField m = new TextField(20);
    
   Label l1 = new Label("Enter YourName(ClientName):");
   Label l2 = new Label("Enter Phontographe's name: ");
   
   Button b = new Button("<Back");
   Button bb = new Button("Next>");
       
 
   
     @Override 
   public void init(){
   super.init();
   add(l1);
   add(l2);
   add(n);
   add(m);
   }   
    
      //c.add("20");
   @Override 
    public void paint(Graphics g){
   super.paint(g);
   g.drawString("ClientName: "+ Cname,20,120 );
   g.drawString("PhotographerName: "+ PName,20,140 );
   }   
           @Override
    public void actionPerformed(ActionEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   Cname = n.getText();
   PName = m.getText();
   
   repaint();
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}

/*  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost/";
   static final String USER = "guest";
   static final String PASS = "guest123";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "CREATE DATABASE STUDENTS";
         stmt.executeUpdate(sql);
         System.out.println("Database created successfully...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
*/
