/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author wilver
 */
@Table()
@Entity()
public class FlightPreferredClass extends GenericEntity {

    private static final long serialVersionUID = 274114460332170611L;
    
    private String name;

    public FlightPreferredClass() {
    }

    public FlightPreferredClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FlightPreferredClass{" + "name=" + name + '}';
    }
    
}
