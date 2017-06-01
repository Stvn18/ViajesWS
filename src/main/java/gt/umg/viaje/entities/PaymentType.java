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
public enum PaymentType {
    
    VISA(1, "Visa"), MASTERCARD(2, "Mastercard"), AMERICAN_EXPRESS(3, "American express"), VISA_ELECTRON(4, "Visa electron");

    private final int id;
    private final String description;

    private PaymentType(int id, String description) {
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
