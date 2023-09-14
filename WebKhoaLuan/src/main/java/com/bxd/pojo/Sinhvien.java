/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "sinhvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sinhvien.findAll", query = "SELECT s FROM Sinhvien s"),
    @NamedQuery(name = "Sinhvien.findByMssv", query = "SELECT s FROM Sinhvien s WHERE s.mssv = :mssv"),
    @NamedQuery(name = "Sinhvien.findByTen", query = "SELECT s FROM Sinhvien s WHERE s.ten = :ten"),
    @NamedQuery(name = "Sinhvien.findByNganh", query = "SELECT s FROM Sinhvien s WHERE s.nganh = :nganh"),
    @NamedQuery(name = "Sinhvien.findByEmail", query = "SELECT s FROM Sinhvien s WHERE s.email = :email"),
    @NamedQuery(name = "Sinhvien.findByIdkhoaluan", query = "SELECT s FROM Sinhvien s WHERE s.idkhoaluan = :idkhoaluan")})
public class Sinhvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mssv")
    private Integer mssv;
    @Size(max = 50)
    @Column(name = "ten")
    private String ten;
    @Size(max = 50)
    @Column(name = "nganh")
    private String nganh;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "idkhoaluan")
    private int idkhoaluan;

    public Sinhvien() {
    }

    public Sinhvien(Integer mssv) {
        this.mssv = mssv;
    }

    public Sinhvien(Integer mssv, int idkhoaluan) {
        this.mssv = mssv;
        this.idkhoaluan = idkhoaluan;
    }

    public Integer getMssv() {
        return mssv;
    }

    public void setMssv(Integer mssv) {
        this.mssv = mssv;
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

    public int getIdkhoaluan() {
        return idkhoaluan;
    }

    public void setIdkhoaluan(int idkhoaluan) {
        this.idkhoaluan = idkhoaluan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mssv != null ? mssv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sinhvien)) {
            return false;
        }
        Sinhvien other = (Sinhvien) object;
        if ((this.mssv == null && other.mssv != null) || (this.mssv != null && !this.mssv.equals(other.mssv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bxd.pojo.Sinhvien[ mssv=" + mssv + " ]";
    }
    
}
