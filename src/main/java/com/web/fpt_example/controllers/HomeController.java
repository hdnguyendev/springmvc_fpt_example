package com.web.fpt_example.controllers;

import com.web.fpt_example.services.CongViecService;
import com.web.fpt_example.services.SinhVienService;
import com.web.fpt_example.services.TotNghiepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    SinhVienService sinhVienService;
    @Autowired
    TotNghiepService totNghiepService;
    @Autowired
    CongViecService congViecService;
    @GetMapping
    public String home(Model model) {
        List<Integer> data = new ArrayList<>();
        data.add(sinhVienService.getAllSinhVien().size());
        data.add(congViecService.getAllCongViec().size());
        data.add(totNghiepService.findAllTotNghiep().size());

        model.addAttribute("dataChart",data);
        return "home";
    }

}
