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
 * @author wilver
 */
@Entity()
@Table()
public class HotelReservation implements java.io.Serializable{

    private static final long serialVersionUID = -3867626654090954544L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateIn;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOut;
    
    @ManyToOne()
    @JoinColumn()
    private HotelDetail hotelDetail;

    public HotelReservation() {
    }

    public HotelReservation(Integer id, Date dateIn, Date dateOut, HotelDetail hotelDetail) {
        this.id = id;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.hotelDetail = hotelDetail;
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

    public HotelDetail getHotelDetail() {
        return hotelDetail;
    }

    public void setHotelDetail(HotelDetail hotelDetail) {
        this.hotelDetail = hotelDetail;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.dateIn);
        hash = 11 * hash + Objects.hashCode(this.dateOut);
        hash = 11 * hash + Objects.hashCode(this.hotelDetail);
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
        final HotelReservation other = (HotelReservation) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateIn, other.dateIn)) {
            return false;
        }
        if (!Objects.equals(this.dateOut, other.dateOut)) {
            return false;
        }
        return Objects.equals(this.hotelDetail, other.hotelDetail);
    }

    @Override
    public String toString() {
        return "HotelReservation{" + "id=" + id + ", dateIn=" + dateIn + ", dateOut=" + dateOut + ", hotelDetail=" + hotelDetail + '}';
    }
    
}
