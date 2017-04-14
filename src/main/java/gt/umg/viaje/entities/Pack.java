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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author steven.vargas
 */

/**
 * 
 * Esta entidad contendra el encabezado de los paquetes que esté escogiendo el cliente
 */

@Entity()
@Table()
public class Pack implements java.io.Serializable {

    private static final long serialVersionUID = 1080937740027706302L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
    private Float total;
    
    private Integer adults;
    
    private Integer children;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDeparting;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReturning;
    
    private boolean active;

    public Pack() {
    }

    public Pack(Integer id, Date createdAt, Float total, Integer adults, Integer children, Date dateDeparting, Date dateReturning, boolean active) {
        this.id = id;
        this.createdAt = createdAt;
        this.total = total;
        this.adults = adults;
        this.children = children;
        this.dateDeparting = dateDeparting;
        this.dateReturning = dateReturning;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Date getDateDeparting() {
        return dateDeparting;
    }

    public void setDateDeparting(Date dateDeparting) {
        this.dateDeparting = dateDeparting;
    }

    public Date getDateReturning() {
        return dateReturning;
    }

    public void setDateReturning(Date dateReturning) {
        this.dateReturning = dateReturning;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.createdAt);
        hash = 23 * hash + Objects.hashCode(this.total);
        hash = 23 * hash + Objects.hashCode(this.adults);
        hash = 23 * hash + Objects.hashCode(this.children);
        hash = 23 * hash + Objects.hashCode(this.dateDeparting);
        hash = 23 * hash + Objects.hashCode(this.dateReturning);
        hash = 23 * hash + (this.active ? 1 : 0);
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
        final Pack other = (Pack) obj;
        if (this.active != other.active) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.createdAt, other.createdAt)) {
            return false;
        }
        if (!Objects.equals(this.total, other.total)) {
            return false;
        }
        if (!Objects.equals(this.adults, other.adults)) {
            return false;
        }
        if (!Objects.equals(this.children, other.children)) {
            return false;
        }
        if (!Objects.equals(this.dateDeparting, other.dateDeparting)) {
            return false;
        }
        if (!Objects.equals(this.dateReturning, other.dateReturning)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pack{" + "id=" + id + ", createdAt=" + createdAt + ", total=" + total + ", adults=" + adults + ", children=" + children + ", dateDeparting=" + dateDeparting + ", dateReturning=" + dateReturning + ", active=" + active + '}';
    }

    
}