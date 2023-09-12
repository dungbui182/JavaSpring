/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.service.impl;

import com.bxd.pojo.KhoaluanTieuchi;
import com.bxd.repository.Khoaluan_tieuchiRepository;
import com.bxd.service.Khoaluan_tieuchiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MR.DUNG
 */
@Service
public class Khoaluan_tieuchiServiceImpl implements Khoaluan_tieuchiService{
    @Autowired
    private Khoaluan_tieuchiRepository kltcRepo;
    

    @Override
    public List<KhoaluanTieuchi> getKhoaluanTieuchi() {
  return this.kltcRepo.getKhoaluanTieuchi();    }

    @Override
    public boolean addKhoaluanTieuchi(KhoaluanTieuchi kt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
