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

@Entity()
@Table()
public class FlightDetail implements java.io.Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String flyingFrom;
    
    private String flyingTo;
    
    @Temporal(TemporalType.DATE)
    private Date departingDate;
    
    @Temporal(TemporalType.DATE)
    private Date returningDate;
    
    private Integer adults;
    
    private Integer childrens;
    
    private String preferredClass;
    
    private String typeFlight;
    
    private String startTime;
    
    private String endTime;
    
    private Boolean active;

    public FlightDetail() {
    }

    public FlightDetail(Integer id, String flyingFrom, String flyingTo, Date departingDate, Date returningDate, Integer adults, Integer childrens, String preferredClass, String typeFlight, String startTime, String endTime, Boolean active) {
        this.id = id;
        this.flyingFrom = flyingFrom;
        this.flyingTo = flyingTo;
        this.departingDate = departingDate;
        this.returningDate = returningDate;
        this.adults = adults;
        this.childrens = childrens;
        this.preferredClass = preferredClass;
        this.typeFlight = typeFlight;
        this.startTime = startTime;
        this.endTime = endTime;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlyingFrom() {
        return flyingFrom;
    }

    public void setFlyingFrom(String flyingFrom) {
        this.flyingFrom = flyingFrom;
    }

    public String getFlyingTo() {
        return flyingTo;
    }

    public void setFlyingTo(String flyingTo) {
        this.flyingTo = flyingTo;
    }

    public Date getDepartingDate() {
        return departingDate;
    }

    public void setDepartingDate(Date departingDate) {
        this.departingDate = departingDate;
    }

    public Date getReturningDate() {
        return returningDate;
    }

    public void setReturningDate(Date returningDate) {
        this.returningDate = returningDate;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getChildrens() {
        return childrens;
    }

    public void setChildrens(Integer childrens) {
        this.childrens = childrens;
    }

    public String getPreferredClass() {
        return preferredClass;
    }

    public void setPreferredClass(String preferredClass) {
        this.preferredClass = preferredClass;
    }

    public String getTypeFlight() {
        return typeFlight;
    }

    public void setTypeFlight(String typeFlight) {
        this.typeFlight = typeFlight;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.flyingFrom);
        hash = 37 * hash + Objects.hashCode(this.flyingTo);
        hash = 37 * hash + Objects.hashCode(this.departingDate);
        hash = 37 * hash + Objects.hashCode(this.returningDate);
        hash = 37 * hash + Objects.hashCode(this.adults);
        hash = 37 * hash + Objects.hashCode(this.childrens);
        hash = 37 * hash + Objects.hashCode(this.preferredClass);
        hash = 37 * hash + Objects.hashCode(this.typeFlight);
        hash = 37 * hash + Objects.hashCode(this.startTime);
        hash = 37 * hash + Objects.hashCode(this.endTime);
        hash = 37 * hash + Objects.hashCode(this.active);
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
        final FlightDetail other = (FlightDetail) obj;
        if (!Objects.equals(this.flyingFrom, other.flyingFrom)) {
            return false;
        }
        if (!Objects.equals(this.flyingTo, other.flyingTo)) {
            return false;
        }
        if (!Objects.equals(this.preferredClass, other.preferredClass)) {
            return false;
        }
        if (!Objects.equals(this.typeFlight, other.typeFlight)) {
            return false;
        }
        if (!Objects.equals(this.startTime, other.startTime)) {
            return false;
        }
        if (!Objects.equals(this.endTime, other.endTime)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.departingDate, other.departingDate)) {
            return false;
        }
        if (!Objects.equals(this.returningDate, other.returningDate)) {
            return false;
        }
        if (!Objects.equals(this.adults, other.adults)) {
            return false;
        }
        if (!Objects.equals(this.childrens, other.childrens)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FlightDetail{" + "id=" + id + ", flyingFrom=" + flyingFrom + ", flyingTo=" + flyingTo + ", departingDate=" + departingDate + ", returningDate=" + returningDate + ", adults=" + adults + ", childrens=" + childrens + ", preferredClass=" + preferredClass + ", typeFlight=" + typeFlight + ", startTime=" + startTime + ", endTime=" + endTime + ", active=" + active + '}';
    }
    
    
}