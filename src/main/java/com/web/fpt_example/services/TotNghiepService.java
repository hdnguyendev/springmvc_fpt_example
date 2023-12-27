package com.web.fpt_example.services;

import com.web.fpt_example.models.TotNghiep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TotNghiepService {
    TotNghiep addTotNghiep(TotNghiep totNghiep);

    List<TotNghiep> findAllTotNghiep();
}
