/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.inte;

import gt.umg.viaje.entities.Invoice;
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
 * @author wilver
 */
@RestController()
@RequestMapping(value = "/api/Invoice", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface InvoiceInt {

    @Transactional(rollbackFor = Exception.class)
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    ResponseEntity<Invoice> onCreate(
            @RequestParam(value = "token", defaultValue = "") String token,
            @RequestBody() Invoice invoice
    ) throws Exception;

}
