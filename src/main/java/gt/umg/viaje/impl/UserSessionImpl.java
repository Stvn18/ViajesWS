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
    public ResponseEntity<UserSession> login(String user, String pass) throws Exception {
        
        User user1 = userRepo.findByUser(user);
        UserSession userSession = new UserSession();
        Date date = new Date();
        
        if(user1 == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        
        if("".equals(user)){
           return new ResponseEntity(HttpStatus.BAD_REQUEST); 
        }
        
        if("".equals(pass)){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        String encryptPass = Md5Encrypt.get_md5(pass);
        
        if(!user1.getPassword().equals(encryptPass)){
            return new ResponseEntity(HttpStatus.ACCEPTED);
        }
        
        String infoToken = Integer.toString(user1.getId()) + Long.toString(date.getTime());
        
        String token = Md5Encrypt.get_md5(infoToken);
        
        userSession.setToken(token);
        userSession.setStartDate(date);
        userSession.setEndDate(date);
        userSession.setUser(user1);
        
        userSessionRepo.save(userSession);
        
        return new ResponseEntity(userSession, HttpStatus.OK);
    }

}