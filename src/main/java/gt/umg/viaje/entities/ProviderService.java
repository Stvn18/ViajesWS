/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author steven.vargas
 */

/**
 * 
 * Esta entidad contiene los servicios que el proveedor prestara a la compañia
 * contiene los nombres de los servicios a detalle, contiene especificaciones del
 * servicio, precio, tipo de Servicio, etc
 */

@Entity()
@Table()
public class ProviderService implements java.io.Serializable {

    private static final long serialVersionUID = -4336778875662789727L;

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne()
    @JoinColumn()
    private Provider provider;
    
    private String serviceName;

    @ManyToOne()
    @JoinColumn()
    private ProviderServiceType providerServiceType;

    private Float price;
    
    @ManyToOne()
    private Location location;
    
    private boolean active;

    public ProviderService() {
    }

    public ProviderService(Integer id, Provider provider, String serviceName, ProviderServiceType providerServiceType, Float price, boolean active) {
        this.id = id;
        this.provider = provider;
        this.serviceName = serviceName;
        this.providerServiceType = providerServiceType;
        this.price = price;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ProviderServiceType getProviderServiceType() {
        return providerServiceType;
    }

    public void setProviderServiceType(ProviderServiceType providerServiceType) {
        this.providerServiceType = providerServiceType;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.provider);
        hash = 29 * hash + Objects.hashCode(this.serviceName);
        hash = 29 * hash + Objects.hashCode(this.providerServiceType);
        hash = 29 * hash + Objects.hashCode(this.price);
        hash = 29 * hash + Objects.hashCode(this.location);
        hash = 29 * hash + (this.active ? 1 : 0);
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
        final ProviderService other = (ProviderService) obj;
        if (this.active != other.active) {
            return false;
        }
        if (!Objects.equals(this.serviceName, other.serviceName)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.provider, other.provider)) {
            return false;
        }
        if (!Objects.equals(this.providerServiceType, other.providerServiceType)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return Objects.equals(this.location, other.location);
    }

    @Override
    public String toString() {
        return "ProviderService{" + "id=" + id + ", provider=" + provider + ", serviceName=" + serviceName + ", providerServiceType=" + providerServiceType + ", price=" + price + ", location=" + location + ", active=" + active + '}';
    }
    
}
