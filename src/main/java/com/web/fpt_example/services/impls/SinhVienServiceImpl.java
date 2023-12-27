package com.web.fpt_example.services.impls;

import com.web.fpt_example.models.SinhVien;
import com.web.fpt_example.repositories.SinhVienRepository;
import com.web.fpt_example.services.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    @Autowired
    SinhVienRepository sinhVienRepository;
    @Override
    public List<SinhVien> getAllSinhVien() {
        return sinhVienRepository.findAll();
    }

    @Override
    public SinhVien addSinhVien(SinhVien sinhvien) {
        return sinhVienRepository.save(sinhvien);
    }

    @Override
    public SinhVien findSinhVienById(String maSV) {
        return sinhVienRepository.findById(maSV).get();
    }
}
