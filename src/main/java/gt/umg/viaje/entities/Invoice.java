/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author steven.vargas
 */
/**
 *
 * Esta entidad es el encabezado de la factura en las ventas que se realizan.
 */
@Entity()
@Table()
public class Invoice extends GenericEntity {

    private static final long serialVersionUID = 23256028518132415L;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    private Float total;
    
    @Enumerated(EnumType.ORDINAL)
    private PaymentType paymentType;
    
    private String cardNumber;
    
    private String cardholderName;
    
    private String securityCode;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "invoice_id")
    @Fetch(FetchMode.SUBSELECT)
    private List<InvoiceDetail> detail = new ArrayList();

    public Invoice() {
    }

    public Invoice(User user, Float total, PaymentType paymentType, String cardNumber, String cardholderName, String securityCode) {
        this.user = user;
        this.total = total;
        this.paymentType = paymentType;
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
        this.securityCode = securityCode;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
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

    public List<InvoiceDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<InvoiceDetail> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Invoice{" + "user=" + user + ", total=" + total + ", paymentType=" + paymentType + ", cardNumber=" + cardNumber + ", cardholderName=" + cardholderName + ", securityCode=" + securityCode + ", detail=" + detail + '}';
    }
    
}
