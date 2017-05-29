/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.Airline;
import gt.umg.viaje.inte.AirlineInt;
import gt.umg.viaje.repo.AirlineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author wilver
 */
@Component()
public class AirlineImpl implements AirlineInt {
    
    @Autowired()
    private AirlineRepo airlineRepo;
    
    @Override
    public ResponseEntity<Airline> findAll() throws Exception {
        return new ResponseEntity(airlineRepo.findByActiveTrue(), HttpStatus.OK);
    }
    
}
