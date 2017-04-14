/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities.builder;

import gt.umg.viaje.entities.User;
import gt.umg.viaje.entities.UserRole;
import java.util.Date;
import java.util.List;

/**
 *
 * @author wilver
 */
public class UserBuilder {
    
    private String name = null;
    private String lastname = null;
    private String email = null;
    private String password = null;
    private List<UserRole> roles = null;
    
    public UserBuilder setName(String name){
        this.name= name;
        return this;
    }
    
    public UserBuilder setLastname(String lastname){
        this.lastname = lastname;
        return this;
    }
    
    public UserBuilder setEmail(String email){
        this.email = email;
        return this;
    }
    
    public UserBuilder setPassword(String password){
        this.password = password;
        return this;
    }
    
    public UserBuilder setRoles(List<UserRole> roles){
        this.roles = roles;
        return this;
    }
    
    public User build(){
        if(name == null || lastname == null || email == null || password == null || roles == null){
            return null;
        }
        return new User(name, lastname, email, password, new Date(), true);
    }
    
}
