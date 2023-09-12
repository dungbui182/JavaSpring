/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.repository.impl;

import com.bxd.pojo.User;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.bxd.repository.UserRepository;
import org.hibernate.HibernateException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author MR.DUNG
 */
@Repository
@PropertySource("classpath:configs.properties")
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private LocalSessionFactoryBean factory;
    @Autowired
    private Environment env;
    
     @Autowired
    private BCryptPasswordEncoder passEncoder;

    @Override
    public List<User> getUser() {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM User");
        return q.getResultList();
    }

    @Override
    public List<User> getUserGV() {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM User where chucvu='giang vien'");
        return q.getResultList();
    }

    @Override
    public boolean addUser(User u) {
        Session s = factory.getObject().getCurrentSession();
        try {
            if (u.getId() == null) {
                s.save(u);
            }
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return false;
        }
    }
//     @Override
//    public boolean addUser(User u) {
//        Session s = factory.getObject().getCurrentSession();
////        try {
////            if (u.getId() == null) {
//                s.save(u);
////            }
////            return true;
////        } catch (HibernateException ex) {
////            ex.printStackTrace();
////            return false;
////        }
//    return false;
//    }

    @Override
    public boolean UpdateUser(User u) {
        Session s = factory.getObject().getCurrentSession();
        try {
            if (u.getId() == null) {
                s.update(u);
            }
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public User getUserbyId(int id) {
        Session s = factory.getObject().getCurrentSession();
        return s.get(User.class, id);
    }
    
     @Override
    public boolean authUser(String username, String password) {
        User u = this.getUserByUsername(username);

        return this.passEncoder.matches(password, u.getPassword());
    }

    @Override
    public boolean deleteUser(int id) {
        Session s = factory.getObject().getCurrentSession();
        try {
            User u = this.getUserbyId(id);
            s.delete(u);
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public User getUserByUsername(String username) {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("From User Where username=:un");
        q.setParameter("un", username);

        return (User) q.getSingleResult();

    }

}
