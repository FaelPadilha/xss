package com.example.xss.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class XssController {

    @GetMapping(value = "/")
    public String testInvasao(@RequestParam(value = "language", required = false) String language, Model model) {
        model.addAttribute("language", language);
        return "index";
    }

    @GetMapping(value = "/protection")
    public String testProtecao(@RequestParam(value = "language", required = false) String language, Model model) {
        model.addAttribute("language", language);
        return "protect";
    }
}