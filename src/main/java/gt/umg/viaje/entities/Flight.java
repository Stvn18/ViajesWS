/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
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
public class Flight extends GenericEntity {

    private static final long serialVersionUID = 8077182988314580350L;
    
    @ManyToOne()
    private Location flyingFrom;

    @ManyToOne()
    private Location flyingTo;
    
    @ManyToOne()
    private FlightPreferredClass preferredClass;
    
    @ManyToOne()
    private Airline airline;
    
    private String description;
    
    private Float adultPrice;
    
    private Float childPrice;
    
    private Time departureTime;
    
    private Time arrivalTime;
    
    public Flight() {
    }

    public Flight(Location flyingFrom, Location flyingTo, FlightPreferredClass preferredClass, Airline airline, String description, Float adultPrice, Float childPrice, Time departureTime, Time arrivalTime) {
        this.flyingFrom = flyingFrom;
        this.flyingTo = flyingTo;
        this.preferredClass = preferredClass;
        this.airline = airline;
        this.description = description;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Location getFlyingFrom() {
        return flyingFrom;
    }

    public void setFlyingFrom(Location flyingFrom) {
        this.flyingFrom = flyingFrom;
    }

    public Location getFlyingTo() {
        return flyingTo;
    }

    public void setFlyingTo(Location flyingTo) {
        this.flyingTo = flyingTo;
    }

    public FlightPreferredClass getPreferredClass() {
        return preferredClass;
    }

    public void setPreferredClass(FlightPreferredClass preferredClass) {
        this.preferredClass = preferredClass;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(Float adultPrice) {
        this.adultPrice = adultPrice;
    }

    public Float getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(Float childPrice) {
        this.childPrice = childPrice;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.flyingFrom);
        hash = 79 * hash + Objects.hashCode(this.flyingTo);
        hash = 79 * hash + Objects.hashCode(this.preferredClass);
        hash = 79 * hash + Objects.hashCode(this.airline);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.adultPrice);
        hash = 79 * hash + Objects.hashCode(this.childPrice);
        hash = 79 * hash + Objects.hashCode(this.departureTime);
        hash = 79 * hash + Objects.hashCode(this.arrivalTime);
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
        final Flight other = (Flight) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.flyingFrom, other.flyingFrom)) {
            return false;
        }
        if (!Objects.equals(this.flyingTo, other.flyingTo)) {
            return false;
        }
        if (!Objects.equals(this.preferredClass, other.preferredClass)) {
            return false;
        }
        if (!Objects.equals(this.airline, other.airline)) {
            return false;
        }
        if (!Objects.equals(this.adultPrice, other.adultPrice)) {
            return false;
        }
        if (!Objects.equals(this.childPrice, other.childPrice)) {
            return false;
        }
        if (!Objects.equals(this.departureTime, other.departureTime)) {
            return false;
        }
        return Objects.equals(this.arrivalTime, other.arrivalTime);
    }
    
}
