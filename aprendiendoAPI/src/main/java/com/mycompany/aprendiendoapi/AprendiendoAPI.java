/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aprendiendoapi;
import modelo.Post;
import Service.ApiService;
import java.io.IOException;
/**
 *
 * @author juans
 */
public class AprendiendoAPI {

    public static void main(String[] args) {
        System.out.println("Consumiendo api de fake api");
        ApiService apiservice = new ApiService();
        try{
            Post post = apiservice.getPost(3);
            if(post !=null){
                System.out.println("Recibiendo post");                
                System.out.println("ID"+post.getId());
                System.out.println("Titulo:"+post.getTitle());
                System.out.println("Cuerpo o contenido:"+post.getBody());
            }
        }catch(IOException | InterruptedException e){
            System.out.println("Error:");
            e.printStackTrace();
        }
    }
}
