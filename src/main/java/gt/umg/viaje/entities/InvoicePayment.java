/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author wilver
 */
@Table()
@Entity()
public class InvoicePayment extends GenericEntity {

    private static final long serialVersionUID = -635411106425782732L;
    
    @ManyToOne()
    private PaymentType paymentType;
    
    private String cardNumber;
    
    private String cardholderName;
    
    private String securityCode;

    public InvoicePayment() {
    }

    public InvoicePayment(PaymentType paymentType, String cardNumber, String cardholderName, String securityCode) {
        this.paymentType = paymentType;
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
        this.securityCode = securityCode;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public String toString() {
        return "InvoicePayment{" + "paymentType=" + paymentType + ", cardNumber=" + cardNumber + ", cardholderName=" + cardholderName + ", securityCode=" + securityCode + '}';
    }
    
}
