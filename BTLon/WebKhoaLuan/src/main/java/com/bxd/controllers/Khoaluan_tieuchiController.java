/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.controllers;

import com.bxd.pojo.KhoaluanTieuchi;
import com.bxd.pojo.Tieuchi;
import com.bxd.service.Khoaluan_tieuchiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author MR.DUNG
 */
@Controller
public class Khoaluan_tieuchiController {
    
    @Autowired
    private Khoaluan_tieuchiService kltcSer;
    
      @GetMapping("/khoaluan_tieuchi")
    public String list(Model model) {
        model.addAttribute("kltc", new KhoaluanTieuchi());
        model.addAttribute("kltc1", this.kltcSer.getKhoaluanTieuchi());
        return "khoaluan_tieuchi";
    }
    
}
