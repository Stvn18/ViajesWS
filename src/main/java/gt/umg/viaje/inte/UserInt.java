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
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Steven
 */

@RestController()
@RequestMapping(value = "/api/User", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface UserInt {
    
    /**
     * Registra un nuevo usuario
     * @param user
     * @return
     * @throws Exception 
     */
    @Transactional(rollbackFor = Exception.class)
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public ResponseEntity<User> signUp(
            @Validated() @RequestBody() User user
    ) throws Exception;
    
}