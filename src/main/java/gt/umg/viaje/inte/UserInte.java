/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.inte;

import gt.umg.viaje.entities.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Steven
 */

@RestController()
@RequestMapping(value = "/api/User", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface UserInte {
    
    @Transactional(readOnly = true)
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public ResponseEntity<User> findAll() throws Exception;
    
    @Transactional(readOnly = true)
    @RequestMapping(value = "/findByEmail", method = RequestMethod.GET)
    public ResponseEntity<User> findByEmail(
            @RequestParam(value = "email") String email
    ) throws Exception;
    
    @Transactional()
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public ResponseEntity doCreate(
            @RequestParam(value = "token", defaultValue = "") String token,
            @RequestParam(value = "userId", defaultValue = "0") Integer userId,
            @RequestBody() User user
    ) throws Exception;   
}