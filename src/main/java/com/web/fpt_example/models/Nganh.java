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
public class Nganh {
    @Id
    private String maNganh;
    private String tenNganh;
    private String loaiNganh;

    @OneToMany(mappedBy = "nganh", cascade = CascadeType.ALL)
    private List<CongViec> congViecList = new ArrayList<>();
    @OneToMany(mappedBy = "nganh", cascade = CascadeType.ALL)
    private List<TotNghiep> totNghiepList = new ArrayList<>();
}
