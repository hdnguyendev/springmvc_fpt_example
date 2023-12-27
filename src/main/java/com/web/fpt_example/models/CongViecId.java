package com.web.fpt_example.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.IdClass;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
@IdClass(CongViecId.class)
public class CongViecId implements Serializable {
    private SinhVien sinhVien;
    private String ngayVaoCT;
}
