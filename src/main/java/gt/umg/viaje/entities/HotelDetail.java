/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author steven.vargas
 */
@Entity()
@Table()
public class HotelDetail implements java.io.Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    private Date dateIn;

    @Temporal(TemporalType.DATE)
    private Date dateOut;

    private Integer childrens;

    private Integer adults;

    private Integer bedrooms;

    private String description;
    
    private Float price;

    private Boolean active;
    
    @ManyToOne()
    @JoinColumn()
    private Hotel hotel;

    public HotelDetail() {
    }

    public HotelDetail(Integer id, Date dateIn, Date dateOut, Integer childrens, Integer adults, Integer bedrooms, String description, Float price, Boolean active) {
        this.id = id;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.childrens = childrens;
        this.adults = adults;
        this.bedrooms = bedrooms;
        this.description = description;
        this.price = price;
        this.active = active;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Integer getChildrens() {
        return childrens;
    }

    public void setChildrens(Integer childrens) {
        this.childrens = childrens;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.dateIn);
        hash = 37 * hash + Objects.hashCode(this.dateOut);
        hash = 37 * hash + Objects.hashCode(this.childrens);
        hash = 37 * hash + Objects.hashCode(this.adults);
        hash = 37 * hash + Objects.hashCode(this.bedrooms);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.price);
        hash = 37 * hash + Objects.hashCode(this.active);
        hash = 37 * hash + Objects.hashCode(this.hotel);
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
        final HotelDetail other = (HotelDetail) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateIn, other.dateIn)) {
            return false;
        }
        if (!Objects.equals(this.dateOut, other.dateOut)) {
            return false;
        }
        if (!Objects.equals(this.childrens, other.childrens)) {
            return false;
        }
        if (!Objects.equals(this.adults, other.adults)) {
            return false;
        }
        if (!Objects.equals(this.bedrooms, other.bedrooms)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        if (!Objects.equals(this.hotel, other.hotel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HotelDetail{" + "id=" + id + ", dateIn=" + dateIn + ", dateOut=" + dateOut + ", childrens=" + childrens + ", adults=" + adults + ", bedrooms=" + bedrooms + ", description=" + description + ", price=" + price + ", active=" + active + ", hotel=" + hotel + '}';
    }
    
}