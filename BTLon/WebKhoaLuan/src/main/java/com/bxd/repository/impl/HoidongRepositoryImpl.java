/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.repository.impl;

import com.bxd.pojo.Hoidong;
import com.bxd.pojo.Khoaluan;
import com.bxd.repository.HoidongRepository;
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
public class HoidongRepositoryImpl implements HoidongRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<Hoidong> getHoidong() {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM Hoidong");
        return q.getResultList();
    }

    @Override
    public boolean addHoidong(Hoidong h) {
        Session s = factory.getObject().getCurrentSession();
        try {
            if (h.getId() == null) {
//                h.setIdchutich(null);
//                h.setIdthuky(null);
//                h.setIdphanbien(null);
                s.save(h);
            }
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
