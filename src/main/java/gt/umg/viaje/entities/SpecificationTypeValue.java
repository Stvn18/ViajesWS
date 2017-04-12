/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author wilver
 */
@Entity()
@Table()
public class SpecificationTypeValue implements java.io.Serializable {

    private static final long serialVersionUID = -4245311821043099198L;
    
    @Id()
    private Integer id;
    
    private String specificationValue;
    
    @ManyToOne()
    @JoinColumn()
    private SpecificationType specificationType;
    
    private boolean active;

    public SpecificationTypeValue() {
    }

    public SpecificationTypeValue(Integer id, String specificationValue, SpecificationType specificationType, boolean active) {
        this.id = id;
        this.specificationValue = specificationValue;
        this.specificationType = specificationType;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecificationValue() {
        return specificationValue;
    }

    public void setSpecificationValue(String specificationValue) {
        this.specificationValue = specificationValue;
    }

    public SpecificationType getSpecificationType() {
        return specificationType;
    }

    public void setSpecificationType(SpecificationType specificationType) {
        this.specificationType = specificationType;
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
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.specificationValue);
        hash = 67 * hash + Objects.hashCode(this.specificationType);
        hash = 67 * hash + (this.active ? 1 : 0);
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
        final SpecificationTypeValue other = (SpecificationTypeValue) obj;
        if (this.active != other.active) {
            return false;
        }
        if (!Objects.equals(this.specificationValue, other.specificationValue)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.specificationType, other.specificationType);
    }

    @Override
    public String toString() {
        return "SpecificationTypeValue{" + "id=" + id + ", specificationValue=" + specificationValue + ", specificationType=" + specificationType + ", active=" + active + '}';
    }
    
}
