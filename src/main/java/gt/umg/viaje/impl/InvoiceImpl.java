/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.Invoice;
import gt.umg.viaje.entities.UserSession;
import gt.umg.viaje.inte.InvoiceInt;
import gt.umg.viaje.repo.InvoiceRepo;
import gt.umg.viaje.repo.UserRepo;
import gt.umg.viaje.repo.UserSessionRepo;
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
public class InvoiceImpl implements InvoiceInt {
    
    @Autowired()
    private UserRepo userRepo;
    
    @Autowired()
    private InvoiceRepo invoiceRepo;
    
    @Autowired()
    private UserSessionRepo userSessionRepo;
    
    @Override
    public ResponseEntity<Invoice> onCreate(String token, Invoice invoice) throws Exception {
        UserSession session = userSessionRepo.findByToken(token);
        
        if(session == null){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        
        invoice.setCreatedAt(new Date());
        invoice.setUser(session.getUser());
        return new ResponseEntity(invoiceRepo.save(invoice), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Invoice> onFindByUser(String token) throws Exception {
        UserSession session = userSessionRepo.findByToken(token);
        return new ResponseEntity(invoiceRepo.findByUser(session.getUser().getId()), HttpStatus.OK);
    }
    
}
