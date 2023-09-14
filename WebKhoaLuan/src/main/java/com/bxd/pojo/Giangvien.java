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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MR.DUNG
 */
@Entity
@Table(name = "giangvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giangvien.findAll", query = "SELECT g FROM Giangvien g"),
    @NamedQuery(name = "Giangvien.findById", query = "SELECT g FROM Giangvien g WHERE g.id = :id"),
    @NamedQuery(name = "Giangvien.findByTen", query = "SELECT g FROM Giangvien g WHERE g.ten = :ten"),
    @NamedQuery(name = "Giangvien.findByNganh", query = "SELECT g FROM Giangvien g WHERE g.nganh = :nganh"),
    @NamedQuery(name = "Giangvien.findByEmail", query = "SELECT g FROM Giangvien g WHERE g.email = :email"),
    @NamedQuery(name = "Giangvien.findByIdhoidong", query = "SELECT g FROM Giangvien g WHERE g.idhoidong = :idhoidong"),
    @NamedQuery(name = "Giangvien.findByMakhoaluan", query = "SELECT g FROM Giangvien g WHERE g.makhoaluan = :makhoaluan")})
public class Giangvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "ten")
    private String ten;
    @Size(max = 45)
    @Column(name = "nganh")
    private String nganh;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idhoidong")
    private int idhoidong;
    @Column(name = "makhoaluan")
    private Integer makhoaluan;

    public Giangvien() {
    }

    public Giangvien(Integer id) {
        this.id = id;
    }

    public Giangvien(Integer id, int idhoidong) {
        this.id = id;
        this.idhoidong = idhoidong;
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

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdhoidong() {
        return idhoidong;
    }

    public void setIdhoidong(int idhoidong) {
        this.idhoidong = idhoidong;
    }

    public Integer getMakhoaluan() {
        return makhoaluan;
    }

    public void setMakhoaluan(Integer makhoaluan) {
        this.makhoaluan = makhoaluan;
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
        if (!(object instanceof Giangvien)) {
            return false;
        }
        Giangvien other = (Giangvien) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bxd.pojo.Giangvien[ id=" + id + " ]";
    }
    
}
