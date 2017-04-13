/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Steven
 */

/**
 * 
 * Esta entidad contendra los campos adicionales para registrar el tipo de pago
 * por ejemplo, El tipo de Pago Credito/Debito Visa contendra los campos adicionales
 * como el codigo de seguridad de la tarjeta, el numero de tarjeta, fecha de vencimiento, etc.
 */

@Entity()
@Table()
public class PaymentTypeInfo implements java.io.Serializable {

    private static final long serialVersionUID = 2550873404896283724L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String cardholderName;
    
    private String cardNumber;
    
    private Integer month;
    
    private Integer year;
    
    private String securityCode;
    
    private String emailAddress;
    
    private Boolean active;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn()
    private PaymentType paymentType;

    public PaymentTypeInfo() {
    }

    public PaymentTypeInfo(Integer id, String cardholderName, String cardNumber, Integer month, Integer year, String securityCode, String emailAddress, Boolean active, PaymentType paymentType) {
        this.id = id;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.month = month;
        this.year = year;
        this.securityCode = securityCode;
        this.emailAddress = emailAddress;
        this.active = active;
        this.paymentType = paymentType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.cardholderName);
        hash = 97 * hash + Objects.hashCode(this.cardNumber);
        hash = 97 * hash + Objects.hashCode(this.month);
        hash = 97 * hash + Objects.hashCode(this.year);
        hash = 97 * hash + Objects.hashCode(this.securityCode);
        hash = 97 * hash + Objects.hashCode(this.emailAddress);
        hash = 97 * hash + Objects.hashCode(this.active);
        hash = 97 * hash + Objects.hashCode(this.paymentType);
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
        final PaymentTypeInfo other = (PaymentTypeInfo) obj;
        if (!Objects.equals(this.cardholderName, other.cardholderName)) {
            return false;
        }
        if (!Objects.equals(this.cardNumber, other.cardNumber)) {
            return false;
        }
        if (!Objects.equals(this.securityCode, other.securityCode)) {
            return false;
        }
        if (!Objects.equals(this.emailAddress, other.emailAddress)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.month, other.month)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        if (!Objects.equals(this.paymentType, other.paymentType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaymentTypeInfo{" + "id=" + id + ", cardholderName=" + cardholderName + ", cardNumber=" + cardNumber + ", month=" + month + ", year=" + year + ", securityCode=" + securityCode + ", emailAddress=" + emailAddress + ", active=" + active + ", paymentType=" + paymentType + '}';
    }
    
        
}