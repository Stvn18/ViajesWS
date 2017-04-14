/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.User;
import gt.umg.viaje.repo.UserRepo;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import gt.umg.viaje.inte.UserInt;

/**
 *
 * @author Steven
 */
@Component()
public class UserImpl implements UserInt {

    @Autowired()
    UserRepo userRepo;

    @Override
    public ResponseEntity<User> findAll() throws Exception {

        List<User> users = userRepo.findAll();

        return new ResponseEntity(users, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> findByEmail(String email) throws Exception {
        
        User us = userRepo.findByEmail(email);
        
        if(us == null){
            return new ResponseEntity("El Usuario No Existe", HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity(HttpStatus.OK);

    }

    @Override
    public ResponseEntity doCreate(String token, Integer userId, User user) throws Exception {
        
        User us = userRepo.findByEmail(user.getEmail());
        
        if(us != null){
            return new ResponseEntity("El Usuario Ya Existe", HttpStatus.FOUND);
        }
        if("".equals(user.getEmail()) || user.getEmail() == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        if("".equals(user.getLastname()) || user.getLastname() == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        if("".equals(user.getName()) || user.getName() == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        if("".equals(user.getPassword()) || user.getPassword() == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        user.setActive(true);
        
        Date fecha = new Date();
        user.setCreatedAt(fecha);
        
        userRepo.save(user);

        return new ResponseEntity(user, HttpStatus.CREATED);
    }

}