/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.IOException;
import org.json.simple.JSONObject;

/**
 *
 * @author samuel
 */
public class User {
    String client_name;
    int client_id;
    String client_image;
    String client_status;
    public static void main(String[] args) throws IOException{
   /* String client_name;
    int client_id;
    String client_image;
    String client_status;*/
   
    public String getClient_name(){
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_image() {
        return client_image;
    }

    public void setClient_image(String client_image) {
        this.client_image = client_image;
    }

    public String getClient_status() {
        return client_status;
    }

    public void setClient_status(String client_status) {
        this.client_status = client_status;
    }
}
}
