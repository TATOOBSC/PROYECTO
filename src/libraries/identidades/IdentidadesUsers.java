/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.identidades;

/**
 *
 * @author Ellet
 */
public class IdentidadesUsers {
    int id_user;
    String username;
    String password;
    String nivel;

    public IdentidadesUsers(int id_user, String username, String password, String nivel) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.nivel = nivel;
    }
    
    public IdentidadesUsers(){
        
    }

    public IdentidadesUsers(String username, String password, String nivel) {
        this.username = username;
        this.password = password;
        this.nivel = nivel;
    }
 
    
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
