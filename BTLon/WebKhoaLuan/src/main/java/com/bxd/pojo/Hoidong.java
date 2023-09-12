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
@Table(name = "hoidong")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoidong.findAll", query = "SELECT h FROM Hoidong h"),
    @NamedQuery(name = "Hoidong.findById", query = "SELECT h FROM Hoidong h WHERE h.id = :id"),
    @NamedQuery(name = "Hoidong.findByTenhoidong", query = "SELECT h FROM Hoidong h WHERE h.tenhoidong = :tenhoidong")})
public class Hoidong implements Serializable {

    @OneToMany(mappedBy = "mahoidong")
    private Set<Khoaluan> khoaluanSet;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "tenhoidong")
    private String tenhoidong;
    @JoinColumn(name = "idchutich", referencedColumnName = "id")
    @ManyToOne
    private User idchutich;
    @JoinColumn(name = "idthuky", referencedColumnName = "id")
    @ManyToOne
    private User idthuky;
    @JoinColumn(name = "idphanbien", referencedColumnName = "id")
    @ManyToOne
    private User idphanbien;

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

    public User getIdchutich() {
        return idchutich;
    }

    public void setIdchutich(User idchutich) {
        this.idchutich = idchutich;
    }

    public User getIdthuky() {
        return idthuky;
    }

    public void setIdthuky(User idthuky) {
        this.idthuky = idthuky;
    }

    public User getIdphanbien() {
        return idphanbien;
    }

    public void setIdphanbien(User idphanbien) {
        this.idphanbien = idphanbien;
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

    @XmlTransient
    public Set<Khoaluan> getKhoaluanSet() {
        return khoaluanSet;
    }

    public void setKhoaluanSet(Set<Khoaluan> khoaluanSet) {
        this.khoaluanSet = khoaluanSet;
    }
    
}
