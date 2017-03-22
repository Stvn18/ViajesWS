/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Steven
 */
@Entity()
public class CompanyDetail implements java.io.Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Company company;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Hotel hotel;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Flight flight;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Vehicle vehicle;
    
    @Temporal(TemporalType.DATE)
    private Date date;
    
    private Boolean active;

    public CompanyDetail() {
    }

    public CompanyDetail(Integer id, Company company, Hotel hotel, Flight flight, Vehicle vehicle, Date date, Boolean active) {
        this.id = id;
        this.company = company;
        this.hotel = hotel;
        this.flight = flight;
        this.vehicle = vehicle;
        this.date = date;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
    
}