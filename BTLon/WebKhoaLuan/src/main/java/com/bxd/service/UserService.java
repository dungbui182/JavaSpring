/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bxd.service;

import com.bxd.pojo.User;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author MR.DUNG
 */
public interface UserService extends UserDetailsService {

    List<User> getUser();
    List<User> getUserGV();

    public boolean addUser(User u);
    public boolean UpdateUser(User u);

        boolean authUser(String username, String password);


    public User getUserbyId(int id);

    public boolean deleteUser(int id);
    public User getUserByUsername(String username);

}
