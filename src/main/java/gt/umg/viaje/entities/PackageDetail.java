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

/**
 *
 * @author steven.vargas
 */

@Entity()
public class PackageDetail implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn()
    private Package packD;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn()
    private ProviderDetail providerDetail;
    
    private Float total;
    
    private Float discount;
    
    private Boolean active;

    public PackageDetail() {
    }

    public PackageDetail(Integer id, Package packD, ProviderDetail providerDetail, Float total, Float discount, Boolean active) {
        this.id = id;
        this.packD = packD;
        this.providerDetail = providerDetail;
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

    public Package getPackD() {
        return packD;
    }

    public void setPackD(Package packD) {
        this.packD = packD;
    }

    public ProviderDetail getProviderDetail() {
        return providerDetail;
    }

    public void setProviderDetail(ProviderDetail providerDetail) {
        this.providerDetail = providerDetail;
    }

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.packD);
        hash = 41 * hash + Objects.hashCode(this.providerDetail);
        hash = 41 * hash + Objects.hashCode(this.total);
        hash = 41 * hash + Objects.hashCode(this.discount);
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
        final PackageDetail other = (PackageDetail) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.packD, other.packD)) {
            return false;
        }
        if (!Objects.equals(this.providerDetail, other.providerDetail)) {
            return false;
        }
        if (!Objects.equals(this.total, other.total)) {
            return false;
        }
        if (!Objects.equals(this.discount, other.discount)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PackageDetail{" + "id=" + id + ", packD=" + packD + ", providerDetail=" + providerDetail + ", total=" + total + ", discount=" + discount + ", active=" + active + '}';
    }
    
}