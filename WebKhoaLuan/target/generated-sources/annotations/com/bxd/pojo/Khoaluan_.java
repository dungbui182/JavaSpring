package com.bxd.pojo;

import com.bxd.pojo.Diemkhoaluan;
import com.bxd.pojo.Hoidong;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-14T12:40:36")
@StaticMetamodel(Khoaluan.class)
public class Khoaluan_ { 

    public static volatile SingularAttribute<Khoaluan, Date> ngay;
    public static volatile SingularAttribute<Khoaluan, Double> dtb;
    public static volatile SingularAttribute<Khoaluan, Integer> id;
    public static volatile SingularAttribute<Khoaluan, String> ten;
    public static volatile SingularAttribute<Khoaluan, String> mota;
    public static volatile SingularAttribute<Khoaluan, Hoidong> mahoidong;
    public static volatile SetAttribute<Khoaluan, Diemkhoaluan> diemkhoaluanSet;

}