/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MR.DUNG
 */
@Entity
@Table(name = "hoidong")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoidong.findAll", query = "SELECT h FROM Hoidong h"),
    @NamedQuery(name = "Hoidong.findById", query = "SELECT h FROM Hoidong h WHERE h.id = :id"),
    @NamedQuery(name = "Hoidong.findByTenhoidong", query = "SELECT h FROM Hoidong h WHERE h.tenhoidong = :tenhoidong"),
    @NamedQuery(name = "Hoidong.findByNgaylap", query = "SELECT h FROM Hoidong h WHERE h.ngaylap = :ngaylap")})
public class Hoidong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "tenhoidong")
    private String tenhoidong;
    @Column(name = "ngaylap")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaylap;
    @JsonIgnore
    @OneToMany(mappedBy = "mahoidong")
    private Set<Khoaluan> khoaluanSet;
        @JsonIgnore
    @OneToMany(mappedBy = "idHD")
    private Set<User> userSet;

    public Hoidong() {
    }

    public Hoidong(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenhoidong() {
        return tenhoidong;
    }

    public void setTenhoidong(String tenhoidong) {
        this.tenhoidong = tenhoidong;
    }

    public Date getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(Date ngaylap) {
        this.ngaylap = ngaylap;
    }

    @XmlTransient
    public Set<Khoaluan> getKhoaluanSet() {
        return khoaluanSet;
    }

    public void setKhoaluanSet(Set<Khoaluan> khoaluanSet) {
        this.khoaluanSet = khoaluanSet;
    }

    @XmlTransient
    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
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
        if (!(object instanceof Hoidong)) {
            return false;
        }
        Hoidong other = (Hoidong) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bxd.pojo.Hoidong[ id=" + id + " ]";
    }
    
}
