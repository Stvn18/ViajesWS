/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.inte;

import gt.umg.viaje.entities.UserSession;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Steven
 */
@RestController()
@RequestMapping(value = "/api/UserSession", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface UserSessionInt {

    @Transactional(readOnly = true)
    @RequestMapping(value = "/isSessionValid", method = RequestMethod.GET)
    public ResponseEntity<Boolean> isSessionValid(
            @RequestParam(value = "token", defaultValue = "") String token,
            @RequestParam(value = "userId", defaultValue = "0") Integer userId
    ) throws Exception;

    @Transactional()
    public ResponseEntity logout(
            @RequestParam(value = "token", defaultValue = "") String token,
            @RequestParam(value = "userId", defaultValue = "0") Integer userId
    ) throws Exception;
    
    /**
     * Realiza login
     * @param email
     * @param password
     * @return
     * @throws Exception 
     */
    @Transactional(rollbackFor = Exception.class)
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<UserSession> login(
            @RequestParam(value = "email", defaultValue = "") String email,
            @RequestParam(value = "password", defaultValue = "") String password
    ) throws Exception;

}
