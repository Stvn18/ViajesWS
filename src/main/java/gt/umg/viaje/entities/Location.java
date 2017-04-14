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
 * Esta entidad contendra los paises (aeropuertos) de origen y destino que mostrara en los filtros
 * al momento que empiecen a realizar su paquete
 */

@Entity()
@Table()
public class Location implements java.io.Serializable {

    private static final long serialVersionUID = 4605288689310238084L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String locationName;
    
    private String graphicCoordinates;
    
    private boolean active;

    public Location() {
    }
    
    public Location(Integer id, String locationName, String graphicCoordinates, boolean active) {
        this.id = id;
        this.locationName = locationName;
        this.graphicCoordinates = graphicCoordinates;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getGraphicCoordinates() {
        return graphicCoordinates;
    }

    public void setGraphicCoordinates(String graphicCoordinates) {
        this.graphicCoordinates = graphicCoordinates;
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
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.locationName);
        hash = 59 * hash + Objects.hashCode(this.graphicCoordinates);
        hash = 59 * hash + (this.active ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.active != other.active) {
            return false;
        }
        if (!Objects.equals(this.locationName, other.locationName)) {
            return false;
        }
        if (!Objects.equals(this.graphicCoordinates, other.graphicCoordinates)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Location{" + "id=" + id + ", locationName=" + locationName + ", graphicCoordinates=" + graphicCoordinates + ", active=" + active + '}';
    }
    
}
