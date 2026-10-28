/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import modelo.Post;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import static one.xingyi.core.http.JavaHttpClient.httpClient;
import org.json.JSONObject;

/**
 *
 * @author juans
 */
public class ApiService {
    //Crear nuestro cliente
    private static final HttpClient httpclient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    private static final String API_URL="https://jsonplaceholder.typicode.com/posts";//endpoints
    public Post getPost(int id)throws IOException, InterruptedException{
        
    //Construimoss la petición
    HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(API_URL + id)).header("Accept", "Application/json").build(); 
    HttpResponse <String> response = httpclient.send(request, HttpResponse.BodyHandlers.ofString());
    
    //Verificar que responde
    if(response.statusCode()!=200){
        System.out.println("error: "+response.statusCode());
    }
    
    //Mapear el json
    String jsonString = response.body();
    
    //Crear un jsonObject
    JSONObject jsonObject = new JSONObject(jsonString);
    Post post = new Post(jsonObject);
    
    return post;
    }
    
    
    
}
