/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.controllers;

import com.bxd.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author MR.DUNG
 */

@Controller
public class KhoaluandiemController {
    
    @GetMapping("/khoaluandiem")
    public String list() {
        return "khoaluandiem";
    }
    
}
