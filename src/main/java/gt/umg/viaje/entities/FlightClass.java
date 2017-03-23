/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Steven
 */

@Entity()
public class FlightClass implements java.io.Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String description;
    
    private String category;
    
    private Float extra;
    
    private Boolean active;

    public FlightClass() {
    }

    public FlightClass(Integer id, String description, String category, Float extra, Boolean active) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.extra = extra;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getExtra() {
        return extra;
    }

    public void setExtra(Float extra) {
        this.extra = extra;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
     
}