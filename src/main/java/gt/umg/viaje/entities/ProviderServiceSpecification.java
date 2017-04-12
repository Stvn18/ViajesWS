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

@Entity()
@Table()
public class ProviderServiceSpecification implements java.io.Serializable {

    private static final long serialVersionUID = -8830996328193991438L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne()
    @JoinColumn()
    private SpecificationTypeValue specificationTypeValue;

    public ProviderServiceSpecification() {
    }

    public ProviderServiceSpecification(Integer id, SpecificationTypeValue specificationTypeValue) {
        this.id = id;
        this.specificationTypeValue = specificationTypeValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SpecificationTypeValue getSpecificationTypeValue() {
        return specificationTypeValue;
    }

    public void setSpecificationTypeValue(SpecificationTypeValue specificationTypeValue) {
        this.specificationTypeValue = specificationTypeValue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.specificationTypeValue);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.specificationTypeValue, other.specificationTypeValue);
    }

    @Override
    public String toString() {
        return "ProviderServiceSpecificationValue{" + "id=" + id + ", specificationTypeValue=" + specificationTypeValue + '}';
    }
    
}