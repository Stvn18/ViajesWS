/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author wilver
 */
@Table()
@Entity()
public class FlightTcket extends GenericEntity {
    
    private static final long serialVersionUID = 7082404985039687326L;
    
    @ManyToOne()
    private Flight flight;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFlight;
    
    public FlightTcket() {
    }

    public FlightTcket(Flight flight, Date dateFlight) {
        this.flight = flight;
        this.dateFlight = dateFlight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Date getDateFlight() {
        return dateFlight;
    }

    public void setDateFlight(Date dateFlight) {
        this.dateFlight = dateFlight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.flight);
        hash = 41 * hash + Objects.hashCode(this.dateFlight);
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
        final FlightTcket other = (FlightTcket) obj;
        if (!Objects.equals(this.flight, other.flight)) {
            return false;
        }
        return Objects.equals(this.dateFlight, other.dateFlight);
    }

    @Override
    public String toString() {
        return "FlightTcket{" + "flight=" + flight + ", dateFlight=" + dateFlight + '}';
    }
    
}
