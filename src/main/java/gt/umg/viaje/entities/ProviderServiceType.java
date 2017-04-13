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
import javax.persistence.Table;

/**
 *
 * @author steven.vargas
 */

/**
 * 
 * Esta entidad contendra el tipo de servicio que prestara el proveedor
 * por ejemplo, Hoteleria, Vuelo, Crucero, Vehiculo
 */

@Entity()
@Table()
public class ProviderServiceType implements java.io.Serializable{

    private static final long serialVersionUID = 3386490605831866998L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String serviceTypeName;
    
    private boolean active;

    public ProviderServiceType() {
    }

    public ProviderServiceType(Integer id, String serviceTypeName, boolean active) {
        this.id = id;
        this.serviceTypeName = serviceTypeName;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
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
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.serviceTypeName);
        hash = 97 * hash + (this.active ? 1 : 0);
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
        final ProviderServiceType other = (ProviderServiceType) obj;
        if (this.active != other.active) {
            return false;
        }
        if (!Objects.equals(this.serviceTypeName, other.serviceTypeName)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ProviderServiceType{" + "id=" + id + ", serviceTypeName=" + serviceTypeName + ", active=" + active + '}';
    }
    
}