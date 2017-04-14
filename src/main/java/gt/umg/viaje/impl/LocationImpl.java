/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.Location;
import gt.umg.viaje.inte.LocationInt;
import gt.umg.viaje.repo.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author wilver
 */
@Component()
public class LocationImpl implements LocationInt {
    
    @Autowired()
    LocationRepo locationRepo;
    
    @Override
    public ResponseEntity<Location> onFindAll() throws Exception {
        return new ResponseEntity(locationRepo.findAll(), HttpStatus.OK);
    }
    
}
