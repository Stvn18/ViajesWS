/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Steven
 */

@Entity()
public class PacketHeader implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<PackageDetail> packageDetail;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    
    private Float total;
    
    private Float discount;
    
    private Boolean active;

    public PacketHeader() {
    }

    public PacketHeader(Integer id, List<PackageDetail> packageDetail, Date dateCreated, Float total, Float discount, Boolean active) {
        this.id = id;
        this.packageDetail = packageDetail;
        this.dateCreated = dateCreated;
        this.total = total;
        this.discount = discount;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<PackageDetail> getPackageDetail() {
        return packageDetail;
    }

    public void setPackageDetail(List<PackageDetail> packageDetail) {
        this.packageDetail = packageDetail;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
       
}