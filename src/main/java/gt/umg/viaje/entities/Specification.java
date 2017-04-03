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
public class Specification implements java.io.Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String characteristic;
    
    private String value;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn()
    private ServiceType serviceType;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn()
    private SpecificationType specificationType;
    
    private Boolean active;

    public Specification() {
    }

    public Specification(Integer id, String characteristic, String value, ServiceType serviceType, SpecificationType specificationType, Boolean active) {
        this.id = id;
        this.characteristic = characteristic;
        this.value = value;
        this.serviceType = serviceType;
        this.specificationType = specificationType;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public SpecificationType getSpecificationType() {
        return specificationType;
    }

    public void setSpecificationType(SpecificationType specificationType) {
        this.specificationType = specificationType;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.characteristic);
        hash = 83 * hash + Objects.hashCode(this.value);
        hash = 83 * hash + Objects.hashCode(this.serviceType);
        hash = 83 * hash + Objects.hashCode(this.specificationType);
        hash = 83 * hash + Objects.hashCode(this.active);
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
        final Specification other = (Specification) obj;
        if (!Objects.equals(this.characteristic, other.characteristic)) {
            return false;
        }
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.serviceType, other.serviceType)) {
            return false;
        }
        if (!Objects.equals(this.specificationType, other.specificationType)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Specification{" + "id=" + id + ", characteristic=" + characteristic + ", value=" + value + ", serviceType=" + serviceType + ", specificationType=" + specificationType + ", active=" + active + '}';
    }
 
}