/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author steven.vargas
 */

/**
 * 
 * Esta entidad contendra el tipo de pago con que el cliente realizara su pago,
 * ejemplo sería, tipo de pago: Efectivo, Tarjeta Credito/Debito, PayPal, Bitcoins, Etc
 */

@Entity()
@Table()
public class PaymentType extends GenericEntity {

    private static final long serialVersionUID = -231391740474990969L;
    
    private String paymentTypeName;

    public PaymentType() {
    }

    public PaymentType(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    @Override
    public String toString() {
        return "PaymentType{" + "paymentTypeName=" + paymentTypeName + '}';
    }
    
}