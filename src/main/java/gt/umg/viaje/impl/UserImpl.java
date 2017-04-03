/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.User;
import gt.umg.viaje.inte.UserInte;
import gt.umg.viaje.repo.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author Steven
 */

@Component()
public class UserImpl implements UserInte {
    
    @Autowired()
    UserRepo userRepo;

    @Override
    public ResponseEntity<User> findAll() throws Exception {
    
        List <User> users = userRepo.findAll();
        
        return new ResponseEntity(users, HttpStatus.OK); 
    }

    @Override
    public ResponseEntity<User> findByUser(String user) throws Exception {
            
        User user1 = userRepo.findByUser(user);
        
        if("".equals(user) || user1 == null){
            return new ResponseEntity("El Usuario No Existe!", HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity(user1, HttpStatus.OK);
        }
        
    }

    @Override
    public ResponseEntity doCreate(String token, Integer userId, User user) throws Exception {
        
        User users = userRepo.findByUser(user.getUser());
    
        if("".equals(user.getName()) || user.getName() == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        if("".equals(user.getUser()) || user.getUser() == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        if("".equals(user.getPassword()) || user.getPassword() == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        if(user.getPerson() == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        if (users != null){
            return new ResponseEntity("El Usuario Ya Existe!", HttpStatus.FOUND);
        }
        
        user.setActive(true);
        
        userRepo.save(user);
        
        return new ResponseEntity(user, HttpStatus.CREATED);
    }
       
}