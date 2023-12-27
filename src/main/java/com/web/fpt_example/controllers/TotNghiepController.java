package com.web.fpt_example.controllers;

import com.web.fpt_example.services.TotNghiepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/totnghiep")
public class TotNghiepController {

    @Autowired
    TotNghiepService totNghiepService;

    @GetMapping("")
    public String totnghiepList(Model model) {
    model.addAttribute("totnghiepList", totNghiepService.findAllTotNghiep());
        return "totnghiep/totnghiep-list";
    }
}
