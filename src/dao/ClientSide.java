/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONObject;

/**
 *
 * @author samuel
 */
public class ClientSide {
  public static void main(String[] args) throws IOException {
     /* JSONObject ob=new JSONObject(); 
      ob.put("name","SAM");
      ob.put("City","K'la");
      ob.put("Street","22");
      
          System.out.println(ob);*/
       String response= getdata("");
     //  char ch=response.charAt(10);
    //   response.substring(response.indexOf("M"),response.indexOf(')'));
        System.out.println(response);
       response.substring(60);
        System.out.println(response);
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
				response = scanner.nextLine();
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
}
