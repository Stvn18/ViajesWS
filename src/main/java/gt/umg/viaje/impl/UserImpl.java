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

        List<User> users = userRepo.findAll();

        return new ResponseEntity(users, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> findByName(String name) throws Exception {
        
        return new ResponseEntity(HttpStatus.OK);

    }

    @Override
    public ResponseEntity doCreate(String token, Integer userId, User user) throws Exception {

        return new ResponseEntity(user, HttpStatus.CREATED);
    }

}