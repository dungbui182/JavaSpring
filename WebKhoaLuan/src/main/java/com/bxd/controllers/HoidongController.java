/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.controllers;

import com.bxd.pojo.Hoidong;
import com.bxd.pojo.Khoaluan;
import com.bxd.repository.HoidongRepository;
import com.bxd.service.HoidongService;
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
public class HoidongController {

    @Autowired
    private HoidongService hoidongSer;

    @GetMapping("/addhoidong")
    public String list(Model model) {
        model.addAttribute("hoidong", new Hoidong());
        model.addAttribute("hoidong1", this.hoidongSer.getHoidong());
        return "addhoidong";
    }

    
    @PostMapping("/addhoidong")
    public String add(@ModelAttribute(value = "hoidong") @Valid Hoidong h, BindingResult rs) {
        if (!rs.hasErrors())
            if (hoidongSer.addHoidong(h) == true) 
                return "redirect:/";
        return "/addhoidong";
    }
}
