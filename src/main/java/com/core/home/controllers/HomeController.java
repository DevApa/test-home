package com.core.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"","/"})
    public String index(Model model) {
        model.addAttribute("titulo","Spring");
        model.addAttribute("descripcion","Dola desde Spring Boot");
        return "index";
    }
}
