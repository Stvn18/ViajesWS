/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author steven.vargas
 */

/**
 * 
 * Esta entidad es el encabezado de la factura en las ventas que se realizan.
 */

@Entity()
@Table()
public class Invoice extends GenericEntity {

    private static final long serialVersionUID = 23256028518132415L;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;
    
    private Float total;
    
    public Invoice() {
    }

    public Invoice(User user, Float total) {
        this.user = user;
        this.total = total;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Invoice{" + "user=" + user + ", total=" + total + '}';
    }
    
}