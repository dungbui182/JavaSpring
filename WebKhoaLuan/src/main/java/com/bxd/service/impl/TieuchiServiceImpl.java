/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.service.impl;

import com.bxd.pojo.Tieuchi;
import com.bxd.repository.TieuchiRepository;
import com.bxd.service.TieuchiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MR.DUNG
 */
@Service
public class TieuchiServiceImpl implements TieuchiService{
    @Autowired 
    private TieuchiRepository tieuchiRepo;

    @Override
    public List<Tieuchi> getTieuchi() {
        return this.tieuchiRepo.getTieuchi();
    }

    @Override
    public boolean addTieuchi(Tieuchi t) {
        return this.tieuchiRepo.addTieuchi(t);
    }
    
}
