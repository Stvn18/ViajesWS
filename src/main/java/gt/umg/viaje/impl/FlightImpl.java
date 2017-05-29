/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.Flight;
import gt.umg.viaje.inte.FlightInt;
import gt.umg.viaje.repo.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author wilver
 */
@Component()
public class FlightImpl implements FlightInt {
    
    @Autowired()
    private FlightRepo flightRepo;

    @Override
    public ResponseEntity<Flight> getDisponibles(Integer flyingFromId, Integer flyingToId, Integer preferredClassId, Integer airlineId) throws Exception {
        return new ResponseEntity(flightRepo.getVuelosDisponibles(flyingFromId, flyingToId, preferredClassId, airlineId), HttpStatus.OK);
    }
    
}
