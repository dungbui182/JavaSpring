package com.bxd.pojo;

import com.bxd.pojo.Khoaluan;
import com.bxd.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-14T12:40:36")
@StaticMetamodel(Hoidong.class)
public class Hoidong_ { 

    public static volatile SetAttribute<Hoidong, Khoaluan> khoaluanSet;
    public static volatile SingularAttribute<Hoidong, String> tenhoidong;
    public static volatile SingularAttribute<Hoidong, Date> ngaylap;
    public static volatile SingularAttribute<Hoidong, Integer> id;
    public static volatile SetAttribute<Hoidong, User> userSet;

}