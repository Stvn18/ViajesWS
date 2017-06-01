/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author steven.vargas
 */

/**
 * 
 * Esta entidad es el detalle de la factura de cada venta
 */

@Entity()
@Table()
public class InvoiceDetail extends GenericEntity {
    
    private static final long serialVersionUID = -5216497945705017438L;
        
    private Integer quantity;
    
    private Float unitPrice;
    
    private Float subTotal;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    public InvoiceDetail() {
    }

    public InvoiceDetail(Integer quantity, Float unitPrice, Float subTotal, Product product) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subTotal = subTotal;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "InvoiceDetail{" + "quantity=" + quantity + ", unitPrice=" + unitPrice + ", subTotal=" + subTotal + ", product=" + product + '}';
    }

    
}