/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Steven
 */

@Entity()
public class Flight implements java.io.Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String placa;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<FlightDetail> flightDetails;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private FlightClass flightClass;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Airline> airlines;
    
    private Float price;
    
    private Boolean active;

    public Flight() {
    }

    public Flight(Integer id, String placa, List<FlightDetail> flightDetails, FlightClass flightClass, List<Airline> airlines, Float price, Boolean active) {
        this.id = id;
        this.placa = placa;
        this.flightDetails = flightDetails;
        this.flightClass = flightClass;
        this.airlines = airlines;
        this.price = price;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<FlightDetail> getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(List<FlightDetail> flightDetails) {
        this.flightDetails = flightDetails;
    }

    public FlightClass getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(FlightClass flightClass) {
        this.flightClass = flightClass;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
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
  
}