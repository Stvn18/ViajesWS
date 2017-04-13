/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.Objects;
import javax.persistence.CascadeType;
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
public class InvoiceDetail implements java.io.Serializable {

    private static final long serialVersionUID = -5216497945705017438L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn()
    private Invoice invoice;
    
    private Integer quantity;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn()
    private Pack pack;
    
    private boolean active;

    public InvoiceDetail() {
    }

    public InvoiceDetail(Integer id, Invoice invoice, Integer quantity, Pack pack, Boolean active) {
        this.id = id;
        this.invoice = invoice;
        this.quantity = quantity;
        this.pack = pack;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.invoice);
        hash = 41 * hash + Objects.hashCode(this.quantity);
        hash = 41 * hash + Objects.hashCode(this.pack);
        hash = 41 * hash + Objects.hashCode(this.active);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InvoiceDetail other = (InvoiceDetail) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.invoice, other.invoice)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.pack, other.pack)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InvoiceDetail{" + "id=" + id + ", invoice=" + invoice + ", quantity=" + quantity + ", pack=" + pack + ", active=" + active + '}';
    }   
}