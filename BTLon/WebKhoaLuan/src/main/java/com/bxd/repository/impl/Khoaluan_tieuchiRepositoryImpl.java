/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.repository.impl;

import com.bxd.pojo.KhoaluanTieuchi;
import com.bxd.repository.Khoaluan_tieuchiRepository;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author MR.DUNG
 */
@Repository
@PropertySource("classpath:configs.properties")
@Transactional
public class Khoaluan_tieuchiRepositoryImpl implements Khoaluan_tieuchiRepository {

    @Autowired
    private LocalSessionFactoryBean factory;
    @Autowired
    private Environment env;

    @Override
    public List<KhoaluanTieuchi> getKhoaluanTieuchi() {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM KhoaluanTieuchi");
        return q.getResultList();
    }

    @Override
    public boolean addKhoaluanTieuchi(KhoaluanTieuchi kt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
