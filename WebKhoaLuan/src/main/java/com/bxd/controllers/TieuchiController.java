/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.controllers;

import com.bxd.pojo.Khoaluan;
import com.bxd.pojo.Tieuchi;
import com.bxd.service.TieuchiService;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author MR.DUNG
 */
@Controller
public class TieuchiController {
     @Autowired
    private TieuchiService tieuchiSer;

    @GetMapping("/addtieuchi")
    public String list(Model model) {
        model.addAttribute("tieuchi", new Tieuchi());
        model.addAttribute("tieuchi1", this.tieuchiSer.getTieuchi());
        return "addtieuchi";
    }
    
    @PostMapping("/addtieuchi")
    public  String add(@ModelAttribute(value = "tieuchi")@Valid Tieuchi t, BindingResult rs ){
        if (!rs.hasErrors())
            if (tieuchiSer.addTieuchi(t) == true)
                return "redirect:/addtieuchi";
        return "addtieuchi";
    }
}
