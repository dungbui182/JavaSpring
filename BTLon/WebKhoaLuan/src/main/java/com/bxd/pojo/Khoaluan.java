/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MR.DUNG
 */
@Entity
@Table(name = "khoaluan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khoaluan.findAll", query = "SELECT k FROM Khoaluan k"),
    @NamedQuery(name = "Khoaluan.findById", query = "SELECT k FROM Khoaluan k WHERE k.id = :id"),
    @NamedQuery(name = "Khoaluan.findByTen", query = "SELECT k FROM Khoaluan k WHERE k.ten = :ten"),
    @NamedQuery(name = "Khoaluan.findByNgay", query = "SELECT k FROM Khoaluan k WHERE k.ngay = :ngay"),
    @NamedQuery(name = "Khoaluan.findByDtb", query = "SELECT k FROM Khoaluan k WHERE k.dtb = :dtb"),
    @NamedQuery(name = "Khoaluan.findByMota", query = "SELECT k FROM Khoaluan k WHERE k.mota = :mota")})
public class Khoaluan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "ten")
    private String ten;
    @Column(name = "ngay")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngay;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dtb")
    private Double dtb;
    @Size(max = 500)
    @Column(name = "mota")
    private String mota;
    @JoinColumn(name = "mahoidong", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnore
    private Hoidong mahoidong;

    public Khoaluan() {
    }

    public Khoaluan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public Double getDtb() {
        return dtb;
    }

    public void setDtb(Double dtb) {
        this.dtb = dtb;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Hoidong getMahoidong() {
        return mahoidong;
    }

    public void setMahoidong(Hoidong mahoidong) {
        this.mahoidong = mahoidong;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khoaluan)) {
            return false;
        }
        Khoaluan other = (Khoaluan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bxd.pojo.Khoaluan[ id=" + id + " ]";
    }
    
}
