package com.web.fpt_example.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(TotNghiepId.class)
public class TotNghiep {
    @Id
    @ManyToOne
    @JoinColumn(name = "maSV", nullable = false)
    private SinhVien sinhVien;
    @Id
    @ManyToOne
    @JoinColumn(name = "maTruong", nullable = false)
    private Truong truong;
    @Id
    @ManyToOne
    @JoinColumn(name = "maNganh", nullable = false)
    private Nganh nganh;
    @NotEmpty(message = "Hệ tốt nghiệp không được để trống")
    private String heTN;
    @NotEmpty(message = "Ngày tốt nghiệp không được để trống")
    private String ngayTN;
    @NotEmpty(message = "Loại tốt nghiệp không được để trống")
    private String loaiTN;

}
