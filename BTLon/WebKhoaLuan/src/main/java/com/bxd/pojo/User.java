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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author MR.DUNG
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByChucvu", query = "SELECT u FROM User u WHERE u.chucvu = :chucvu"),
    @NamedQuery(name = "User.findByTen", query = "SELECT u FROM User u WHERE u.ten = :ten"),
    @NamedQuery(name = "User.findByNganh", query = "SELECT u FROM User u WHERE u.nganh = :nganh"),
    @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email"),
    @NamedQuery(name = "User.findByImg", query = "SELECT u FROM User u WHERE u.img = :img"),
    @NamedQuery(name = "User.findByUserRole", query = "SELECT u FROM User u WHERE u.userRole = :userRole")})
public class User implements Serializable {
 
  private static final String USER1 = "ROLE_USER1";
   private static final String USER2 = "ROLE_USER2";
    private static final String USER3 = "ROLE_USER3";


    public static String setRoleUser1() {
        return USER1;
    }  

    public static String setRoleUser2() {
        return USER2;
    }

    public static String setRoleUser3() {
        return USER3;
    }
    
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "username")
    private String username;
    @Size(max = 100)
    @Column(name = "password")
    private String password;
    @Size(max = 45)
    @Column(name = "chucvu")
    private String chucvu;
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
    @Size(max = 255)
    @Column(name = "img")
    private String img;
    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "user_role")
    private String userRole;
     @Transient
    private MultipartFile file;

    @OneToMany(mappedBy = "idGV")
    private Set<KhoaluanTieuchi> khoaluanTieuchiSet;
    @OneToMany(mappedBy = "idgiaovu")
    private Set<Tieuchi> tieuchiSet;
    @OneToMany(mappedBy = "idchutich")
    private Set<Hoidong> hoidongSet;
    @OneToMany(mappedBy = "idthuky")
    private Set<Hoidong> hoidongSet1;
    @OneToMany(mappedBy = "idphanbien")
    private Set<Hoidong> hoidongSet2;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String userRole) {
        this.id = id;
        this.userRole = userRole;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
     public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @XmlTransient
    public Set<KhoaluanTieuchi> getKhoaluanTieuchiSet() {
        return khoaluanTieuchiSet;
    }

    public void setKhoaluanTieuchiSet(Set<KhoaluanTieuchi> khoaluanTieuchiSet) {
        this.khoaluanTieuchiSet = khoaluanTieuchiSet;
    }

    @XmlTransient
    public Set<Tieuchi> getTieuchiSet() {
        return tieuchiSet;
    }

    public void setTieuchiSet(Set<Tieuchi> tieuchiSet) {
        this.tieuchiSet = tieuchiSet;
    }

    @XmlTransient
    public Set<Hoidong> getHoidongSet() {
        return hoidongSet;
    }

    public void setHoidongSet(Set<Hoidong> hoidongSet) {
        this.hoidongSet = hoidongSet;
    }

    @XmlTransient
    public Set<Hoidong> getHoidongSet1() {
        return hoidongSet1;
    }

    public void setHoidongSet1(Set<Hoidong> hoidongSet1) {
        this.hoidongSet1 = hoidongSet1;
    }

    @XmlTransient
    public Set<Hoidong> getHoidongSet2() {
        return hoidongSet2;
    }

    public void setHoidongSet2(Set<Hoidong> hoidongSet2) {
        this.hoidongSet2 = hoidongSet2;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bxd.pojo.User[ id=" + id + " ]";
    }
    
}
