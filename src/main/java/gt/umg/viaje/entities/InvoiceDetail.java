/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Steven
 */

@Entity()
public class InvoiceDetail implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private Integer quantity;
    
    private String description;
    
    private Float subtotal;
    
    private Float total;
    
    @OneToOne(fetch = FetchType.EAGER, cascade={CascadeType.PERSIST,CascadeType.REMOVE}, optional=false,orphanRemoval=true)
    private PaymentType paymentType;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PacketHeader> packetHeader;
    
    private Boolean active;

    public InvoiceDetail() {
    }

    public InvoiceDetail(Integer id, Integer quantity, String description, Float subtotal, Float total, PaymentType paymentType, List<PacketHeader> packetHeader, Boolean active) {
        this.id = id;
        this.quantity = quantity;
        this.description = description;
        this.subtotal = subtotal;
        this.total = total;
        this.paymentType = paymentType;
        this.packetHeader = packetHeader;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public List<PacketHeader> getPacketHeader() {
        return packetHeader;
    }

    public void setPacketHeader(List<PacketHeader> packetHeader) {
        this.packetHeader = packetHeader;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
    

}