/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.pojo;

import java.io.Serializable;
import java.util.Set;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MR.DUNG
 */
@Entity
@Table(name = "tieuchi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tieuchi.findAll", query = "SELECT t FROM Tieuchi t"),
    @NamedQuery(name = "Tieuchi.findById", query = "SELECT t FROM Tieuchi t WHERE t.id = :id"),
    @NamedQuery(name = "Tieuchi.findByTentieuchi", query = "SELECT t FROM Tieuchi t WHERE t.tentieuchi = :tentieuchi")})
public class Tieuchi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "tentieuchi")
    private String tentieuchi;
    @OneToMany(mappedBy = "idTC")
    private Set<KhoaluanTieuchi> khoaluanTieuchiSet;
    @JoinColumn(name = "idgiaovu", referencedColumnName = "id")
    @ManyToOne
    private User idgiaovu;

    public Tieuchi() {
    }

    public Tieuchi(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTentieuchi() {
        return tentieuchi;
    }

    public void setTentieuchi(String tentieuchi) {
        this.tentieuchi = tentieuchi;
    }

    @XmlTransient
    public Set<KhoaluanTieuchi> getKhoaluanTieuchiSet() {
        return khoaluanTieuchiSet;
    }

    public void setKhoaluanTieuchiSet(Set<KhoaluanTieuchi> khoaluanTieuchiSet) {
        this.khoaluanTieuchiSet = khoaluanTieuchiSet;
    }

    public User getIdgiaovu() {
        return idgiaovu;
    }

    public void setIdgiaovu(User idgiaovu) {
        this.idgiaovu = idgiaovu;
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
        if (!(object instanceof Tieuchi)) {
            return false;
        }
        Tieuchi other = (Tieuchi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bxd.pojo.Tieuchi[ id=" + id + " ]";
    }
    
}
