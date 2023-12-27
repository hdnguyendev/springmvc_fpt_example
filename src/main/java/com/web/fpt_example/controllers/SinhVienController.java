package com.web.fpt_example.controllers;

import com.web.fpt_example.models.*;
import com.web.fpt_example.services.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sinhvien")
public class SinhVienController {
    @Autowired
    SinhVienService sinhVienService;
    @Autowired
    TruongService truongService;
    @Autowired
    NganhService nganhService;
    @Autowired
    TotNghiepService totNghiepService;
    @Autowired
    CongViecService congViecService;

    @GetMapping("")
    public String sinhvienList(Model model) {
        List<SinhVien> sinhvienList = sinhVienService.getAllSinhVien();
        model.addAttribute("sinhvienList", sinhvienList);
        return "sinhvien/sinhvien-list";
    }

    @GetMapping("/sinhvien-add")
    public String sinhvienAddForm(Model model) {
        SinhVien sinhvien = new SinhVien();
        model.addAttribute("sinhvien", sinhvien);
        return "sinhvien/sinhvien-add";
    }

    @PostMapping("/sinhvien-add")
    public String addSinhVien(@ModelAttribute("sinhvien") SinhVien sinhvien) {
        sinhVienService.addSinhVien(sinhvien);
        return "redirect:/sinhvien";
    }

    @GetMapping("/{sinhvienId}")
    public String detailSinhVien(@PathVariable("sinhvienId") String maSV,
                                 Model model) {
        SinhVien sinhVien = sinhVienService.findSinhVienById(maSV);
        model.addAttribute("sinhvien", sinhVien);
        model.addAttribute("congviecList", sinhVien.getCongViecList());
        model.addAttribute("totnghiepList", sinhVien.getTotNghiepList());
        return "sinhvien/sinhvien-detail";
    }
    @GetMapping("/{sinhvienId}/totnghiep-add")
    public String addTotNghiepForSinhVienForm(@PathVariable("sinhvienId") String maSV,
                                 Model model) {
        TotNghiep totNghiep = new TotNghiep();
        SinhVien sinhVien = sinhVienService.findSinhVienById(maSV);
        List<Nganh> nganhList = nganhService.getAllNganh();
        List<Truong> truongList = truongService.getAllTruong();
        model.addAttribute("sinhvien", sinhVien);
        model.addAttribute("totnghiep", totNghiep);
        model.addAttribute("nganhList", nganhList);
        model.addAttribute("truongList", truongList);
        return "sinhvien/sinhvien-add-totnghiep";
    }

    @PostMapping("/{sinhvienId}/totnghiep-add")
    public String saveTotNghiepForSinhVien(@PathVariable("sinhvienId") String maSV,
                                           @Valid  @ModelAttribute("totnghiep") TotNghiep totNghiep,
                                           BindingResult result,
                                           Model model) {
        SinhVien sinhVien = sinhVienService.findSinhVienById(maSV);
        totNghiep.setSinhVien(sinhVien);
        totNghiep.getSinhVien().setTotNghiepList(null);
        totNghiep.getSinhVien().setCongViecList(null);
        totNghiep.getNganh().setTotNghiepList(null);
        totNghiep.getNganh().setCongViecList(null);
        totNghiep.getTruong().setTotNghiepList(null);

        List<Nganh> nganhList = nganhService.getAllNganh();
        List<Truong> truongList = truongService.getAllTruong();

        if (result.hasErrors()) {
            model.addAttribute("nganhList", nganhList);
            model.addAttribute("truongList", truongList);
            model.addAttribute("sinhvien", sinhVien);
            model.addAttribute("totnghiep", totNghiep);
            return "sinhvien/sinhvien-add-totnghiep";
        }

        totNghiepService.addTotNghiep(totNghiep);

        return "redirect:/sinhvien/{sinhvienId}";
    }
    @GetMapping("/{sinhvienId}/congviec-add")
    public String addCongViecForSinhVienForm(@PathVariable("sinhvienId") String maSV,
                                              Model model) {
        CongViec congViec = new CongViec();
        SinhVien sinhVien = sinhVienService.findSinhVienById(maSV);
        List<Nganh> nganhList = nganhService.getAllNganh();
        model.addAttribute("sinhvien", sinhVien);
        model.addAttribute("congviec", congViec);
        model.addAttribute("nganhList", nganhList);
        return "sinhvien/sinhvien-add-congviec";
    }

    @PostMapping("/{sinhvienId}/congviec-add")
    public String saveCongViecForSinhVien(@PathVariable("sinhvienId") String maSV,
                                           @Valid  @ModelAttribute("congviec") CongViec congViec,
                                           BindingResult result,
                                           Model model) {
        SinhVien sinhVien = sinhVienService.findSinhVienById(maSV);
        congViec.setSinhVien(sinhVien);
        congViec.getSinhVien().setCongViecList(null);
        congViec.getSinhVien().setCongViecList(null);
        congViec.getNganh().setCongViecList(null);
        congViec.getNganh().setCongViecList(null);

        List<Nganh> nganhList = nganhService.getAllNganh();

        if (result.hasErrors()) {
            model.addAttribute("nganhList", nganhList);
            model.addAttribute("sinhvien", sinhVien);
            model.addAttribute("congviec", congViec);
            return "sinhvien/sinhvien-add-totnghiep";
        }

        congViecService.addCongViec(congViec);

        return "redirect:/sinhvien/{sinhvienId}";
    }
}
