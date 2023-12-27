package com.web.fpt_example.controllers;

import com.web.fpt_example.models.Nganh;
import com.web.fpt_example.models.Truong;
import com.web.fpt_example.services.NganhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/nganh")
public class NganhController {

    @Autowired
    NganhService nganhService;


    @GetMapping("")
    public String nganhList(Model model) {
        List<Nganh> nganhList = nganhService.getAllNganh();
        model.addAttribute("nganhList", nganhList);
        return "nganh/nganh-list";
    }

    @GetMapping("/nganh-add")
    public String nganhAddForm(Model model) {
        Nganh nganh = new Nganh();
        model.addAttribute("nganh", nganh);
        return "nganh/nganh-add";
    }

    @PostMapping("/nganh-add")
    public String addTruong(@ModelAttribute("nganh") Nganh nganh) {
        nganhService.addNganh(nganh);
        return "redirect:/nganh";
    }
}
