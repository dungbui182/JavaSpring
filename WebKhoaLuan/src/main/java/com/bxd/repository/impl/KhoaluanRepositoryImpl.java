/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.repository.impl;

import com.bxd.pojo.Khoaluan;
import com.bxd.repository.KhoaluanRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.HibernateException;
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
public class KhoaluanRepositoryImpl implements KhoaluanRepository {

    @Autowired
    private LocalSessionFactoryBean factory;
     @Autowired
    private Environment env;

    @Override
    public List<Khoaluan> getKhoaluan() {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM Khoaluan");
        return q.getResultList();
    }
     public List<Khoaluan> getKhoaluanbyHoidong(String id) {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM Khoaluan where"+id);
        return q.getResultList();
    }

    @Override
    public boolean addKhoaluan(Khoaluan k) {
        Session s = factory.getObject().getCurrentSession();
        try {
            if (k.getId() == null) {
                s.save(k);
            }
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return false;
        }
    }

 }

