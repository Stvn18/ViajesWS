/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author wilver
 */
@Table()
@Entity()
public class Product extends GenericEntity {

    private static final long serialVersionUID = -612286601122230995L;
    
    @ManyToOne()
    private ProductType productType;
    
    @ManyToOne()
    private FlightTcket flightTcket;

    public Product() {
    }

    public Product(ProductType productType, FlightTcket flightTcket) {
        this.productType = productType;
        this.flightTcket = flightTcket;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public FlightTcket getFlightTcket() {
        return flightTcket;
    }

    public void setFlightTcket(FlightTcket flightTcket) {
        this.flightTcket = flightTcket;
    }

    @Override
    public String toString() {
        return "Product{" + "productType=" + productType + ", flightTcket=" + flightTcket + '}';
    }
    
}
