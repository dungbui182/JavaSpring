package com.bxd.pojo;

import com.bxd.pojo.Diemkhoaluan;
import com.bxd.pojo.Hoidong;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-14T12:40:36")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> img;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> chucvu;
    public static volatile SingularAttribute<User, String> vaitroHD;
    public static volatile SingularAttribute<User, Hoidong> idHD;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> ten;
    public static volatile SingularAttribute<User, String> nganh;
    public static volatile SingularAttribute<User, String> userRole;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SetAttribute<User, Diemkhoaluan> diemkhoaluanSet;
    public static volatile SingularAttribute<User, String> username;

}