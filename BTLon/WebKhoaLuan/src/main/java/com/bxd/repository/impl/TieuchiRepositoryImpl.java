/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.repository.impl;

import com.bxd.pojo.Tieuchi;
import com.bxd.repository.TieuchiRepository;
import com.bxd.repository.UserRepository;
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
public class TieuchiRepositoryImpl implements TieuchiRepository {

    @Autowired
    private LocalSessionFactoryBean factory;
    @Autowired
    private Environment env;
    @Autowired
    private UserRepository userRepo;

    @Override
    public List<Tieuchi> getTieuchi() {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM Tieuchi");
        return q.getResultList();

    }

    @Override
    public boolean addTieuchi(Tieuchi t) {
        Session s = factory.getObject().getCurrentSession();
        try {
            if (t.getId() == null) {
                t.setIdgiaovu(null);
                s.save(t);
            }
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return false;
        }

    }
}
