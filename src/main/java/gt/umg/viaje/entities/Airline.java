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
public class Airline extends GenericEntity {
    
    private static final long serialVersionUID = -1645354166055880271L;
    
    private String name;

    public Airline() {
    }

    public Airline(String name, boolean active) {
        this.name = name;
        super.setActive(active);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airline{" + "name=" + name + '}';
    }
    
}
