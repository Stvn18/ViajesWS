/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.repo;

import gt.umg.viaje.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wilver
 */
@Repository()
public interface InvoiceRepo extends JpaRepository<Invoice, Integer> {
    
    
    
}
