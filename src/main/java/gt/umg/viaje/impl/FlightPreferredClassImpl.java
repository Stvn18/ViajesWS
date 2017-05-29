/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.FlightPreferredClass;
import gt.umg.viaje.inte.FlightPreferredClassInt;
import gt.umg.viaje.repo.FlightPreferredClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author wilver
 */
@Component()
public class FlightPreferredClassImpl implements FlightPreferredClassInt {
    
    @Autowired()
    private FlightPreferredClassRepo flightPreferredClassRepo;
    
    @Override
    public ResponseEntity<FlightPreferredClass> findAll() throws Exception {
        return new ResponseEntity(flightPreferredClassRepo.findByActiveTrue(), HttpStatus.OK);
    }
    
}
