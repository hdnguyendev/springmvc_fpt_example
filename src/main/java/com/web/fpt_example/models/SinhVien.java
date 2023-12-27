package com.web.fpt_example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class SinhVien {
    @Id
    private String maSV;
    private String hoVaTen;
    private String email;
    private String soDT;
    private String diaChi;


    @OneToMany(mappedBy = "sinhVien", cascade = CascadeType.ALL)
    private List<TotNghiep>  totNghiepList = new ArrayList<>();
    @OneToMany(mappedBy = "sinhVien", cascade = CascadeType.ALL)
    private List<CongViec>  congViecList = new ArrayList<>();

}
