/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.inte;

import gt.umg.viaje.entities.Airline;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wilver
 */
@RestController()
@RequestMapping(value = "/api/Airline", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface AirlineInt {
    
    @Transactional(readOnly = true)
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public ResponseEntity<Airline> findAll() throws Exception;
    
}
