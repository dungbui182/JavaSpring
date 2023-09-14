/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bxd.service;

import com.bxd.pojo.Khoaluan;
import java.util.List;

/**
 *
 * @author MR.DUNG
 */
public interface KhoaluanService {
        List<Khoaluan> getKhoaluan();
        List<Khoaluan> getKhoaluanbyHoidong(String id);

     public boolean addKhoaluan(Khoaluan k);

}
