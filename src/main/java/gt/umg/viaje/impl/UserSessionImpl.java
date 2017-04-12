/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.User;
import gt.umg.viaje.entities.UserSession;
import gt.umg.viaje.inte.UserSessionInte;
import gt.umg.viaje.repo.UserRepo;
import gt.umg.viaje.repo.UserSessionRepo;
import gt.umg.viaje.security.Md5Encrypt;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author Steven
 */
@Component()
public class UserSessionImpl implements UserSessionInte {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired()
    UserRepo userRepo;
    
    @Autowired()
    UserSessionRepo userSessionRepo;

    @Override
    public ResponseEntity<Boolean> isSessionValid(String token, Integer userId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity logout(String token, Integer userId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<UserSession> login(String name, String pass) throws Exception {
        
        return new ResponseEntity(HttpStatus.CREATED);
    }

}