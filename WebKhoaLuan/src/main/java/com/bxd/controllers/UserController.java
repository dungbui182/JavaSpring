/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bxd.controllers;

import com.bxd.pojo.User;
import com.bxd.service.UserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author MR.DUNG
 */
@Controller
@ControllerAdvice
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @ModelAttribute
    public void commonAttri(Model model) {
        model.addAttribute("usersGV", this.userService.getUserGV());
        model.addAttribute("usersAll", this.userService.getUser());
        

    }

    @GetMapping("/users")
    public String list(Model model) {
        model.addAttribute("user", new User());
        return "users";
    }
     @GetMapping("/suauser")
    public String list2() {
//        model.addAttribute("user", new User());
        return "suauser";
    }
 

    @GetMapping("users/{id}")
    public String update(Model model, @PathVariable(value = "id") int id) {
        model.addAttribute("user", this.userService.getUserbyId(id));
        return "users";

    }
     @GetMapping("suauser/{id}")
    public String update2(Model model, @PathVariable(value = "id") int id) {
        model.addAttribute("user", this.userService.getUserbyId(id));
        return "suauser";

    }

    @PostMapping("/users")
    public String add(@ModelAttribute(value = "user") @Valid User u, BindingResult rs) {
        if (!rs.hasErrors()) {
            if (userService.addUser(u) == true) {
                return "redirect:/";
            }
        }
        return "users";
    }
}
