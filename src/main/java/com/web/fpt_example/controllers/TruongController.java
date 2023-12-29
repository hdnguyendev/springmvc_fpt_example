package com.web.fpt_example.controllers;

import com.web.fpt_example.models.Truong;
import com.web.fpt_example.services.TruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/truong")
public class TruongController {

    @Autowired
    TruongService truongService;

    @GetMapping("")
    public String truongList(Model model) {
        List<Truong> truongList = truongService.getAllTruong();
        model.addAttribute("truongList", truongList);
        return "truong/truong-list";
    }

    @GetMapping("/truong-add")
    public String truongAddForm(Model model) {
        Truong truong = new Truong();
        model.addAttribute("truong", truong);
        return "truong/truong-add";
    }

    @PostMapping("/truong-add")
    public String addTruong(@ModelAttribute("truong") Truong truong) {
        truongService.addTruong(truong);
        return "redirect:/truong";
    }

    @GetMapping("/{maTruong}/update")
    public String updateTruongForm(@PathVariable("maTruong") String maTruong, Model model) {
        Truong truong = truongService.findTruongById(maTruong);
        model.addAttribute("truong", truong);
        return "truong/truong-update";
    }
    @PostMapping("/{maTruong}/update")
    public String updateTruong(@PathVariable("maTruong") String maTruong,
                               @ModelAttribute("truong") Truong truong,
                               Model model) {
        truongService.updateTruong(truong);
        return "redirect:/truong";
    }

    @GetMapping("/{maTruong}/delete")
    public String delTruong(@PathVariable("maTruong") String maTruong) {
        truongService.delTruongById(maTruong);
        return "redirect:/truong";
    }

}
