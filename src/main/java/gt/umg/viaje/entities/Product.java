/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author wilver
 */
@Table()
@Entity()
public class Product extends GenericEntity {
    
    private static final long serialVersionUID = -612286601122230995L;
    
    @Enumerated(EnumType.ORDINAL)
    private ProductType productType;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private FlightTicket flightTicket;

    public Product() {
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public FlightTicket getFlightTicket() {
        return flightTicket;
    }

    public void setFlightTicket(FlightTicket flightTicket) {
        this.flightTicket = flightTicket;
    }
    
}
