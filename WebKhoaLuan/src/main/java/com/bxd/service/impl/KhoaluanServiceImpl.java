/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.service.impl;

import java.time.LocalDateTime;
import com.bxd.pojo.Khoaluan;
import com.bxd.repository.KhoaluanRepository;
import com.bxd.service.KhoaluanService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MR.DUNG
 */
@Service
public class KhoaluanServiceImpl implements KhoaluanService {

    @Autowired
    KhoaluanRepository khoaluanRepo;

    @Override
    public boolean addKhoaluan(Khoaluan k) {

        Date date = new Date();
        k.setNgay(date);
        k.setDtb(0.0);
        return this.khoaluanRepo.addKhoaluan(k);
    }

    @Override
    public List<Khoaluan> getKhoaluan() {
        return this.khoaluanRepo.getKhoaluan();
    }

    @Override
    public List<Khoaluan> getKhoaluanbyHoidong(String id) {
              return this.khoaluanRepo.getKhoaluanbyHoidong(id);
    }

}
