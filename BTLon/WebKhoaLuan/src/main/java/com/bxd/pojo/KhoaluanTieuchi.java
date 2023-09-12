/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.pojo;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MR.DUNG
 */
@Entity
@Table(name = "khoaluan_tieuchi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KhoaluanTieuchi.findAll", query = "SELECT k FROM KhoaluanTieuchi k"),
    @NamedQuery(name = "KhoaluanTieuchi.findById", query = "SELECT k FROM KhoaluanTieuchi k WHERE k.id = :id"),
    @NamedQuery(name = "KhoaluanTieuchi.findByDiem", query = "SELECT k FROM KhoaluanTieuchi k WHERE k.diem = :diem")})
public class KhoaluanTieuchi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "diem")
    private Double diem;
    @JoinColumn(name = "idKL", referencedColumnName = "id")
    @ManyToOne
    private Khoaluan idKL;
    @JoinColumn(name = "idTC", referencedColumnName = "id")
    @ManyToOne
    private Tieuchi idTC;
    @JoinColumn(name = "idGV", referencedColumnName = "id")
    @ManyToOne
    private User idGV;

    public KhoaluanTieuchi() {
    }

    public KhoaluanTieuchi(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public Khoaluan getIdKL() {
        return idKL;
    }

    public void setIdKL(Khoaluan idKL) {
        this.idKL = idKL;
    }

    public Tieuchi getIdTC() {
        return idTC;
    }

    public void setIdTC(Tieuchi idTC) {
        this.idTC = idTC;
    }

    public User getIdGV() {
        return idGV;
    }

    public void setIdGV(User idGV) {
        this.idGV = idGV;
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
        if (!(object instanceof KhoaluanTieuchi)) {
            return false;
        }
        KhoaluanTieuchi other = (KhoaluanTieuchi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bxd.pojo.KhoaluanTieuchi[ id=" + id + " ]";
    }
    
}
