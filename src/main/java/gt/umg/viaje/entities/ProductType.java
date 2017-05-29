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
public class ProductType extends GenericEntity {

    private static final long serialVersionUID = 6182111738210939152L;
    
    private String name;

    public ProductType() {
    }

    public ProductType(String name) {
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
        return "ProductType{" + "name=" + name + '}';
    }
    
}
