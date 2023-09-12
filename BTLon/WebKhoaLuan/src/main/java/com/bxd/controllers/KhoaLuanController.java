/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.controllers;

import com.bxd.pojo.Khoaluan;
import com.bxd.pojo.User;
import com.bxd.service.KhoaluanService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author MR.DUNG
 */
@Controller
public class KhoaLuanController {
    @Autowired
    private KhoaluanService khoaluanSer;
     
    @GetMapping("/khoaluan")
    public String list1(Model model) {
        model.addAttribute("khoaluan", this.khoaluanSer.getKhoaluan());
        return "khoaluan";
    }
    
    
    @GetMapping("/addkhoaluan")
    public String list(Model model) {
        model.addAttribute("khoaluan", new Khoaluan());
        return "addkhoaluan";
    }
    
       
    @PostMapping("/addkhoaluan")
    public  String add(@ModelAttribute(value = "khoaluan")@Valid Khoaluan k, BindingResult rs ){
        if (!rs.hasErrors())
            if (khoaluanSer.addKhoaluan(k) == true)
                return "redirect:/";
        return "addkhoaluan";
    }
}
