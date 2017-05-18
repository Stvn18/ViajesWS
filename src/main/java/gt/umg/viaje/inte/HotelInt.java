/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.inte;

import gt.umg.viaje.entities.HotelDetail;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wilver
 */
@RestController()
@RequestMapping(value = "/api/Hotel", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface HotelInt {
    
    @Transactional(readOnly = true)
    @RequestMapping(value = "/findServices", method = RequestMethod.GET)
    public ResponseEntity<HotelDetail> findServices(
            @RequestParam(value = "locationId", required = false) Integer locationId,
            @RequestParam(value = "childrens", required = false) Integer childrens,
            @RequestParam(value = "adults", required = false) Integer adults,
            @RequestParam(value = "bedrooms", required = false) Integer bedrooms,
            @RequestParam(value = "lDateIn", required = false) Long lDateIn,
            @RequestParam(value = "lDateOut", required = false) Long lDateOut
    ) throws Exception;
    
}
