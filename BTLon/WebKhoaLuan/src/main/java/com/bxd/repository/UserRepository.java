/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bxd.repository;

import com.bxd.pojo.User;
import java.util.List;


/**
 *
 * @author MR.DUNG
 */
public interface UserRepository {
    List<User> getUser();
        List<User> getUserGV();

    boolean addUser(User u);
    boolean UpdateUser(User u);
    User getUserbyId(int id);
    
    boolean authUser(String username, String password);
    public boolean deleteUser(int id);
    User getUserByUsername(String username);
  
}
