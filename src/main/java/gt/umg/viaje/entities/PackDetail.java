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
 * Esta entidad contiene el detalle del paquete que eligio el cliente, por ejemplo,
 * contendra los descuentos, subtotales, servicios que escogio,etc.
 */

@Entity()
@Table()
public class PackDetail implements java.io.Serializable{

    private static final long serialVersionUID = 5658208408155758051L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn()
    private Pack pack;
    
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn()
//    private ProviderService providerDetail;
    
    private Float total;
    
    private Float discount;
    
    private boolean active;

    public PackDetail() {
    }

    public PackDetail(Integer id, Pack pack,  Float total, Float discount, boolean active) {
        this.id = id;
        this.pack = pack;
//        this.providerDetail = providerDetail;
        this.total = total;
        this.discount = discount;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

//    public ProviderService getProviderDetail() {
//        return providerDetail;
//    }
//
//    public void setProviderDetail(ProviderService providerDetail) {
//        this.providerDetail = providerDetail;
//    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.pack);
//        hash = 41 * hash + Objects.hashCode(this.providerDetail);
        hash = 41 * hash + Objects.hashCode(this.total);
        hash = 41 * hash + Objects.hashCode(this.discount);
        return 41 * hash + Objects.hashCode(this.active);
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
        final PackDetail other = (PackDetail) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pack, other.pack)) {
            return false;
        }
//        if (!Objects.equals(this.providerDetail, other.providerDetail)) {
//            return false;
//        }
        if (!Objects.equals(this.total, other.total)) {
            return false;
        }
        if (!Objects.equals(this.discount, other.discount)) {
            return false;
        }
        return Objects.equals(this.active, other.active);
    }

    @Override
    public String toString() {
        return "PackDetail{" + "id=" + id + ", pack=" + pack + ", total=" + total + ", discount=" + discount + ", active=" + active + '}';
    }
    
}