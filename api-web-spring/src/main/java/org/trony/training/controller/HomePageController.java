package org.trony.training.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * La home page de l'API
 */
@RestController
@RequestMapping(value = "/trony")
public class HomePageController {
    @RequestMapping(value = "/p")
    public String product(Model model) {
        model.addAttribute("title","<h1>DD school</h1>");
        model.addAttribute("product","<h1>Hello Mister DD</h1>");
        return "home.html";
    }
}
