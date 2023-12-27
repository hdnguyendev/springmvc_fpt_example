package com.web.fpt_example.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
@IdClass(TotNghiepId.class)
public class TotNghiepId implements Serializable {
    private SinhVien sinhVien;
    private Truong truong;
    private Nganh nganh;

}
