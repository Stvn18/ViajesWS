/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.User;
import gt.umg.viaje.entities.UserSession;
import gt.umg.viaje.repo.UserRepo;
import gt.umg.viaje.repo.UserSessionRepo;
import gt.umg.viaje.security.Md5Encrypt;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import gt.umg.viaje.inte.UserSessionInt;

/**
 *
 * @author Steven
 */
@Component()
public class UserSessionImpl implements UserSessionInt {
    
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
    public ResponseEntity<UserSession> login(String email, String password) throws Exception {

        if (email == null || "".equals(email) || password == null || "".equals(password)) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        User user = userRepo.findByEmail(email);

        if (user == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        UserSession userSession = new UserSession();

        /**
         * Comparamos los password encriptados
         */
        if (!user.getPassword().equals(Md5Encrypt.get_md5(password))) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        Date fechaActual = new Date();

        String token = Integer.toString(user.getId()) + Long.toString(fechaActual.getTime());

        userSession.setToken(Md5Encrypt.get_md5(token));
        userSession.setStartDate(fechaActual);
        userSession.setEndDate(fechaActual);
        userSession.setUser(user);

        userSessionRepo.save(userSession);

        return new ResponseEntity(userSession, HttpStatus.CREATED);
    }

}
