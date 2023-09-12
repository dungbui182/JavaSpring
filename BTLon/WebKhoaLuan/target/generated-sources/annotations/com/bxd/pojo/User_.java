package com.bxd.pojo;

import com.bxd.pojo.Hoidong;
import com.bxd.pojo.KhoaluanTieuchi;
import com.bxd.pojo.Tieuchi;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-12T17:07:20")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SetAttribute<User, Tieuchi> tieuchiSet;
    public static volatile SingularAttribute<User, String> img;
    public static volatile SetAttribute<User, Hoidong> hoidongSet;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> chucvu;
    public static volatile SetAttribute<User, KhoaluanTieuchi> khoaluanTieuchiSet;
    public static volatile SetAttribute<User, Hoidong> hoidongSet2;
    public static volatile SetAttribute<User, Hoidong> hoidongSet1;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> ten;
    public static volatile SingularAttribute<User, String> nganh;
    public static volatile SingularAttribute<User, String> userRole;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}