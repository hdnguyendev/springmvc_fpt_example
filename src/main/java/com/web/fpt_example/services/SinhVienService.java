package com.web.fpt_example.services;

import com.web.fpt_example.models.SinhVien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SinhVienService {
    List<SinhVien> getAllSinhVien();

    SinhVien addSinhVien(SinhVien sinhvien);

    SinhVien findSinhVienById(String maSV);
}
