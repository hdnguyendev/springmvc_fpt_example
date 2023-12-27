package com.web.fpt_example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(CongViecId.class)
public class CongViec {

    @Id
    @ManyToOne
    @JoinColumn(name = "maSV", nullable = false)
    private SinhVien sinhVien;

    @Id
    private String ngayVaoCT;

    @ManyToOne
    @JoinColumn(name = "maNganh", nullable = false)
    private Nganh nganh;

    private String tenCV;
    private String tenCT;
    private String diaChiCT;
    private double thoiGianLamViec;


}
