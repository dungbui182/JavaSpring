/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bxd.repository;

import com.bxd.pojo.Hoidong;

import java.util.List;

/**
 *
 * @author MR.DUNG
 */
public interface HoidongRepository {
    List<Hoidong> getHoidong();
     boolean addHoidong(Hoidong h);
    
}
