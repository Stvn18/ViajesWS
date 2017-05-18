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

@Entity()
@Table()
public class CruiseDetail implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String countryDestination;
    
    private String departureMonth;
    
    private String description;
    
    private Float price;
    
    private Integer availability;
    
    private String promotions;
    
    private Boolean active;

    public CruiseDetail() {
    }

    public CruiseDetail(Integer id, String countryDestination, String departureMonth, String description, Float price, Integer availability, String promotions, Boolean active) {
        this.id = id;
        this.countryDestination = countryDestination;
        this.departureMonth = departureMonth;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.promotions = promotions;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryDestination() {
        return countryDestination;
    }

    public void setCountryDestination(String countryDestination) {
        this.countryDestination = countryDestination;
    }

    public String getDepartureMonth() {
        return departureMonth;
    }

    public void setDepartureMonth(String departureMonth) {
        this.departureMonth = departureMonth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public String getPromotions() {
        return promotions;
    }

    public void setPromotions(String promotions) {
        this.promotions = promotions;
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
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.countryDestination);
        hash = 19 * hash + Objects.hashCode(this.departureMonth);
        hash = 19 * hash + Objects.hashCode(this.description);
        hash = 19 * hash + Objects.hashCode(this.price);
        hash = 19 * hash + Objects.hashCode(this.availability);
        hash = 19 * hash + Objects.hashCode(this.promotions);
        hash = 19 * hash + Objects.hashCode(this.active);
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
        final CruiseDetail other = (CruiseDetail) obj;
        if (!Objects.equals(this.countryDestination, other.countryDestination)) {
            return false;
        }
        if (!Objects.equals(this.departureMonth, other.departureMonth)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.promotions, other.promotions)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.availability, other.availability)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CruiseDetail{" + "id=" + id + ", countryDestination=" + countryDestination + ", departureMonth=" + departureMonth + ", description=" + description + ", price=" + price + ", availability=" + availability + ", promotions=" + promotions + ", active=" + active + '}';
    }
    
}