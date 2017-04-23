/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author steven.vargas
 */

@Entity()
@Table()
public class ProviderServiceSpecification implements java.io.Serializable {
    
    private static final long serialVersionUID = -8830996328193991438L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne()
    private SpecificationType specificationType;
    
    private String specificationValue;
    
    @ManyToOne()
    private ProviderService providerService;
    
    public ProviderServiceSpecification() {
    }

    public ProviderServiceSpecification(Integer id, SpecificationType specificationType, String specificationValue, ProviderService providerService) {
        this.id = id;
        this.specificationType = specificationType;
        this.specificationValue = specificationValue;
        this.providerService = providerService;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SpecificationType getSpecificationType() {
        return specificationType;
    }

    public void setSpecificationType(SpecificationType specificationType) {
        this.specificationType = specificationType;
    }

    public String getSpecificationValue() {
        return specificationValue;
    }

    public void setSpecificationValue(String specificationValue) {
        this.specificationValue = specificationValue;
    }

    public ProviderService getProviderService() {
        return providerService;
    }

    public void setProviderService(ProviderService providerService) {
        this.providerService = providerService;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.specificationType);
        hash = 11 * hash + Objects.hashCode(this.specificationValue);
        hash = 11 * hash + Objects.hashCode(this.providerService);
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
        final ProviderServiceSpecification other = (ProviderServiceSpecification) obj;
        if (!Objects.equals(this.specificationValue, other.specificationValue)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.specificationType, other.specificationType)) {
            return false;
        }
        return Objects.equals(this.providerService, other.providerService);
    }

    @Override
    public String toString() {
        return "ProviderServiceSpecification{" + "id=" + id + ", specificationType=" + specificationType + ", SpecificationValue=" + specificationValue + ", providerService=" + providerService + '}';
    }
    
}