/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.HotelDetail;
import gt.umg.viaje.inte.HotelInt;
import gt.umg.viaje.repo.HotelDetailRepo;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author wilver
 */
@Component()
public class HotelImpl implements HotelInt {
    
    @Autowired()
    private HotelDetailRepo hotelDetailRepo;
    
    @Override
    public ResponseEntity<HotelDetail> findServices(Integer locationId, Integer childrens, Integer adults, Integer bedrooms, Long lDateIn, Long lDateOut) throws Exception {
        
        Date dateIn = new Date(lDateIn);
        Date dateOut = new Date(lDateOut);
        
        return new ResponseEntity(hotelDetailRepo.getDisponibles(locationId, childrens, adults, bedrooms, dateIn, dateOut), HttpStatus.OK);
    }
    
}
