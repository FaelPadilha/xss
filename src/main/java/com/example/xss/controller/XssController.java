package com.example.xss.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class XssController {

    @GetMapping(value = "/")
    public String test(@RequestParam(value = "language", required = false) String language, Model model) {
        model.addAttribute("language", language);
        return "index";
    }
}