/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

/**
 *
 * @author wilver
 */
public enum ProductType {

    VUELO(1, "Vuelos"), HOTEL(2, "Hoteles"), CRUCERO(3, "Cruceros"), CARRO(4, "Carros");

    private final int id;
    private final String description;

    private ProductType(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
}
