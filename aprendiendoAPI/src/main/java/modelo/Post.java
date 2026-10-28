/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import org.json.JSONObject;
/**
 *
 * @author juans
 */
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post(JSONObject json) {
        this.userId = json.getInt("userId");
        this.id = json.getInt("id");
        this.title = json.getString("title");
        this.body = json.getString("body");
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    @Override
    public String toString(){
        return "post{id :"+id+","+"title:"+title+","+"body:"+body+"}";
    } 
    
}
