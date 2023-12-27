package com.web.fpt_example.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Truong {

    @Id
    private String maTruong;
    private String tenTruong;
    private String diaChi;
    private String soDT;
    @OneToMany(mappedBy = "truong", cascade = CascadeType.ALL)
    private List<TotNghiep> totNghiepList = new ArrayList<>();
}
