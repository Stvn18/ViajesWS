/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    
    @ManyToOne()
    private Invoice invoice;
    
    private Integer quantity;
    
    @Column(scale = 18, precision = 2)
    private BigDecimal unitPrice;
    
    @Column(scale = 18, precision = 2)
    private BigDecimal subTotal;
    
    @ManyToOne()
    private Product product;

    public InvoiceDetail() {
    }

    public InvoiceDetail(Invoice invoice, Integer quantity, BigDecimal unitPrice, BigDecimal subTotal, Product product) {
        this.invoice = invoice;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subTotal = subTotal;
        this.product = product;
    }
    
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
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
        return "InvoiceDetail{" + "invoice=" + invoice + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", subTotal=" + subTotal + ", product=" + product + '}';
    }
    
}