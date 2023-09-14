/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.service.impl;

import com.bxd.pojo.Hoidong;
import com.bxd.repository.HoidongRepository;
import com.bxd.service.HoidongService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MR.DUNG
 */
@Service
public class HoidongServiceImpl implements HoidongService {

    @Autowired
    private HoidongRepository hoidongRepo;

    @Override
    public List<Hoidong> getHoidong() {
        return this.hoidongRepo.getHoidong();
    }

    @Override
    public boolean addHoidong(Hoidong h) {
         Date date = new Date();
        h.setNgaylap(date);
          return this.hoidongRepo.addHoidong(h);
    }

}
