/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bxd.repository;

import com.bxd.pojo.KhoaluanTieuchi;

import java.util.List;

/**
 *
 * @author MR.DUNG
 */
public interface Khoaluan_tieuchiRepository {
     List<KhoaluanTieuchi> getKhoaluanTieuchi();
     boolean addKhoaluanTieuchi(KhoaluanTieuchi kt);
    
}
