package com.web.fpt_example.controllers;

import com.web.fpt_example.models.CongViec;
import com.web.fpt_example.repositories.CongViecRepository;
import com.web.fpt_example.services.CongViecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/congviec")
public class CongViecController {
    @Autowired
    CongViecService congViecService;
    @GetMapping("")
    public String congViecList(Model model) {
        List<CongViec> congViecList = congViecService.getAllCongViec();

        model.addAttribute("congviecList", congViecList);
        return "congviec/congviec-list";
    }
}
