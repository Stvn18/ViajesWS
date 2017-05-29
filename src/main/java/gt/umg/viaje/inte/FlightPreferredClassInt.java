/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.inte;

import gt.umg.viaje.entities.FlightPreferredClass;
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
@RequestMapping(value = "/api/FlightPreferredClass", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface FlightPreferredClassInt {
    
    /**
     * Obtiene listado de clases de vuelo
     * @return
     * @throws Exception 
     */
    @Transactional(readOnly = true)
    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public ResponseEntity<FlightPreferredClass> findAll() throws Exception;
    
}
